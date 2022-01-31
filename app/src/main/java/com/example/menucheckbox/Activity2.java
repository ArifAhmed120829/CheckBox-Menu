package com.example.menucheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        RadioGroup group = findViewById(R.id.radiogrp);
        RadioButton r1 = findViewById(R.id.coach1);
        RadioButton r2 = findViewById(R.id.adviser1);
        RadioButton r3 = findViewById(R.id.guard1);
    }
    public void onRadiobuttonclicked(View view){
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()){
            case R.id.coach1:
                if(checked)
                    Toast.makeText(this, "A coach works within a school's athletic department", Toast.LENGTH_SHORT).show();
                break;
            case R.id.adviser1:
                if(checked)
                    Toast.makeText(this, "They advise students about academic decisions", Toast.LENGTH_SHORT).show();
                break;
            case R.id.guard1:
                if(checked)
                    Toast.makeText(this, "Crossing guards help students safely board buses", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}