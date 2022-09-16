package com.andros.scientificcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    TextView history;
    EditText finalCount;
    String input = "";
    String numb="";
    Stack<Integer>number = new Stack<>();
    Stack<Character>op = new Stack<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        history = findViewById(R.id.history);
        finalCount = findViewById(R.id.finalCount);




    }

    public void button7Pressed(View view) {
        input += "7";
        numb += "7";
        finalCount.setText(input);
    }

    public void button8Pressed(View view) {
        input += "8";
        numb += "8";
        finalCount.setText(input);
    }

    public void button9Pressed(View view) {
        input += "9";
        numb += "9";
        finalCount.setText(input);
    }

    public void buttonDeletePressed(View view) {
        if(op.empty()){
            input=input.substring(0,input.length()-1);
            numb=input;
        }

        finalCount.setText(input);
    }

    public void button4Pressed(View view) {
        input += "4";
        numb += "4";
        finalCount.setText(input);
    }

    public void button5Pressed(View view) {
        input += "5";
        numb += "5";
        finalCount.setText(input);
    }

    public void button6Pressed(View view) {
        input += "6";
        numb += "6";
        finalCount.setText(input);
    }

    public void buttonClearPressed(View view) {
    }

    public void button1Pressed(View view) {
        input += "1";
        numb += "1";
        finalCount.setText(input);
    }

    public void button2Pressed(View view) {
        input += "2";
        numb += "2";
        finalCount.setText(input);
    }

    public void button3Pressed(View view) {
        input += "3";
        numb += "3";
        finalCount.setText(input);
    }

    public void buttonAddPressed(View view) {
        input+="+";
        finalCount.setText(input);
        if(op.empty()){
            String num = numb;
            numb = "";
            number.push(Integer.parseInt(num));
            op.push('+');
        }else{
            Character ops = op.peek();
            if(ops=='+'){
                Integer temp = number.peek()+Integer.parseInt(numb);
                input = String.valueOf(temp+"+");
                finalCount.setText(input);
                number.pop();
                number.push(temp);
                op.push('+');
                numb="";
                System.out.println(temp);
            }
            op.pop();
        }
        System.out.println(input+" "+numb);
    }

    public void buttonMultiplePressed(View view) {
    }

    public void button0Pressed(View view) {
        input += "0";
        numb += "0";
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