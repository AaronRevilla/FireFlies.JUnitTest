package com.example.aaron.junittest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1txt;
    EditText num2txt;
    TextView result;

    int num1;
    int num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1txt = ((EditText) findViewById(R.id.num1));
        num2txt = ((EditText) findViewById(R.id.num2));
        result = ((TextView) findViewById(R.id.result));
    }

    public void sum(View view) {

        num1 = Integer.parseInt(num1txt.getText().toString());
        num2 = Integer.parseInt(num2txt.getText().toString());

        int res = MathExample.sum(num1, num2);

        setResult(String.valueOf(res));
    }

    public void multiply(View view) {
        num1 = Integer.parseInt(num1txt.getText().toString());
        num2 = Integer.parseInt(num2txt.getText().toString());

        int res = MathExample.times(num1, num2);

        setResult(String.valueOf(res));
    }

    public void setResult(String res){
        result.setText(res);
    }
}
