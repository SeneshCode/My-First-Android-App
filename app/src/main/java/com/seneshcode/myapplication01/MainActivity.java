package com.seneshcode.myapplication01;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.rg);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.green : getWindow().getDecorView().setBackgroundColor(Color.parseColor("#00FF00"));
                    break;
                    case R.id.red : getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FF0000"));
                    break;
                    case R.id.blue : getWindow().getDecorView().setBackgroundColor(Color.parseColor("#0000FF"));
                    break;
                }
            }
        });
    }
}