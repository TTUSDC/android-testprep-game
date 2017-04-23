package org.sdc.ttu.sdc_test_game_app.Categories;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.sdc.ttu.sdc_test_game_app.BaseActivity;
import org.sdc.ttu.sdc_test_game_app.R;

import java.util.Random;

/**
 * Created by anish on 4/19/2017.
 */

public class CategoriesActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btnR= (Button) findViewById(R.id.butnRand);
        Button btnS= (Button) findViewById(R.id.butnSci);
        Button btnM= (Button) findViewById(R.id.butnMath);
        Button btnE= (Button) findViewById(R.id.butnEtc);

        btnR.setOnClickListener(this);
        btnS.setOnClickListener(this);
        btnM.setOnClickListener(this);
        btnE.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.butnRand:
                Toast.makeText(this, "ButnRnd working", Toast.LENGTH_SHORT).show();
            case R.id.butnSci:
                Toast.makeText(this, "ButnSci working", Toast.LENGTH_SHORT).show();
            case R.id.butnMath:
                Toast.makeText(this, "ButnMath working", Toast.LENGTH_SHORT).show();
            case R.id.butnEtc:
                Toast.makeText(this, "ButnEtc working", Toast.LENGTH_SHORT).show();

        }
    }
}