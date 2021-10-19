package com.example.rpg_game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class instructionsActivity extends AppCompatActivity {

    private final String instructions = "Welcome! In this game you will be fighting monsters. You and your opponent will take turns attacking one another. When it’s your turn, you will be given a math problem. You must answer the question correctly to deal damage. You will lose health every time your opponent attacks, so try to defeat as many monsters before you perish!\n";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions);

        TextView instructionText = findViewById(R.id.instructionsText);
        instructionText.setText(instructions);
    }

    public void homePage(View v){
        Intent homePage = new Intent(this, MainActivity.class);
        startActivity(homePage);
    }

    public void nextPage(View v){
        Intent nextPage = new Intent(this, CharacterSelectionActivity.class);
        startActivity(nextPage);
    }
}