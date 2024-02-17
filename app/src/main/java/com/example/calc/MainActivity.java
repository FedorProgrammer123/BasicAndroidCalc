package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView ResultField;
        EditText FirstValue, SecondValue;
        Button buttonPlus, buttonMinus, buttonUmn, buttonDel;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirstValue = findViewById(R.id.FirstValue);
        SecondValue = findViewById(R.id.SecondValue);
        buttonPlus = findViewById(R.id.buttonPlus);
        buttonMinus = findViewById(R.id.buttonMinus);
        buttonUmn = findViewById(R.id.buttonUmn);
        buttonDel = findViewById(R.id.buttonDel);
        ResultField = findViewById(R.id.ReusltField);
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float a = Float.parseFloat(FirstValue.getText().toString());
                float b = Float.parseFloat(SecondValue.getText().toString());
                float res = a + b;
                ResultField.setText(String.valueOf(res));
            }
        });
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float a = Float.parseFloat(FirstValue.getText().toString());
                float b = Float.parseFloat(SecondValue.getText().toString());
                float res = a - b;
                ResultField.setText(String.valueOf(res));
            }
        });
        buttonUmn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float a = Float.parseFloat(FirstValue.getText().toString());
                float b = Float.parseFloat(SecondValue.getText().toString());
                float res = a * b;
                ResultField.setText(String.valueOf(res));
            }
        });
        buttonDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float a = Float.parseFloat(FirstValue.getText().toString());
                float b = Float.parseFloat(SecondValue.getText().toString());
                float res = a / b;
                ResultField.setText(String.valueOf(res));
            }
        });
    }
}