package org.sdc.ttu.sdc_test_game_app.HomeScreen;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;

import org.sdc.ttu.sdc_test_game_app.HomeScreen.HomeScreenInterface;;

public class HomeScreenPresenter {

    private Context mContext;
    private Activity mActivity;
    private HomeScreenInterface.View mHomeScreenView;

    HomeScreenPresenter(Context context, @NonNull HomeScreenInterface.View homeScreenView) {
        mContext = context;
        mActivity = (Activity)mContext;
        mHomeScreenView = homeScreenView;
    }
}
