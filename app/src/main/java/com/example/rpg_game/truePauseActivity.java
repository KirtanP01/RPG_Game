package com.example.rpg_game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class truePauseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_true_pause);
    }

    public void continueGame(View v){
        Intent continueGame = new Intent(this, GameplayActivity.class);
        startActivity(continueGame);
    }

    public void restartGame(View v){
        Intent continueGame = new Intent(this, MainActivity.class);
        startActivity(continueGame);
    }
}