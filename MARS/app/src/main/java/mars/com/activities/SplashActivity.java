package mars.com.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.skyfishjy.library.RippleBackground;

import butterknife.Bind;
import butterknife.ButterKnife;
import mars.com.R;

/**
 * Created by Harsh on 3/15/2016.
 */
public class SplashActivity extends AppCompatActivity implements Animation.AnimationListener {
    View v;
    @Bind(R.id.appName)
    TextView appName;
    Animation fadeIn;
    @Bind(R.id.centerImage)
    ImageView centerImage;
    @Bind(R.id.content)
    RippleBackground rippleBackground;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ButterKnife.bind(this);
        rippleBackground.startRippleAnimation();
        fadeIn = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in);
        fadeIn.setAnimationListener(this);
        appName.startAnimation(fadeIn);

        Thread thread = new Thread() {
            public void run() {
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    Snackbar.make(v, "Error Occured. Try again later", Snackbar.LENGTH_LONG).setAction("Action", null).show();
                } finally {
                    Intent intent = new Intent(SplashActivity.this, AppInfoActivity.class);
                    startActivity(intent);
                }
            }
        };
        thread.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }

    @Override
    public void onBackPressed() {

    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {

    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
