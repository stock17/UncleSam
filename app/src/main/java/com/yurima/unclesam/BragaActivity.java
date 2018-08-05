package com.yurima.unclesam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class BragaActivity extends AppCompatActivity {

    @BindView(R.id.braga_waterEditText)
    EditText waterEditText;

    @BindView(R.id.braga_sugarEditText)
    EditText sugarEditText;

    @BindView(R.id.braga_gmcheckbox)
    CheckBox gmCheckBox;

    @BindView(R.id.braga_gmSpinner)
    Spinner spinner;

    @BindView(R.id.braga_volumeEditText)
    EditText volumeEditText;

    @BindView(R.id.braga_amountEditText)
    EditText amountEditText;

    @BindView(R.id.braga_calculateButton)
    Button calculateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_braga);
        ButterKnife.bind(this);
    }

    @OnClick (R.id.braga_calculateButton)
    public void OnCalculateClick() {
        String waterText = waterEditText.getText().toString();
        String sugarText = sugarEditText.getText().toString();
        String volumeText = volumeEditText.getText().toString();
        String amountText = amountEditText.getText().toString();


    }
}
