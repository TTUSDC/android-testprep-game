package org.sdc.ttu.sdc_test_game_app.Categories;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;

/**
 * Created by anish on 4/19/2017.
 */
class CategoriesPresenter implements CategoriesInterface.Presenter {

    private Context mContext;
    private CategoriesInterface.View mCategoriesView;
    private static final int RandomInt= 1;
    private static final int ScienceInt= 2;
    private static final int MathInt= 3;
    private static final int EtcInt= 4;

    CategoriesPresenter(Context context, @NonNull CategoriesInterface.View CategoriesView) {
        mContext = context;
        mCategoriesView = CategoriesView;
    }

    public void startGameScreen(int option) {
        Intent i = new Intent(mContext, GameScreenActivity.class);
        i.putExtra("Option", option);
        mContext.startActivity(i);
    }


    public void Random() {
        startGameScreen(RandomInt);
    }

    public void Science() {
        startGameScreen(ScienceInt);
    }

    public void Math() {
        startGameScreen(MathInt);
    }

    public void Etc() {
        startGameScreen(EtcInt);
    }
}


