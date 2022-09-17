package com.andros.scientificcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    TextView history;
    String historyText = "";
    EditText finalCount;
    String input = "";
    String currentNumber ="";
    Stack<Integer>number = new Stack<>();
    Stack<Character>op = new Stack<>();
    boolean opPressed = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        history = findViewById(R.id.history);
        finalCount = findViewById(R.id.finalCount);




    }

    public void button7Pressed(View view) {
        if(opPressed) {
            input = "";
            opPressed = false;
        }
        input += "7";
        currentNumber += "7";
        finalCount.setText(input);
    }

    public void button8Pressed(View view) {
        if(opPressed) {
            input = "";
            opPressed = false;
        }
        input += "8";
        currentNumber += "8";
        finalCount.setText(input);
    }

    public void button9Pressed(View view) {
        if(opPressed) {
            input = "";
            opPressed = false;
        }
        input += "9";
        currentNumber += "9";
        finalCount.setText(input);
    }

    public void buttonDeletePressed(View view) {
        if(op.empty()){
            input=input.substring(0,input.length()-1);
            currentNumber =input;
        }

        finalCount.setText(input);
    }

    public void button4Pressed(View view) {
        if(opPressed) {
            input = "";
            opPressed = false;
        }
        input += "4";
        currentNumber += "4";
        finalCount.setText(input);
    }

    public void button5Pressed(View view) {
        if(opPressed) {
            input = "";
            opPressed = false;
        }
        input += "5";
        currentNumber += "5";
        finalCount.setText(input);
    }

    public void button6Pressed(View view) {
        if(opPressed) {
            input = "";
            opPressed = false;
        }
        input += "6";
        currentNumber += "6";
        finalCount.setText(input);
    }

    public void buttonClearPressed(View view) {
        historyText = "";
        history.setText("");
        finalCount.setText("");
        input = "";
        currentNumber = "";
        opPressed = false;
        op.clear();
        number.clear();
    }

    public void button1Pressed(View view) {
        if(opPressed) {
            input = "";
            opPressed = false;
        }
        input += "1";
        currentNumber += "1";
        finalCount.setText(input);
    }

    public void button2Pressed(View view) {
        if(opPressed) {
            input = "";
            opPressed = false;
        }
        input += "2";
        currentNumber += "2";
        finalCount.setText(input);
    }

    public void button3Pressed(View view) {
        if(opPressed) {
            input = "";
            opPressed = false;
        }
        input += "3";
        currentNumber += "3";
        finalCount.setText(input);
    }

    void buttonOpPressed(Character currentOp){
        opPressed = true;
        historyText += "" + currentNumber + currentOp;
        finalCount.setText("");
        history.setText(historyText);
        if(op.empty()){
            String num = currentNumber;
            currentNumber = "";
            number.push(Integer.parseInt(num));
            op.push(currentOp);
            finalCount.setText("" + num);
        }else{
            Character ops = op.peek();
            Integer temp = 0;
            if(ops=='+'){
                temp = number.peek() + Integer.parseInt(currentNumber);
            }else if(ops=='x') {
                temp = number.peek() * Integer.parseInt(currentNumber);
            }else if(ops=='-'){
                temp = number.peek() - Integer.parseInt(currentNumber);
            }
            input = String.valueOf(temp);
            finalCount.setText(input);
            number.pop();
            number.push(temp);
            op.pop();
            op.push(currentOp);
            currentNumber ="";
            System.out.println(temp);
        }
    }

    public void buttonAddPressed(View view) {
        buttonOpPressed('+');
    }

    public void buttonMultiplePressed(View view) {
        buttonOpPressed('x');
    }

    public void buttonSubPressed(View view) {
        buttonOpPressed('-');
    }

    public void button0Pressed(View view) {
        input += "0";
        currentNumber += "0";
        finalCount.setText(input);
    }

    public void buttonDivisionPressed(View view) {
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
        buttonOpPressed('=');
    }
}