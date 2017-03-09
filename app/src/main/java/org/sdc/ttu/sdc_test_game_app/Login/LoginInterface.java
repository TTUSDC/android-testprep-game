package org.sdc.ttu.sdc_test_game_app.Login;

import android.support.annotation.NonNull;



public interface LoginInterface {

    interface View{

        void showProgressBar(boolean show);
        void showIncorrectUsername(boolean show);
        void showIncorrectPassword(boolean show);
        void startMain();
    }

    interface Presenter{

        void login(@NonNull String username, @NonNull String password);


    }
}
