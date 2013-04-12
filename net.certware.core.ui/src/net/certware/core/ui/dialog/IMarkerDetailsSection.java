package net.certware.core.ui.dialog;

import org.eclipse.core.resources.IMarker;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;

public interface IMarkerDetailsSection
{
  /** default for missing attribute */ // do not use brackets here
  static final String ATTRIBUTE_DEFAULT = "unknown";
  /** default for missing message */
  static final String MESSAGE_DEFAULT = "message not provided";
  
  /** build the section, usually a text form */
  void build(ScrolledForm form, FormToolkit formToolkit, IMarker marker);

}
