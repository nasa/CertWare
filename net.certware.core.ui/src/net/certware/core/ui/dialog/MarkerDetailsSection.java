package net.certware.core.ui.dialog;

import org.eclipse.core.resources.IMarker;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;

/**
 * Generic utilities for producing marker detail dialog form sections.
 * @author mrb
 * @since 1.0
 */
public abstract class MarkerDetailsSection implements IMarkerDetailsSection
{

  abstract public void build(ScrolledForm form, FormToolkit formToolkit, IMarker marker);

  protected String replaceHtmlEntities(String s) {
    s = s.replaceAll("&", "&amp;");
    s = s.replaceAll("<", "&lt;");
    s = s.replaceAll(">", "&gt;");
    return s;
  }

  private String createItem(String s, String prefix, String imageKey) {
    StringBuffer buffer = new StringBuffer();
    String[] strings = s.split("\n");
    for ( int i = 0; i < strings.length; i++ ) {
      buffer.append("<li bindent=\"20\" style=\"image\"").append(' ');
      buffer.append("value=").append('"').append(imageKey).append('"').append('>');
      buffer.append(prefix).append(replaceHtmlEntities(strings[i]));
      buffer.append("</li>");
    }
    
    return buffer.toString();
  }
  
  protected String listItem(IMarker marker, String prefix, String key, String imageKey) {
    String s = marker.getAttribute(key,ATTRIBUTE_DEFAULT);
    return createItem(s,prefix,imageKey);
  }

  protected String listItem(String s, String prefix, String key, String imageKey) {
    return createItem(s,prefix,imageKey);
  }

  protected String listItemInt(IMarker marker, String prefix, String key, String imageKey) {
    int i = marker.getAttribute(key,0);
    return createItem(Integer.toString(i),prefix,imageKey);
  }
}
