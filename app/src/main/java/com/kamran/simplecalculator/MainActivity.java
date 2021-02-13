package com.kamran.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num1Text;
    EditText num2Text;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1Text = findViewById(R.id.num1Text);
        num2Text = findViewById(R.id.num2Text);
        resultText = findViewById(R.id.resultText);

        num1Text.getText().toString();
    }


    public void sum(View view) {
        if (num1Text.getText().toString().matches("") || num2Text.getText().toString().matches("")) {
            resultText.setText("Enter Number!!!");
        } else {
            int number1 = Integer.parseInt(num1Text.getText().toString());
            int number2 = Integer.parseInt(num2Text.getText().toString());
            int result = number1 + number2;
            resultText.setText("Result: " + result);
        }


    }

    public void deduct(View view) {
        if (num1Text.getText().toString().matches("") || num2Text.getText().toString().matches("")) {
            resultText.setText("Enter Number!!!");
        } else {
            int number1 = Integer.parseInt(num1Text.getText().toString());
            int number2 = Integer.parseInt(num2Text.getText().toString());
            int result = number1 - number2;
            resultText.setText("Result: " + result);
        }


    }

    public void multiply(View view) {
        if (num1Text.getText().toString().matches("") || num2Text.getText().toString().matches("")) {
            resultText.setText("Enter Number!!!");
        } else {
            int number1 = Integer.parseInt(num1Text.getText().toString());
            int number2 = Integer.parseInt(num2Text.getText().toString());
            int result = number1 * number2;
            resultText.setText("Result: " + result);
        }


    }

    public void divide(View view) {
        if (num1Text.getText().toString().matches("") || num2Text.getText().toString().matches("")) {
            resultText.setText("Enter Number!!!");
        } else {
            int number1 = Integer.parseInt(num1Text.getText().toString());
            int number2 = Integer.parseInt(num2Text.getText().toString());
            int result = number1 / number2;
            resultText.setText("Result: " + result);
        }


    }
}