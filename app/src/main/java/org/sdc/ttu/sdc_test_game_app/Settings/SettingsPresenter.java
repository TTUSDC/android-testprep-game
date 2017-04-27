package org.sdc.ttu.sdc_test_game_app.Settings;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;

public class SettingsPresenter implements SettingsInterface.Presenter {
    private Context mContext;
    private Activity mActivity;
    private SettingsInterface.View mSettingsView;

    SettingsPresenter(Context context, @NonNull SettingsInterface.View settingsView) {
        mContext = context;
        mActivity = (Activity)context;
        mSettingsView = settingsView;
    }
}
