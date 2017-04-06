package org.sdc.ttu.sdc_test_game_app.CreateAccount;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.EditText;

import org.sdc.ttu.sdc_test_game_app.BaseActivity;
import org.sdc.ttu.sdc_test_game_app.Login.LoginPresenter;
import org.sdc.ttu.sdc_test_game_app.R;

import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by lamsa on 4/5/2017.
 */

public class CreateAccountActivity extends BaseActivity {

    private LoginPresenter mPresenter;
    private ProgressDialog mProgressDialog;

    @BindView(R.id.firstName) String mfirstName;
    @BindView(R.id.lastName) String mlastName;
    @BindView(R.id.username) String mUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        // Set up progress bar
        mProgressDialog = new ProgressDialog(this,
                R.style.AppTheme_Light_Dialog);
        mProgressDialog.setIndeterminate(true);


        // Instantiate LoginPresenter


    }
}
