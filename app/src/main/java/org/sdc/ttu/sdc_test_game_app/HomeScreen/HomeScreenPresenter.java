package org.sdc.ttu.sdc_test_game_app.HomeScreen;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;

import org.sdc.ttu.sdc_test_game_app.Play.PlayActivity;
import org.sdc.ttu.sdc_test_game_app.Practice.PracticeActivity;

public class HomeScreenPresenter implements HomeScreenInterface.Presenter {

    private Context mContext;
    private Activity mActivity;
    private HomeScreenInterface.View mHomeScreenView;

    HomeScreenPresenter(Context context, @NonNull HomeScreenInterface.View homeScreenView) {
        mContext = context;
        mActivity = (Activity)mContext;
        mHomeScreenView = homeScreenView;
    }

    @Override
    public void startHomeScreenActivity() {
        // Start the home screen activity
        Intent homeActivityIntent = new Intent(mContext, HomeScreenActivity.class);
        mContext.startActivity(homeActivityIntent);

        // Assuming the HomeScreen button will destroy the current activity being used
        mActivity.finish();

    }

    @Override
    public void startPracticeActivity() {
        // Start the practice activity
        Intent practiceActivityIntent = new Intent(mContext, PracticeActivity.class);
        mContext.startActivity(practiceActivityIntent);
        mActivity.finish();

    }

    @Override
    public void startPlayActivity() {
        // Start the play activity
        Intent playActivityIntent = new Intent(mContext, PlayActivity.class);
        mContext.startActivity(playActivityIntent);
        mActivity.finish();
    }



}
