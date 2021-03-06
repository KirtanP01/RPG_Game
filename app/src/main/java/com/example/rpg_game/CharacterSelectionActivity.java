package com.example.rpg_game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
//import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;
//import android.widget.RelativeLayout;

public class CharacterSelectionActivity extends AppCompatActivity {

    public static Character HERO;
    public static Character VILLAIN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_selection);

        ImageButton imageButtonC1 = (ImageButton)findViewById(R.id.characterOne);
        imageButtonC1.setImageResource(R.drawable.knights);

        ImageButton imageButtonC2 = (ImageButton)findViewById(R.id.characterTwo);
        imageButtonC2.setImageResource(R.drawable.clockworkknight);

        ImageButton imageButtonC3 = (ImageButton)findViewById(R.id.characterThree);
        imageButtonC3.setImageResource(R.drawable.champion);
    }

    public void homePage(View v){
        Intent homePage = new Intent(this, MainActivity.class);
        startActivity(homePage);
    }

    int choice = 0;

    public void chooseOne(View v)
    {
        choice = 1;
        ImageButton imageButtonC1 = (ImageButton)findViewById(R.id.characterOne);
        ImageButton imageButtonC2 = (ImageButton)findViewById(R.id.characterTwo);
        ImageButton imageButtonC3 = (ImageButton)findViewById(R.id.characterThree);
        imageButtonC1.setImageResource(R.drawable.knightselected);
        imageButtonC2.setImageResource(R.drawable.clockworkknight);
        imageButtonC3.setImageResource(R.drawable.champion);
    }

    public void chooseTwo(View v)
    {
        choice = 2;
        ImageButton imageButtonC1 = (ImageButton)findViewById(R.id.characterOne);
        ImageButton imageButtonC2 = (ImageButton)findViewById(R.id.characterTwo);
        ImageButton imageButtonC3 = (ImageButton)findViewById(R.id.characterThree);
        imageButtonC1.setImageResource(R.drawable.knights);
        imageButtonC2.setImageResource(R.drawable.clockworkknightselected);
        imageButtonC3.setImageResource(R.drawable.champion);
    }

    public void chooseThree(View v)
    {
        choice = 3;
        ImageButton imageButtonC1 = (ImageButton)findViewById(R.id.characterOne);
        ImageButton imageButtonC2 = (ImageButton)findViewById(R.id.characterTwo);
        ImageButton imageButtonC3 = (ImageButton)findViewById(R.id.characterThree);
        imageButtonC1.setImageResource(R.drawable.knights);
        imageButtonC2.setImageResource(R.drawable.clockworkknight);
        imageButtonC3.setImageResource(R.drawable.championselected);
    }

    public void startGame(View v){
        Character hero = new Character(100, 15, R.drawable.knights);
        Character villain = new Character(100,5, R.drawable.boss);

        if (choice == 1) {
            hero.setImageID(R.drawable.knights);
        }
        if (choice == 2){
            hero.setImageID(R.drawable.clockworkknight);
        }
        else if (choice == 3){
            hero.setImageID(R.drawable.champion);
        }

        HERO = hero;
        VILLAIN = villain;

        // If a hero is not selected, the app will send the user a message and not start the game
        if(choice == 0)
        {
            Toast.makeText(this, "Please select your Hero!", Toast.LENGTH_SHORT).show();
        }
        // Game starts if a hero is selected
        else
        {
            Intent intent = new Intent(this, GameplayActivity.class);
            startActivity(intent);
        }
    }

}