// Generated code from Butter Knife. Do not modify!
package mars.com.activities;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class CalendarActivity$$ViewBinder<T extends mars.com.activities.CalendarActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558518, "field 'pdfCalendar'");
    target.pdfCalendar = finder.castView(view, 2131558518, "field 'pdfCalendar'");
    view = finder.findRequiredView(source, 2131558517, "field 'toolbar'");
    target.toolbar = finder.castView(view, 2131558517, "field 'toolbar'");
  }

  @Override public void unbind(T target) {
    target.pdfCalendar = null;
    target.toolbar = null;
  }
}
