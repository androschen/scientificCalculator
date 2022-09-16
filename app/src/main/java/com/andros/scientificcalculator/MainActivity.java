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
    }

    public void button9Pressed(View view) {
    }

    public void buttonDeletePressed(View view) {
    }

    public void button4Pressed(View view) {
    }

    public void button5Pressed(View view) {
    }

    public void button6Pressed(View view) {
    }

    public void buttonClearPressed(View view) {
    }

    public void button1Pressed(View view) {
    }

    public void button2Pressed(View view) {
    }

    public void button3Pressed(View view) {
    }

    public void buttonAddPressed(View view) {
    }

    public void buttonMultiplePressed(View view) {
    }

    public void button0Pressed(View view) {
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