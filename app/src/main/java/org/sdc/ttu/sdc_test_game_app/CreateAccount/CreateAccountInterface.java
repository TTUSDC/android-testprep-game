package org.sdc.ttu.sdc_test_game_app.CreateAccount;

public interface CreateAccountInterface {

    interface View {
        void showIncorrectUsername(boolean show);
        void showIncorrectPassword(boolean show);
    }

    interface Presenter {
        // Presenter methods are prototyped here and defined in the View activity
    }
}
