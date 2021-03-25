package com.example.android_calculate;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {

    private TextView etMultiline;
    private Button btnOne;
    private Button btnTwo;
    private Button btnThree;
    private Button btnFour;
    private Button btnFive;
    private Button btnSix;
    private Button btnSeven;
    private Button btnEight;
    private Button btnNine;
    private Button btnPlus;
    private Button btnMinus;
    private Button btnDevi;
    private Button btnMulti;
    private Button btnComma;
    private Button btnZero;
    private Button btnClear;
    private Button btnSqrt;
    private Button btnBackFraction;
    private Button btnChangeSign;
    private Button btnResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etMultiline = (TextView) findViewById(R.id.etMultiline);
        initButtons();
    }

    @Override
    public void onClick(View v) {

    }

    private void initButtons() {
        btnOne = (Button) findViewById(R.id.btnOne);
        btnTwo = (Button) findViewById(R.id.btnTwo);
        btnThree = (Button) findViewById(R.id.btnThree);
        btnFour = (Button) findViewById(R.id.btnFour);
        btnFive = (Button) findViewById(R.id.btnFive);
        btnSix = (Button) findViewById(R.id.btnSix);
        btnSeven = (Button) findViewById(R.id.btnSeven);
        btnEight = (Button) findViewById(R.id.btnEight);
        btnNine = (Button) findViewById(R.id.btnNine);
        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        btnDevi = (Button) findViewById(R.id.btnDevi);
        btnMulti = (Button) findViewById(R.id.btnMulti);
        btnComma = (Button) findViewById(R.id.btnComma);
        btnBackFraction = (Button) findViewById(R.id.btnBackFraction);
        btnChangeSign = (Button) findViewById(R.id.btnChangeSign);
        btnClear = (Button) findViewById(R.id.btnClear);
        btnZero = (Button) findViewById(R.id.btnZero);
        btnSqrt = (Button) findViewById(R.id.btnSqrt);
        btnResult = (Button) findViewById(R.id.btnResult);

        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
        btnThree.setOnClickListener(this);
        btnFour.setOnClickListener(this);
        btnFive.setOnClickListener(this);
        btnSix.setOnClickListener(this);
        btnSeven.setOnClickListener(this);
        btnEight.setOnClickListener(this);
        btnNine.setOnClickListener(this);
        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnDevi.setOnClickListener(this);
        btnMulti.setOnClickListener(this);
        btnComma.setOnClickListener(this);
        btnBackFraction.setOnClickListener(this);
        btnChangeSign.setOnClickListener(this);
        btnClear.setOnClickListener(this);
        btnZero.setOnClickListener(this);
        btnSqrt.setOnClickListener(this);
        btnResult.setOnClickListener(this);

        return;
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}