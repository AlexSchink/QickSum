package com.example.alexanderschink.qicksum;

import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView sumText;

    private double sum;
    private String aux1;
    private double aux2;
    private double aux3;


    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button buttonFrac;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonFrac = (Button) findViewById(R.id.buttonFrac);

        sumText = (TextView) findViewById(R.id.sumText);
        }



    public void ButtonPressed(View v) {

       Button pressed = (Button) v;
        aux1 = pressed.getText().toString();

       if (aux1 == "1/2") {
           aux2 = 0.5;
       } else if (aux1 == "1/3") {
            aux2 = 1.0/3;
        } else if (aux1 == "1/4") {
            aux2 = 0.25;
        } else {
           aux2 = Double.parseDouble(pressed.getText().toString());
       }

        button1.setText("1");
        button2.setText("2");
        button3.setText("3");

       Addition();
    }

    public void FractionPressed(View v) {

        button1.setText("1/2");
        button2.setText("1/3");
        button3.setText("1/4");

    }

    public void Addition() {
        sum += aux2;
        sumText.setText(Double.toString(sum));

    }

}
