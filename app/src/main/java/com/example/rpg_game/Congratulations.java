package com.example.rpg_game;

import androidx.appcompat.app.AppCompatActivity;
import static com.example.rpg_game.GameplayActivity.defeatCount;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Congratulations extends AppCompatActivity {
    public int defeatCount = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_congratulations);
    }

    public void homePage(View v){
        Intent homePage = new Intent(this, MainActivity.class);
        startActivity(homePage);
    }
}