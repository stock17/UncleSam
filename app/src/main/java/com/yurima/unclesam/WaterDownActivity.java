package com.yurima.unclesam;

import android.net.ParseException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class WaterDownActivity extends AppCompatActivity {

    @BindView(R.id.calculateButton)
    Button calculateButton;
    @BindView(R.id.sourceVolumeEditText)
    EditText sourceVolumeEditText;
    @BindView(R.id.sourceConcentrationEditText)
    EditText sourceConcentrationEditText;
    @BindView(R.id.resultConcentrationEditText)
    EditText resultConcentrationEditText;
    @BindView(R.id.calculateTextView)
    TextView calculateTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waterdown);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.calculateButton)
    public void onCalculateButtonClick(){
        try {
            double vol = Double.parseDouble(sourceVolumeEditText.getText().toString());
            double con = Double.parseDouble(sourceConcentrationEditText.getText().toString());
            double resultCon = Double.parseDouble(resultConcentrationEditText.getText().toString());

            double absoluteSpiritSource = vol * con / 100;
            double absoluteWaterSource = vol * (100 - con) /100;
            double water = absoluteSpiritSource * (100 - resultCon) / resultCon - absoluteWaterSource;

            calculateTextView.setText(String.format(
                    getResources().getString(R.string.to_add), water));
        } catch (Exception e){
            Toast.makeText(this, getResources().getString(R.string.incorrect_data), Toast.LENGTH_SHORT).show();
        }


//        double water2 = con / resultCon * vol - vol;


    }
}
