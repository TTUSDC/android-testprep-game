package org.sdc.ttu.sdc_test_game_app.Categories;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import org.sdc.ttu.sdc_test_game_app.BaseActivity;
import org.sdc.ttu.sdc_test_game_app.R;
import butterknife.OnClick;

/**
 * Created by anish on 4/19/2017.
 */

public class CategoriesActivity extends BaseActivity implements CategoriesInterface.View {
    private CategoriesPresenter mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        mPresenter = new CategoriesPresenter(this, this);
    }

    @OnClick(R.id.butnRand)
    public void onRandomClick(View view) {
        mPresenter.Random();
    }

    @OnClick(R.id.butnMath)
    public void onMathClick(View view) {
        mPresenter.Math();
    }

    @OnClick(R.id.butnSci)
    public void onScienceClick(View view) {
        mPresenter.Science();
    }

    @OnClick(R.id.butnEtc)
    public void onEtcClick(View view) {
        mPresenter.Etc();
    }
}