package org.sdc.ttu.sdc_test_game_app.CreateAccount;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import org.sdc.ttu.sdc_test_game_app.BaseActivity;
import org.sdc.ttu.sdc_test_game_app.Login.LoginPresenter;
import org.sdc.ttu.sdc_test_game_app.R;

import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;

public class CreateAccountActivity extends BaseActivity implements CreateAccountInterface.View {

    private CreateAccountPresenter mPresenter;
    private ProgressDialog mProgressDialog;

    @BindView(R.id.firstName)
    Button mFirstName;
    @BindView(R.id.lastName)
    Button mLastName;
    @BindView(R.id.username)
    Button mUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        // Set up progress bar
        mProgressDialog = new ProgressDialog(this,
                R.style.AppTheme_Light_Dialog);
        mProgressDialog.setIndeterminate(true);


        // Instantiate CreateAccountPresenter
        mPresenter = new CreateAccountPresenter(this, this);

    }

    @Override
    public void showIncorrectUsername(boolean show) {

    }

    @Override
    public void showIncorrectPassword(boolean show) {

    }
}
