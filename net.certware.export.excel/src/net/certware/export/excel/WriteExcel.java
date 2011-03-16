package net.certware.export.excel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import net.certware.core.ui.CertWareUI;
import net.certware.core.ui.dialog.ExceptionDetailsDialog;
import net.certware.core.ui.log.CertWareLog;

import org.apache.poi.hssf.usermodel.HSSFBorderFormatting;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.contrib.HSSFRegionUtil;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Header;
import org.apache.poi.ss.util.CellRangeAddress;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.SWTException;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;


/**
 * Writes content to an Excel file.
 * Uses Apache POI library for document construction. 
 * @author mrb
 * @since 1.2.1
 */
public class WriteExcel {

  /** dialog title */
  protected String title = "Write to Excel";
  /** workbook instance */
  private HSSFWorkbook workbook;
  /** workbook sheet */
  private HSSFSheet sheet;
  /** header column style */
  protected HSSFCellStyle headerStyle;
  /** right-justified string style */
  protected HSSFCellStyle stringRightStyle;
  /** number cell style for integers */
  protected HSSFCellStyle intStyle;
  /** number cell style for decimals */
  protected HSSFCellStyle numberStyle;
  /** number double underline style */
  protected HSSFCellStyle numberDoubleUnderlineStyle;
  /** number double underline style */
  protected HSSFCellStyle numberCenterDoubleUnderlineStyle;
  /** number single underline style */
  protected HSSFCellStyle numberSingleUnderlineStyle;
  /** bold text style */
  protected HSSFCellStyle boldTextStyle;
  /** currency style with dollar sign */
  protected HSSFCellStyle moneyStyle;
  /** duration style */
  protected HSSFCellStyle durationStyle;
  /** label double underline style */
  protected HSSFCellStyle labelDoubleUnderlineStyle;
  /** label single underline style */
  protected HSSFCellStyle labelSingleUnderlineStyle;
  /** number centering cell style for decimals */
  protected HSSFCellStyle numberCenterStyle;
  /** number cell style for percentages */
  protected HSSFCellStyle percentStyle;
  /** number centering cell style for percentages */
  protected HSSFCellStyle percentCenterStyle;
  /** label centering style */
  protected HSSFCellStyle labelCenterStyle;
  /** border cell style for headers */
  protected HSSFCellStyle borderStyle;
  /** destination output file name */
  private String destinationFile;
  /** double underline font for style */
  protected Font doubleUnderlineFont;
  /** single underline font for style */
  protected Font singleUnderlineFont;
  /** row number within sheet */
  protected int rowNumber = 0;

  /**
   * Gets the row number.
   * @return row number
   */
  public int getRowNumber()
  {
    return rowNumber;
  }

  /**
   * Sets the row number.
   * @param rowNumber row number
   */
  public void setRowNumber(int rowNumber)
  {
    this.rowNumber = rowNumber;
  }

  /**
   * Gets the sheet row at the current row number.
   * @return sheet row
   */
  public HSSFRow getRow() {
    return sheet.getRow(rowNumber);
  }

  /**
   * Updates the workbench status line with a normal or error message.
   * @param event the execution event for the handler
   * @param message the message string to display
   * @param errorMessage true if shown as an error message, false otherwise
   */
  public void updateStatusLine(ExecutionEvent event, String message, boolean errorMessage) {
	  IStatusLineManager islm;
	try {
		islm = HandlerUtil.getActiveEditorChecked(event).getEditorSite().getActionBars().getStatusLineManager();
	    if ( errorMessage )
	        islm.setErrorMessage(message);
	      else
	        islm.setMessage(message);
	} catch (ExecutionException e) {
		CertWareLog.logWarning("Status line inaccessible");
	}
  }

  /**
   * Returns the current value of the export excel title string preference.
   * @return current value of the export excel title string preference
   */
  public String getTitle() {
    return title;
  }

  /**
   * Convenience method to create a cell and set its string value.
   * @param sheet
   * @param row
   * @param col
   * @param label
   */
  public void writeCellString(HSSFSheet sheet, int row, int col, String label) {
    if ( label == null ) return;
    label = label.replace('/', ' ');
    try {
      sheet.getRow(row).createCell(col).setCellValue(new HSSFRichTextString(label));
    } catch( IllegalArgumentException iae ) {
      System.err.println("Write Excel string: row " + row + " col " + col + " " + iae.getMessage() );
    }
  }

  public void writeCellString(int col, String label) {
    writeCellString(getSheet(),getRowNumber(),col,label);
  }

  /**
   * Convenience method to write a cell with the header style.
   * @param sheet
   * @param row
   * @param col
   * @param label
   */
  public void writeCellHeader(HSSFSheet sheet, int row, int col, String label) {
    if ( label == null ) return;
    label = label.replace('/', ' ');
    HSSFCell cell = sheet.getRow(row).createCell(col);
    cell.setCellValue(new HSSFRichTextString(label));
    cell.setCellStyle(headerStyle);
  }

  public void writeCellHeader(int col, String label) {
    writeCellHeader(getSheet(),getRowNumber(),col,label);
  }


  /**
   * Convenience method to create a cell and set its integer value.
   * @param sheet
   * @param row
   * @param col
   * @param value
   */
  public void writeCellInt(HSSFSheet sheet, int row, int col, int value) {
    HSSFCell cell = sheet.getRow(row).createCell(col);
    cell.setCellValue(value);
    cell.setCellStyle(intStyle);
  }

  public void writeCellInt(int col, int value) {
    writeCellInt(getSheet(),getRowNumber(),col,value);
  }

  /**
   * Convenience method to create a cell and set its number value.
   * @param sheet
   * @param row
   * @param col
   * @param value
   */
  public void writeCellNumber(HSSFSheet sheet, int row, int col, double value) {
    try {
      HSSFCell cell = sheet.getRow(row).createCell(col);
      cell.setCellValue(value);
      cell.setCellStyle(numberStyle);
    } catch( IllegalArgumentException iae ) {
      System.err.println("Write Excel number: row " + row + " col " + col + " " + iae.getMessage() );
    }
  }

  public void writeCellNumber(int col, double value) {
    writeCellNumber(getSheet(),getRowNumber(),col,value);
  }

  /**
   * Convenience method to create a cell and write a number with a given style.
   * @param sheet
   * @param row
   * @param col
   * @param value
   * @param style
   */
  public void writeCellStyle(HSSFSheet sheet, int row, int col, double value, HSSFCellStyle style) {
    try {
      HSSFCell cell = sheet.getRow(row).createCell(col);
      cell.setCellValue(value);
      cell.setCellStyle(style);
    } catch( IllegalArgumentException iae ) {
      System.err.println("Write Excel style: row " + row + " col " + col + " " + iae.getMessage() );
    }
  }

  public void writeCellStyle(int col, double value, HSSFCellStyle style) {
    writeCellStyle(getSheet(),getRowNumber(),col,value,style);
  }

  /**
   * Convenience method to create a cell and write a string with a given style.
   * @param sheet
   * @param row
   * @param col
   * @param value
   * @param style
   */
  public void writeCellStyle(HSSFSheet sheet, int row, int col, String value, HSSFCellStyle style) {
    try {
      if ( value == null ) return;
      value = value.replace('/', ' ');
      HSSFCell cell = sheet.getRow(row).createCell(col);
      cell.setCellValue(value);
      cell.setCellStyle(style);
    } catch( IllegalArgumentException iae ) {
      System.err.println("Write Excel style: row " + row + " col " + col + " " + iae.getMessage() );
    }
  }

  public void writeCellStyle(int col, String value, HSSFCellStyle style) {
    writeCellStyle(getSheet(),getRowNumber(),col,value,style);
  }

  /**
   * Convenience method to create a cell and write an integer with a given style.
   * @param sheet
   * @param row
   * @param col
   * @param value
   * @param style
   */
  public void writeCellStyle(HSSFSheet sheet, int row, int col, int value, HSSFCellStyle style) {
    try {
      HSSFCell cell = sheet.getRow(row).createCell(col);
      cell.setCellValue(value);
      cell.setCellStyle(style);
    } catch( IllegalArgumentException iae ) {
      System.err.println("Write Excel style: row " + row + " col " + col + " " + iae.getMessage() );
    }
  }

  public void writeCellStyle(int col, int value, HSSFCellStyle style) {
    writeCellStyle(getSheet(),getRowNumber(),col,value,style);
  }

  /**
   * Sets the sheet header fields.
   * @param sheet workbook sheet
   * @param left
   * @param center
   * @param right
   */
  public void setHeader(HSSFSheet sheet, String left, String center, String right) {
    Header header = sheet.getHeader();
    header.setLeft(left);
    header.setCenter(center);
    header.setRight(right);
  }


  /*
        sheet.autoSizeColumn(0);
        sheet.autoSizeColumn(1);
   */


  /**
   * Merges the cells in the given region, then adds a border around the same region.
   * @param region cell range
   * @param sheet current workbook sheet
   * @param workbook current workbook
   */
  public void addMergeAndBorder(CellRangeAddress region, HSSFSheet sheet, HSSFWorkbook workbook) {
      sheet.addMergedRegion(region);
    HSSFRegionUtil.setBorderLeft(HSSFBorderFormatting.BORDER_THIN,region,sheet,workbook);
    HSSFRegionUtil.setBorderRight(HSSFBorderFormatting.BORDER_THIN,region,sheet,workbook);
    HSSFRegionUtil.setBorderBottom(HSSFBorderFormatting.BORDER_MEDIUM,region,sheet,workbook);
    HSSFRegionUtil.setBorderTop(HSSFBorderFormatting.BORDER_MEDIUM,region,sheet,workbook);
  }

  public void addMergeAndBorder(CellRangeAddress region) {
    addMergeAndBorder(region,getSheet(),getWorkbook());
  }
  
  /**
   * Merges the cells in the given region.
   * @param region cell range
   * @param sheet current workbook sheet
   * @param workbook current workbook
   */
  public void addMerge(CellRangeAddress region, HSSFSheet sheet, HSSFWorkbook workbook) {
    sheet.addMergedRegion(region);
  }

  public void addMerge(CellRangeAddress region) {
    addMerge(region,getSheet(),getWorkbook());
  }

  /**
   * Prompts for an Excel destination file.
   * Catches illegal argument and SWT exceptions, presenting exception dialogs.
   * @param event command execution event for shell and dialogs
   * @throws ExecutionException if handler utility fails
   */
  public void fetchDestinationFile(Shell shell) throws ExecutionException {
    // multiple selected calendars go onto separate sheets in the workbook
    try {
      FileDialog fd = new FileDialog(shell, SWT.SAVE);
      fd.setOverwrite(true);
      fd.setText(title);
      String[] filterExt = { "*.xls", "*.*" }; //$NON-NLS-1$, $NON-NLS-2$ 
      fd.setFilterExtensions(filterExt);
      setDestinationFile(fd.open());
    } catch( IllegalArgumentException iae ) {
      (new ExceptionDetailsDialog(shell,title,null,
        "Invalid file dialog parent",iae,
        CertWareUI.getDefault())).open();
    } catch( SWTException se ) {
      (new ExceptionDetailsDialog(shell,title,null,
        "Opening file dialog", se, 
        CertWareUI.getDefault())).open();
    }
  }

  /**
   * Increments the row number and creates the next one.
   */
  public void incrementAndCreateRow(int count) {
    for ( int i = 0; i < count; i++ ) {
      incrementRow();
      getSheet().createRow(rowNumber);
    }
  }

  /**
   * Increments the row number;
   */
  public void incrementRow() {
    rowNumber++;
  }

  /**
   * Creates a workbook and establishes several styles for output.
   */
  public void setupWorkbook(String sheetName) {
    // create the destination workbook
    // creates first sheet and row
    setRowNumber(0);
    setWorkbook(new HSSFWorkbook());
    setSheet(workbook.createSheet(sheetName));
    getSheet().createRow(getRowNumber());

    DataFormat dataFormat = getWorkbook().createDataFormat();

    // two underline fonts
    doubleUnderlineFont = getWorkbook().createFont();
    doubleUnderlineFont.setUnderline(Font.U_DOUBLE_ACCOUNTING);
    singleUnderlineFont = getWorkbook().createFont();
    singleUnderlineFont.setUnderline(Font.U_SINGLE_ACCOUNTING);

    // styles for the workbook
    headerStyle = getWorkbook().createCellStyle();				
    headerStyle.setFillBackgroundColor(HSSFColor.AQUA.index);
    headerStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);

    boldTextStyle = getWorkbook().createCellStyle();
    Font font = getWorkbook().createFont();
    font.setBoldweight(Font.BOLDWEIGHT_BOLD);
    boldTextStyle.setFont(font);

    stringRightStyle = getWorkbook().createCellStyle();
    stringRightStyle.setAlignment(HSSFCellStyle.ALIGN_RIGHT);

    moneyStyle = getWorkbook().createCellStyle();
    moneyStyle.setAlignment(HSSFCellStyle.ALIGN_RIGHT);
    moneyStyle.setDataFormat(dataFormat.getFormat("$#,##0")); // $NON-NLS-1$

    durationStyle = getWorkbook().createCellStyle();
    durationStyle.setAlignment(HSSFCellStyle.ALIGN_RIGHT);
    durationStyle.setDataFormat(dataFormat.getFormat("#,##0.0")); // $NON-NLS-1$

    intStyle = getWorkbook().createCellStyle();
    intStyle.setAlignment(HSSFCellStyle.ALIGN_RIGHT);
    intStyle.setDataFormat(HSSFDataFormat.getBuiltinFormat("#,##0")); // $NON_NLS-1$

    numberStyle = getWorkbook().createCellStyle();
    numberStyle.setAlignment(HSSFCellStyle.ALIGN_RIGHT);
    numberStyle.setDataFormat(HSSFDataFormat.getBuiltinFormat("#,##0.00")); // $NON-NLS-1$

    numberDoubleUnderlineStyle = getWorkbook().createCellStyle();
    numberDoubleUnderlineStyle.setAlignment(HSSFCellStyle.ALIGN_RIGHT);
    numberDoubleUnderlineStyle.setDataFormat(HSSFDataFormat.getBuiltinFormat("#,##0.00")); // $NON-NLS-1$
    numberDoubleUnderlineStyle.setFont(doubleUnderlineFont);

    numberCenterDoubleUnderlineStyle = getWorkbook().createCellStyle();
    numberCenterDoubleUnderlineStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);
    numberCenterDoubleUnderlineStyle.setDataFormat(HSSFDataFormat.getBuiltinFormat("#,##0.00")); // $NON-NLS-1$
    numberCenterDoubleUnderlineStyle.setFont(doubleUnderlineFont);

    numberSingleUnderlineStyle = getWorkbook().createCellStyle();
    numberSingleUnderlineStyle.setAlignment(HSSFCellStyle.ALIGN_RIGHT);
    numberSingleUnderlineStyle.setDataFormat(HSSFDataFormat.getBuiltinFormat("#,##0.00")); // $NON-NLS-1$
    numberSingleUnderlineStyle.setFont(singleUnderlineFont);

    numberCenterStyle = getWorkbook().createCellStyle();
    numberCenterStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);
    numberCenterStyle.setDataFormat(HSSFDataFormat.getBuiltinFormat("#,##0.00")); // $NON-NLS-1$

    labelDoubleUnderlineStyle = getWorkbook().createCellStyle();
    labelDoubleUnderlineStyle.setAlignment(HSSFCellStyle.ALIGN_LEFT);
    labelDoubleUnderlineStyle.setFont(doubleUnderlineFont);

    labelSingleUnderlineStyle = getWorkbook().createCellStyle();
    labelSingleUnderlineStyle.setAlignment(HSSFCellStyle.ALIGN_LEFT);
    labelSingleUnderlineStyle.setFont(doubleUnderlineFont);

    percentStyle = getWorkbook().createCellStyle();
    percentStyle.setAlignment(HSSFCellStyle.ALIGN_RIGHT);
    percentStyle.setDataFormat(HSSFDataFormat.getBuiltinFormat("0.00%")); // $NON-NLS-1$

    percentCenterStyle = getWorkbook().createCellStyle();
    percentCenterStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);
    percentCenterStyle.setDataFormat(HSSFDataFormat.getBuiltinFormat("0.00%")); // $NON-NLS-1$

    labelCenterStyle = getWorkbook().createCellStyle();
    labelCenterStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);

    borderStyle = getWorkbook().createCellStyle();
    borderStyle.setBorderBottom(HSSFCellStyle.BORDER_THICK);
    borderStyle.setBottomBorderColor(HSSFColor.BLUE.index);
    borderStyle.setBorderLeft(HSSFCellStyle.BORDER_THIN);
    borderStyle.setLeftBorderColor(HSSFColor.BLUE.index);
    borderStyle.setBorderRight(HSSFCellStyle.BORDER_THIN);
    borderStyle.setRightBorderColor(HSSFColor.BLUE.index);
    borderStyle.setAlignment( HSSFCellStyle.ALIGN_CENTER);
  }

  /**
   * Writes sheet to file.
   * @throws IOException
   */
  public void writeToFile() throws IOException {
    FileOutputStream fileOut = new FileOutputStream(getDestinationFile());
    getWorkbook().write(fileOut);
    fileOut.close();
  }

  /**
   * Performs the workbook write to a file output stream.
   * @param shell shell for exception dialogs
   */
  public void writeToFile(Shell shell) {
    try {
      FileOutputStream fileOut = new FileOutputStream(getDestinationFile());
      getWorkbook().write(fileOut);
      fileOut.close();
    } catch( FileNotFoundException fnfe ) {
      (new ExceptionDetailsDialog(shell, title, null, 
        "Destination file not found",fnfe,
       CertWareUI.getDefault())).open();
      CertWareLog.logError("Destination file not found", fnfe);
    } catch( IOException ioe ) {
      (new ExceptionDetailsDialog(shell, title, null,
        "I/O error writing Excel file",	ioe, 
        CertWareUI.getDefault())).open();
      CertWareLog.logError("I/O error writing Excel file", ioe);
    }
  }

  public void setWorkbook(HSSFWorkbook workbook)
  {
    this.workbook = workbook;
  }

  public HSSFWorkbook getWorkbook()
  {
    return workbook;
  }

  public void setDestinationFile(String destinationFile)
  {
    this.destinationFile = destinationFile;
  }

  public String getDestinationFile()
  {
    return destinationFile;
  }

  public void setSheet(HSSFSheet sheet)
  {
    this.sheet = sheet;
  }

  public HSSFSheet getSheet()
  {
    return sheet;
  }
}
