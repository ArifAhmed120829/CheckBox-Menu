package com.example.menucheckbox;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(),Activity2.class);
                startActivity(i);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(view.getContext(),Activity3.class);
                startActivity(i2);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu1,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        //Handling the item Selection
        switch (item.getItemId()){
            case R.id.load:
                Toast.makeText(this, "Loading File...", Toast.LENGTH_SHORT).show();
                break;
            case R.id.save:
                Toast.makeText(this, "Saving File...", Toast.LENGTH_SHORT).show();
                break;
            case R.id.neww:
                Toast.makeText(this, "Creating New File...", Toast.LENGTH_SHORT).show();
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }
    public void method1(View view){
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()){
            case R.id.checkBox:
                if (checked)
                    Toast.makeText(this, "Student", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(this, "Not a student", Toast.LENGTH_SHORT).show();
                break;
            case R.id.checkBox2:
                if (checked)
                    Toast.makeText(this, "Teacher", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(this, "Not a Teacher", Toast.LENGTH_SHORT).show();
                break;
            case R.id.checkBox3:
                if (checked)
                    Toast.makeText(this, "School Nurse", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(this, "Not a Nurse", Toast.LENGTH_SHORT).show();
                break;
            case R.id.checkBox4:
                if (checked)
                    Toast.makeText(this, "Teaching Assistant", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(this, "Not a assistant", Toast.LENGTH_SHORT).show();
                break;
            case R.id.checkBox5:
                if (checked)
                    Toast.makeText(this, "School_Bus_Driver", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(this, "Not a Driver", Toast.LENGTH_SHORT).show();
                break;


        }
    }
}