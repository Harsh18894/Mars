// Generated code from Butter Knife. Do not modify!
package mars.com.activities;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class AppInfoActivity$$ViewBinder<T extends mars.com.activities.AppInfoActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558514, "field 'indicaor'");
    target.indicaor = finder.castView(view, 2131558514, "field 'indicaor'");
    view = finder.findRequiredView(source, 2131558512, "field 'pager'");
    target.pager = finder.castView(view, 2131558512, "field 'pager'");
    view = finder.findRequiredView(source, 2131558516, "field 'btnLogin' and method 'login'");
    target.btnLogin = finder.castView(view, 2131558516, "field 'btnLogin'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.login();
        }
      });
  }

  @Override public void unbind(T target) {
    target.indicaor = null;
    target.pager = null;
    target.btnLogin = null;
  }
}
