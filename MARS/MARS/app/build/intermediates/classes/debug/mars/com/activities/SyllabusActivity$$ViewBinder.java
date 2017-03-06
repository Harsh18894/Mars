// Generated code from Butter Knife. Do not modify!
package mars.com.activities;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class SyllabusActivity$$ViewBinder<T extends mars.com.activities.SyllabusActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558536, "field 'pdfSyllabus'");
    target.pdfSyllabus = finder.castView(view, 2131558536, "field 'pdfSyllabus'");
    view = finder.findRequiredView(source, 2131558517, "field 'toolbar'");
    target.toolbar = finder.castView(view, 2131558517, "field 'toolbar'");
  }

  @Override public void unbind(T target) {
    target.pdfSyllabus = null;
    target.toolbar = null;
  }
}
