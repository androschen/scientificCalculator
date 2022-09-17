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

    void isOpPressed(){
        if(opPressed) {
            input = "";
            opPressed = false;
        }
    }

    void numberPressed(Character number){
        input += number;
        currentNumber += number;
        finalCount.setText(input);
    }

    public void button0Pressed(View view) {
        isOpPressed();
        numberPressed('0');
    }

    public void button1Pressed(View view) {
        isOpPressed();
        numberPressed('1');
    }

    public void button2Pressed(View view) {
        isOpPressed();
        numberPressed('2');
    }

    public void button3Pressed(View view) {
        isOpPressed();
        numberPressed('3');
    }

    public void button4Pressed(View view) {
        isOpPressed();
        numberPressed('4');
    }

    public void button5Pressed(View view) {
        isOpPressed();
        numberPressed('5');
    }

    public void button6Pressed(View view) {
        isOpPressed();
        numberPressed('6');
    }

    public void button7Pressed(View view) {
        isOpPressed();
        numberPressed('7');
    }

    public void button8Pressed(View view) {
        isOpPressed();
        numberPressed('8');
    }

    public void button9Pressed(View view) {
        isOpPressed();
        numberPressed('9');
    }

    public void buttonDeletePressed(View view) {
        if(op.empty()){
            input=input.substring(0,input.length()-1);
            currentNumber =input;
        }
        finalCount.setText(input);
    }

    public void buttonClearPressed(View view) {
        //clear all, go to history (fragment)
        historyText = "";
        history.setText("");
        finalCount.setText("");
        input = "";
        currentNumber = "";
        opPressed = false;
        op.clear();
        number.clear();
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
            System.out.println("peek : " + number.peek() + ", currentNumber : " + currentNumber);
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

    void  checkOpValid(Character op){
        if(!opPressed){
            buttonOpPressed(op);
        }
    }

    public void buttonAddPressed(View view) {
        checkOpValid('+');
    }

    public void buttonMultiplePressed(View view) {
        checkOpValid('x');
    }

    public void buttonSubPressed(View view) {
        checkOpValid('-');
    }

    public void buttonCountPressed(View view) {
        checkOpValid('=');
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
}