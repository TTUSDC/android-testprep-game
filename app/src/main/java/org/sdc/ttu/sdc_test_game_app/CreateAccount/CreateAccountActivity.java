package org.sdc.ttu.sdc_test_game_app.CreateAccount;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.sdc.ttu.sdc_test_game_app.BaseActivity;
import org.sdc.ttu.sdc_test_game_app.R;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CreateAccountActivity extends BaseActivity implements CreateAccountInterface.View {

    private CreateAccountPresenter mPresenter;
    private ProgressDialog mProgressDialog;

    @BindView(R.id.firstName)
    EditText mFirstName;
    @BindView(R.id.lastName)
    EditText mLastName;
    @BindView(R.id.password)
    EditText mPassword;
    @BindView(R.id.username)
    EditText mUsername;
    @BindView(R.id.email)
    EditText mEmail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
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

    @OnClick(R.id.create_account_button)
    public void onCreateAccountClick(View view) {
        String firstName = mFirstName.getText().toString();
        String lastName = mLastName.getText().toString();
        String userName = mUsername.getText().toString();
        String password = mPassword.getText().toString();
        String email = mEmail.getText().toString();
        mPresenter.createAccount(firstName, lastName, userName, email, password);
    }


}
