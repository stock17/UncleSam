package com.yurima.unclesam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.yurima.unclesam.R.id.calculateTextView;
import static com.yurima.unclesam.R.id.resultConcentrationEditText;
import static com.yurima.unclesam.R.id.sourceConcentrationEditText;
import static com.yurima.unclesam.R.id.sourceVolumeEditText;
import static com.yurima.unclesam.R.id.sourceConcentrationEditText;
import static com.yurima.unclesam.R.id.sourceVolumeEditText;

public class FillActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_fill);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.calculateButton)
    public void onCalculateButtonClick(){
        double vol = Double.parseDouble(sourceVolumeEditText.getText().toString());
        double con = Double.parseDouble(sourceConcentrationEditText.getText().toString());
        double resultCon = Double.parseDouble(resultConcentrationEditText.getText().toString());
        double absoluteSpiritSource = vol * con / 100;
        double absoluteWaterSource = vol * (100 - con) /100;
        double x = absoluteSpiritSource * (100 - resultCon) / resultCon - absoluteWaterSource;
        calculateTextView.setText(String.format("add %.2f", x));
    }
}
