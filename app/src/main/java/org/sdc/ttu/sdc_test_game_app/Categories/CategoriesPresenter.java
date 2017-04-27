package org.sdc.ttu.sdc_test_game_app.Categories;

import android.content.Context;
import android.support.annotation.NonNull;

/**
 * Created by anish on 4/19/2017.
 */
class CategoriesPresenter implements CategoriesInterface.Presenter {
        private Context mContext;
        private CategoriesInterface.View mCategoriesView;

        CategoriesPresenter(Context context, @NonNull CategoriesInterface.View CategoriesView) {
            mContext = context;
            mCategoriesView = CategoriesView;
        }

    public void Random(){

    }

    public void Science(){

    }

    public void Math(){

    }

    public void Etc(){

    }
}


