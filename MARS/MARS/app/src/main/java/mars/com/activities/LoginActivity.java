package mars.com.activities;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import mars.com.R;
import mars.com.ui.CustomTitle;
import mars.com.ui.CustomTypeFace;
import mars.com.ui.SnackBar;
import mars.com.ui.button.ButtonPlus;

/**
 * Created by Harsh on 3/16/2016.
 */
public class LoginActivity extends AppCompatActivity {

    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.etRollNumber)
    android.widget.EditText etRollNumber;
    @Bind(R.id.btnEnter)
    ButtonPlus btnEnter;
    @Bind(R.id.txtLoginMessage)
    TextView txtLoginMessage;
    @Bind(R.id.txtLoginDescMessage)
    TextView txtLoginDescMessage;
    /*@Bind(R.id.txtCollegeCode)
    TextView txtCollegeCode;*/

    @OnClick(R.id.btnEnter)
    void enter() {
        if (etRollNumber.getText().toString().equals("")) {
            SnackBar.show(this, getString(R.string.no_text));
        } else {
            Intent intent = new Intent(this, DashboardActivity.class);
            startActivity(intent);
        }
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        populate();
    }

    private void populate() {
        ButterKnife.bind(this);
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            btnEnter.setBackgroundResource(R.drawable.ripple);
        }

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(CustomTitle.getTitle(this, getString(R.string.login)));

        Typeface typeface = CustomTypeFace.getTypeface(this);
        Typeface typefaceBold = CustomTypeFace.getBoldTypeface(this);
        txtLoginMessage.setTypeface(typeface);
        txtLoginDescMessage.setTypeface(typeface);
        //    txtCollegeCode.setTypeface(typeface);
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}

