package com.example.wong_learningtask41;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public EditText num1;
    public EditText num2;
    public EditText num3;
    public TextView result;
    String resultMessage;
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

            resultMessage = result + " is " + number1 +" + " + number2 + " + "+number3;

            // Create Bundle instance, this will allow transfer of data from Activity to DialogFragment
            Bundle args = new Bundle();
            args.putString("result", resultMessage);

            // Create a dialog instance
            DialogFragmentCustom dialogFragmentImp = new DialogFragmentCustom();
            // Pass on dialog argument(args), the result
            dialogFragmentImp.setArguments(args);
            // Display the Dialog
            dialogFragmentImp.show(getSupportFragmentManager(),"Display Result");
            // Reset EditTexts
            clearEditText();

        });
    }
    public void clearEditText() {
        num1.getText().clear();
        num2.getText().clear();
        num3.getText().clear();
    }
}