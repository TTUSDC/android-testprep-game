package org.sdc.ttu.sdc_test_game_app.Login;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;

import org.sdc.ttu.sdc_test_game_app.CreateAccount.CreateAccountActivity;
import org.sdc.ttu.sdc_test_game_app.HomeScreen.HomeScreenActivity;


class LoginPresenter implements LoginInterface.Presenter {

    private Context mContext;
    private Activity mActivity;
    private LoginInterface.View mLoginView;

    LoginPresenter(Context context, @NonNull LoginInterface.View loginView) {
        mContext = context;
        mActivity = (Activity)context;
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
//        mLoginView.showProgressBar(true);

        // TODO: attempt an actual login credentials validation
        // mLoginView.showIncorrectUsername(false);
        // mLoginView.showIncorrectPassword(false);

//        mLoginView.showProgressBar(false);
        startHomeScreenActivity();

    }

    @Override
    public void startHomeScreenActivity() {
        // Start the home screen activity
        Intent homeActivityIntent = new Intent(mContext, HomeScreenActivity.class);
        mContext.startActivity(homeActivityIntent);
//        mActivity.finish();

    }

    @Override
    public void startCreateAccountActivity() {
        // Start the home screen activity
        Intent createAccountIntent = new Intent(mContext, CreateAccountActivity.class);
        mContext.startActivity(createAccountIntent);

    }

}
