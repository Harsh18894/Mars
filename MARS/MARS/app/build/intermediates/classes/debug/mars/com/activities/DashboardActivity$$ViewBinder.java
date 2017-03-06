// Generated code from Butter Knife. Do not modify!
package mars.com.activities;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class DashboardActivity$$ViewBinder<T extends mars.com.activities.DashboardActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558522, "field 'txtName'");
    target.txtName = finder.castView(view, 2131558522, "field 'txtName'");
    view = finder.findRequiredView(source, 2131558523, "field 'txtRollNum'");
    target.txtRollNum = finder.castView(view, 2131558523, "field 'txtRollNum'");
    view = finder.findRequiredView(source, 2131558524, "field 'txtSem'");
    target.txtSem = finder.castView(view, 2131558524, "field 'txtSem'");
    view = finder.findRequiredView(source, 2131558525, "field 'txtSemester'");
    target.txtSemester = finder.castView(view, 2131558525, "field 'txtSemester'");
    view = finder.findRequiredView(source, 2131558526, "field 'fabMenu'");
    target.fabMenu = finder.castView(view, 2131558526, "field 'fabMenu'");
    view = finder.findRequiredView(source, 2131558519, "field 'll'");
    target.ll = finder.castView(view, 2131558519, "field 'll'");
    view = finder.findRequiredView(source, 2131558527, "field 'listItems'");
    target.listItems = finder.castView(view, 2131558527, "field 'listItems'");
  }

  @Override public void unbind(T target) {
    target.txtName = null;
    target.txtRollNum = null;
    target.txtSem = null;
    target.txtSemester = null;
    target.fabMenu = null;
    target.ll = null;
    target.listItems = null;
  }
}
