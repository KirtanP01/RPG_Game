package com.example.rpg_game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CharacterSelectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_selection);
    }

    public void homePage(View v){
        Intent homePage = new Intent(this, MainActivity.class);
        startActivity(homePage);
    }
}