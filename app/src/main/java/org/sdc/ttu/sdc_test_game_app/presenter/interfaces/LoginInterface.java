package org.sdc.ttu.sdc_test_game_app.presenter.interfaces;

import android.support.annotation.NonNull;

/**
 * Created by Dane Lowrey on 3/4/2017.
 */

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
