package org.sdc.ttu.sdc_test_game_app.HomeScreen;

public interface HomeScreenInterface {

    interface View{

    }

    interface Presenter{
        void startHomeScreenActivity();
        void startPracticeActivity();
        void startPlayActivity();
        void startHelpActivity();
        void startSettingsActivity();
    }

}
