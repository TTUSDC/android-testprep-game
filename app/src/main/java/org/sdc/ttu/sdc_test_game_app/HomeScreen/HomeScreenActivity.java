package org.sdc.ttu.sdc_test_game_app.HomeScreen;

import android.app.ProgressDialog;
import android.os.Bundle;

import org.sdc.ttu.sdc_test_game_app.BaseActivity;
import org.sdc.ttu.sdc_test_game_app.R;

import butterknife.ButterKnife;

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

}
