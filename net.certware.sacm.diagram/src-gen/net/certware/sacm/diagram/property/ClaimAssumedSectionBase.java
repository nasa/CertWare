/*************************************************************************************
 *
 * Generated on Wed Oct 16 21:36:06 CDT 2013 by Spray PropertySection.xtend
 *
 * This file contains generated and should not be changed.
 * Use the extension point class (the direct subclass of this class) to add manual code
 *
 *************************************************************************************/
package net.certware.sacm.diagram.property;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.platform.GFPropertySection;
import org.eclipse.graphiti.ui.internal.services.GraphitiUiInternal;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;
import java.util.List;
import net.certware.sacm.SACM.Argumentation.Claim;

public abstract class ClaimAssumedSectionBase extends GFPropertySection implements ITabbedPropertyConstants {

    protected net.certware.sacm.SACM.Argumentation.Claim bc = null;
    protected Text                                       assumedWidget;

    /**
     * {@inheritDoc}
     */
    @Override
    public void createControls(Composite parent, TabbedPropertySheetPage tabbedPropertySheetPage) {
        super.createControls(parent, tabbedPropertySheetPage);

        final TabbedPropertySheetWidgetFactory factory = getWidgetFactory();
        final Composite composite = factory.createFlatFormComposite(parent);
        FormData data;

        assumedWidget = factory.createText(composite, "");
        data = new FormData();
        data.left = new FormAttachment(0, STANDARD_LABEL_WIDTH);
        data.right = new FormAttachment(100, 0);
        data.top = new FormAttachment(0, VSPACE);
        assumedWidget.setLayoutData(data);

        CLabel valueLabel = factory.createCLabel(composite, "Assumed");
        data = new FormData();
        data.left = new FormAttachment(0, 0);
        data.right = new FormAttachment(assumedWidget, -HSPACE);
        data.top = new FormAttachment(assumedWidget, 0, SWT.CENTER);
        valueLabel.setLayoutData(data);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void refresh() {
        assumedWidget.removeModifyListener(nameListener);

        final PictogramElement pe = getSelectedPictogramElement();
        if (pe != null) {
            final EObject bo = (EObject) Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
            // the filter assured, that it is a Claim
            if (bo == null)
                return;
            bc = (net.certware.sacm.SACM.Argumentation.Claim) bo;
            String value = "";
            value = "unknown";
            assumedWidget.setText(value == null ? "" : value);
            assumedWidget.addModifyListener(nameListener);
        }
    }

    private ModifyListener nameListener = new ModifyListener() {
                                            public void modifyText(ModifyEvent arg0) {
                                                TransactionalEditingDomain editingDomain = getDiagramContainer().getDiagramBehavior().getEditingDomain();
                                                editingDomain.getCommandStack().execute(new RecordingCommand(editingDomain) {
                                                    @Override
                                                    protected void doExecute() {
                                                        changePropertyValue();
                                                    }
                                                });
                                            }
                                        };

    protected void changePropertyValue() {
        String newValue = assumedWidget.getText();
    }

}
