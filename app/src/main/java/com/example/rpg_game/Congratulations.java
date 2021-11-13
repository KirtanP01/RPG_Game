package com.example.rpg_game;

import androidx.appcompat.app.AppCompatActivity;
//import static com.example.rpg_game.GameplayActivity.defeatCount;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Congratulations extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_congratulations);
    }

    public void restartGame(View v){
        //defeatCount = 0;
        Intent continueGame = new Intent(this, MainActivity.class);
        startActivity(continueGame);
    }
}