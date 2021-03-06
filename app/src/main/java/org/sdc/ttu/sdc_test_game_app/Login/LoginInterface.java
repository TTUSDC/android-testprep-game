package org.sdc.ttu.sdc_test_game_app.Login;

import android.content.Context;
import android.support.annotation.NonNull;



interface LoginInterface {

    interface View{

        void showProgressBar(boolean show);
        void showIncorrectUsername(boolean show);
        void showIncorrectPassword(boolean show);
    }

    interface Presenter{

        void login(@NonNull String username, @NonNull String password);
        void startHomeScreenActivity();
        void startCreateAccountActivity();

    }
}
