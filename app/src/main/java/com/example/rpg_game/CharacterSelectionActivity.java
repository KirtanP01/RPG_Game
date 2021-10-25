package com.example.rpg_game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class CharacterSelectionActivity extends AppCompatActivity {

    public static Character HERO;
    public static Character VILLAIN;

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


//    public void nextPage(View v){
//        Intent homePage = new Intent(this, GameplayActivity.class);
//        startActivity(homePage);
//    }

    int choice = 0;

    public void chooseOne(View v)
    {
        choice = 1;
       // ImageButton imageButtonC1 = (ImageButton)findViewById(R.id.characterOne);
      //  ImageButton imageButtonC2 = (ImageButton)findViewById(R.id.characterTwo);
      //  ImageButton imageButtonC3 = (ImageButton)findViewById(R.id.characterThree);
      //  imageButtonC1.setImageResource(R.drawable.knightzoomedselected);
      //  imageButtonC2.setImageResource(R.drawable.clockworkknightzoomed);
      //  imageButtonC3.setImageResource(R.drawable.championzoomed);
    }

    public void chooseTwo(View v)
    {
        choice = 2;
      //  ImageButton imageButtonC1 = (ImageButton)findViewById(R.id.characterOne);
      //  ImageButton imageButtonC2 = (ImageButton)findViewById(R.id.characterTwo);
      //  ImageButton imageButtonC3 = (ImageButton)findViewById(R.id.characterThree);
      //  imageButtonC1.setImageResource(R.drawable.knightzoomed);
      //  imageButtonC2.setImageResource(R.drawable.clockworkknightzoomedselected);
     //   imageButtonC3.setImageResource(R.drawable.championzoomed);
    }

    public void chooseThree(View v)
    {
        choice = 3;
       // ImageButton imageButtonC1 = (ImageButton)findViewById(R.id.characterOne);
       // ImageButton imageButtonC2 = (ImageButton)findViewById(R.id.characterTwo);
       // ImageButton imageButtonC3 = (ImageButton)findViewById(R.id.characterThree);
       // imageButtonC1.setImageResource(R.drawable.knightzoomed);
       // imageButtonC2.setImageResource(R.drawable.clockworkknightzoomed);
       // imageButtonC3.setImageResource(R.drawable.championzoomedselected);
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

        Intent intent = new Intent(this, GameplayActivity.class);
        startActivity(intent);
    }

}