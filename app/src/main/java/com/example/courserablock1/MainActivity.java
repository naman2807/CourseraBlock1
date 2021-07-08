package com.example.courserablock1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button blueButton;
    Button pinkButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        blueButton = findViewById(R.id.button_blueInvisible);
        blueButton.setOnClickListener(this);
        pinkButton = findViewById(R.id.button_pinkPanther);
        pinkButton.setOnClickListener(this);
    }

    public void toDo(View v){
        if(v.equals(blueButton)){
            blueButton.setVisibility(View.INVISIBLE);
        }else if(v.equals(pinkButton)){
            Toast.makeText(getApplicationContext(),"to do to do to do", Toast.LENGTH_SHORT).show();
        }
    }
}