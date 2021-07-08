package com.example.courserablock1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button blueButton;
    Button pinkButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        blueButton = findViewById(R.id.button_blueInvisible);
        pinkButton = findViewById(R.id.button_pinkPanther);
    }

    public void toDo(View v){
        if(v.equals(blueButton)){
            blueButton.setVisibility(View.INVISIBLE);
        }
    }
}