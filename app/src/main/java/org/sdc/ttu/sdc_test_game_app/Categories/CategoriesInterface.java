package org.sdc.ttu.sdc_test_game_app.Categories;

/**
 * Created by anish on 4/19/2017.
 */

public interface CategoriesInterface {
    interface View{

    }

    interface Presenter{
        void Random();
        void Science();
        void Math();
        void Etc();
    }
}
