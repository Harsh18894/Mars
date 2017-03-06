// Generated code from Butter Knife. Do not modify!
package mars.com.activities;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class SplashActivity$$ViewBinder<T extends mars.com.activities.SplashActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558534, "field 'rippleBackground'");
    target.rippleBackground = finder.castView(view, 2131558534, "field 'rippleBackground'");
  }

  @Override public void unbind(T target) {
    target.rippleBackground = null;
  }
}
