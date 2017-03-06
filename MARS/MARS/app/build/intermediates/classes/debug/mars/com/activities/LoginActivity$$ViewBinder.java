// Generated code from Butter Knife. Do not modify!
package mars.com.activities;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class LoginActivity$$ViewBinder<T extends mars.com.activities.LoginActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558517, "field 'toolbar'");
    target.toolbar = finder.castView(view, 2131558517, "field 'toolbar'");
    view = finder.findRequiredView(source, 2131558532, "field 'etRollNumber'");
    target.etRollNumber = finder.castView(view, 2131558532, "field 'etRollNumber'");
    view = finder.findRequiredView(source, 2131558533, "field 'btnEnter' and method 'enter'");
    target.btnEnter = finder.castView(view, 2131558533, "field 'btnEnter'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.enter();
        }
      });
    view = finder.findRequiredView(source, 2131558530, "field 'txtLoginMessage'");
    target.txtLoginMessage = finder.castView(view, 2131558530, "field 'txtLoginMessage'");
    view = finder.findRequiredView(source, 2131558531, "field 'txtLoginDescMessage'");
    target.txtLoginDescMessage = finder.castView(view, 2131558531, "field 'txtLoginDescMessage'");
  }

  @Override public void unbind(T target) {
    target.toolbar = null;
    target.etRollNumber = null;
    target.btnEnter = null;
    target.txtLoginMessage = null;
    target.txtLoginDescMessage = null;
  }
}
