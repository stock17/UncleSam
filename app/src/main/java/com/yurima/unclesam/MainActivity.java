package com.yurima.unclesam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.waterdown_button)
    ImageButton waterdownButton;

    @BindView(R.id.braga_button)
    ImageButton bragaButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick (R.id.waterdown_button)
    public void onWaterDownClick(View v) {
        Intent intent = new Intent(this, WaterDownActivity.class);
        startActivity(intent);
    }

    @OnClick (R.id.braga_button)
    public void onBragaClick(View v) {
        Intent intent = new Intent(this, BragaActivity.class);
        startActivity(intent);
    }
}
