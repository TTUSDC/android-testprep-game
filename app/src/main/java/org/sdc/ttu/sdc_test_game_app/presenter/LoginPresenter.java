package org.sdc.ttu.sdc_test_game_app.presenter;

import android.app.ProgressDialog;
import android.content.ContentValues;
import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.EditText;
import android.widget.Toast;

import org.sdc.ttu.sdc_test_game_app.R;
import org.sdc.ttu.sdc_test_game_app.presenter.interfaces.LoginInterface;

import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;


public class LoginPresenter implements LoginInterface.Presenter {


    private Context mContext;
    private LoginInterface.View mLoginView;

    public LoginPresenter(Context context, @NonNull LoginInterface.View loginView) {
        mContext = context;
        mLoginView = loginView;
    }




    /**
     * Attempt to log in with user credentials
     * @param username user's username
     * @param password user's password
     */
    @Override
    public void login(String username, String password) {

        // Show a progress bar
        mLoginView.showProgressBar(true);

        // TODO: attempt an actual login credentials validation
        // mLoginView.showIncorrectUsername(false);
        // mLoginView.showIncorrectPassword(false);

        mLoginView.showProgressBar(false);
        mLoginView.startMain();


    }



}
