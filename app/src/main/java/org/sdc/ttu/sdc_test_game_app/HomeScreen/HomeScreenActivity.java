package org.sdc.ttu.sdc_test_game_app.HomeScreen;

import android.os.Bundle;
import android.view.View;

import org.sdc.ttu.sdc_test_game_app.BaseActivity;
import org.sdc.ttu.sdc_test_game_app.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomeScreenActivity extends BaseActivity implements HomeScreenInterface.View{

    private HomeScreenPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        ButterKnife.bind(this);

        // Instantiate LoginPresenter
        mPresenter = new HomeScreenPresenter(this, this);
    }

    @OnClick(R.id.home_button)
    public void onHomeClick(View view) {
        mPresenter.startHomeScreenActivity();
    }

    @OnClick(R.id.practice_button)
    public void onPracticeClick(View view) {
        mPresenter.startPracticeActivity();
    }

    @OnClick(R.id.play_button)
    public void onPlayClick(View view) {
        mPresenter.startPlayActivity();
    }

    @OnClick(R.id.help_button)
    public void onHelpClick(View view) {
        mPresenter.startHelpActivity();
    }

    @OnClick(R.id.settings_button)
    public void onSettingsClick(View view) {
        mPresenter.startSettingsActivity();
    }

}
