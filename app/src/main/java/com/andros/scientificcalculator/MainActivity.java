package com.andros.scientificcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    TextView history;
    EditText finalCount;
    String input = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        history = findViewById(R.id.history);
        finalCount = findViewById(R.id.finalCount);


    }

    public void button7Pressed(View view) {
        input += "7";
        finalCount.setText(input);
    }

    public void button8Pressed(View view) {
        input += "8";
        finalCount.setText(input);
    }

    public void button9Pressed(View view) {
        input += "9";
        finalCount.setText(input);
    }

    public void buttonDeletePressed(View view) {
        input=input.substring(0,input.length()-1);
        finalCount.setText(input);
    }

    public void button4Pressed(View view) {
        input += "4";
        finalCount.setText(input);
    }

    public void button5Pressed(View view) {
        input += "5";
        finalCount.setText(input);
    }

    public void button6Pressed(View view) {
        input += "6";
        finalCount.setText(input);
    }

    public void buttonClearPressed(View view) {
    }

    public void button1Pressed(View view) {
        input += "1";
        finalCount.setText(input);
    }

    public void button2Pressed(View view) {
        input += "2";
        finalCount.setText(input);
    }

    public void button3Pressed(View view) {
        input += "3";
        finalCount.setText(input);
    }

    public void buttonAddPressed(View view) {
    }

    public void buttonMultiplePressed(View view) {
    }

    public void button0Pressed(View view) {
        input += "0";
        finalCount.setText(input);
    }

    public void buttonDivisionPressed(View view) {
    }

    public void buttonSubPressed(View view) {
    }

    public void buttonAbsPressed(View view) {
    }

    public void buttonFactPressed(View view) {
    }

    public void buttonLogPressed(View view) {
    }

    public void buttonModPressed(View view) {
    }

    public void buttonCountPressed(View view) {
    }
}