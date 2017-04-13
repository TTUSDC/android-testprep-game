package org.sdc.ttu.sdc_test_game_app.Login;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;

import org.sdc.ttu.sdc_test_game_app.CreateAccount.CreateAccountActivity;


class LoginPresenter implements LoginInterface.Presenter {

    private Context mContext;
    private LoginInterface.View mLoginView;

    LoginPresenter(Context context, @NonNull LoginInterface.View loginView) {
        mContext = context;
        mLoginView = loginView;
    }

    /**
     * Attempt to log in with user credentials
     * @param username user's username
     * @param password user's password
     */
    @Override
    public void login(@NonNull String username, @NonNull String password) {

        // Show a progress bar
        mLoginView.showProgressBar(true);

        // TODO: attempt an actual login credentials validation
        // mLoginView.showIncorrectUsername(false);
        // mLoginView.showIncorrectPassword(false);

        mLoginView.showProgressBar(false);
        mLoginView.startMain();


    }

    @Override
    public void createActivity(Context context) {
        Intent createIntent = new Intent(context, CreateAccountActivity.class);
    }
}
