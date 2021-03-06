package com.example.aisatsuapp;


import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);


    }
    @Override
    public void onClick(View v) {
        showTimePickerDialog();
    }


    private void showTimePickerDialog() {
        TimePickerDialog timePickerDialog = new TimePickerDialog(this,
                new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {


                        if ((hourOfDay >= 2) && (hourOfDay < 10)) {
                            TextView textView = (TextView) findViewById(R.id.textView);
                            textView.setText("おはよう");
                        } else if ((hourOfDay >= 10) && (hourOfDay < 18)) {
                            TextView textView = (TextView) findViewById(R.id.textView);
                            textView.setText("こんにちは");
                        } else if ((hourOfDay >= 18) && (hourOfDay < 24)) {
                            TextView textView = (TextView) findViewById(R.id.textView);
                            textView.setText("こんばんは");
                        } else {
                            TextView textView = (TextView) findViewById(R.id.textView);
                            textView.setText("こんばんは");

                        }

                    }

                },
                00, // 初期値（時間）
                00,  // 初期値（分）
                true);

        timePickerDialog.show();
    }

}

