package com.example.rpg_game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class InstructionsActivity extends AppCompatActivity {

    private final String instructions = "gjknfgkndfgn";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions);

        TextView instructionText = findViewById(R.id.instructionsText);
        instructionText.setText(instructions);
    }

    public void setInstructions(View v){

    }
}