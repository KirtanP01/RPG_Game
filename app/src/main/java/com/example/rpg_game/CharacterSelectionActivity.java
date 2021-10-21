package com.example.rpg_game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class CharacterSelectionActivity extends AppCompatActivity {

    public static final String EXTRA_HERO = "com.example.CharacterSelectionActivity.HERO";;
    //public static final int EXTRA_BOSS = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_selection);

        ImageButton imageButtonC1 = (ImageButton)findViewById(R.id.characterOne);
        imageButtonC1.setImageResource(R.drawable.knightzoomed);

        ImageButton imageButtonC2 = (ImageButton)findViewById(R.id.characterTwo);
        imageButtonC2.setImageResource(R.drawable.clockworkknightzoomed);

        ImageButton imageButtonC3 = (ImageButton)findViewById(R.id.characterThree);
        imageButtonC3.setImageResource(R.drawable.championzoomed);
    }


    public void homePage(View v){
        Intent homePage = new Intent(this, MainActivity.class);
        startActivity(homePage);
    }

    int choice = 0;

    public void chooseOne(View v)
    {
        choice = 1;
    }

    public void chooseTwo(View v)
    {
        choice = 2;
    }

    public void chooseThree(View v)
    {
        choice = 3;
    }

//    switch (choice){
//        case1 :
//            EXTRA_HERO = "knights.png";
//            break;
//    }

}