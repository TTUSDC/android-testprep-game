package org.sdc.ttu.sdc_test_game_app.Login;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.view.View;
import android.widget.EditText;
import org.sdc.ttu.sdc_test_game_app.BaseActivity;
import org.sdc.ttu.sdc_test_game_app.HomeScreen.HomeScreenActivity;
import org.sdc.ttu.sdc_test_game_app.R;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity implements LoginInterface.View {

    private LoginPresenter mPresenter;
    private ProgressDialog mProgressDialog;

    @BindView(R.id.input_username) TextInputEditText inputUsername;
    @BindView(R.id.input_password) TextInputEditText inputPassword;
    @BindString(R.string.login_progress_text) String mProgressText;
    @BindString(R.string.login_incorrect_username) String mIncorrectUsernameText;
    @BindString(R.string.login_incorrect_password) String mIncorrectPasswordText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        // Set up progress bar
        mProgressDialog = new ProgressDialog(this,
                R.style.AppTheme_Light_Dialog);
        mProgressDialog.setIndeterminate(true);
        mProgressDialog.setMessage(mProgressText);

        // Instantiate LoginPresenter
        mPresenter = new LoginPresenter(this, this);

    }

    @Override
    public void showProgressBar(boolean show) {

        if (show) {
            mProgressDialog.show();
        } else {
            mProgressDialog.hide();
        }


    }

    @Override
    public void showIncorrectUsername(boolean show) {
        if (show) {
            inputUsername.setError(mIncorrectUsernameText);
        } else {
            inputUsername.setError(null);
        }
    }

    @Override
    public void showIncorrectPassword(boolean show) {

        if (show) {
            inputPassword.setError(mIncorrectPasswordText);
        } else {
            inputPassword.setError(null);
        }
    }

    @OnClick(R.id.button_login)
    public void onLoginClick(View view) {
        String username = inputUsername.getText().toString();
        String password = inputPassword.getText().toString();
        mPresenter.login(username, password);
    }

    @OnClick(R.id.text_create_account)
    public void onCreateAccountClick(View view) {
        mPresenter.startCreateAccountActivity();
    }
}

