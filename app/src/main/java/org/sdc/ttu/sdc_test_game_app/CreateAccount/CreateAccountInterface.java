package org.sdc.ttu.sdc_test_game_app.CreateAccount;

public interface CreateAccountInterface {

    interface View {
        void showIncorrectUsername(boolean show);
        void showIncorrectPassword(boolean show);
    }

    interface Presenter {
        void createAccount(String firstName, String lastName, String userName, String email, String password);
        // Presenter methods are prototyped here and defined in the View activity
    }
}
