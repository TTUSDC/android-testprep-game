package org.sdc.ttu.sdc_test_game_app.CreateAccount;

import android.content.Context;
import android.support.annotation.NonNull;

public class CreateAccountPresenter {

    private Context mContext;
    private CreateAccountInterface.View mCreateAccountView;

    public CreateAccountPresenter(Context context, @NonNull CreateAccountInterface.View createAccountView) {
        mContext = context;
        mCreateAccountView = createAccountView;
    }

}
