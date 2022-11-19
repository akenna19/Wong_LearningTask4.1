package com.example.wong_learningtask41;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private EditText num3;
    private TextView result;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        num3 = findViewById(R.id.num3);
        Button add = findViewById(R.id.btnAdd);
        result = findViewById(R.id.answer);

        add.setOnClickListener(view -> {
            int number1 = Integer.parseInt(num1.getText().toString());
            int number2 = Integer.parseInt(num2.getText().toString());
            int number3 = Integer.parseInt(num3.getText().toString());
            int sum = number1 + number2 + number3;
            result.setText("Answer: " + sum);
        });
    }
}