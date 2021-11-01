package com.example.rpg_game;

import static com.example.rpg_game.CharacterSelectionActivity.HERO;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class GameplayActivity extends AppCompatActivity {

    ImageView heroView;
    ImageView villainView;
    boolean play;
    ImageButton play_pause_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameplay);
        play = true;
        heroView = (ImageView) findViewById(R.id.userCharacter);
        heroView.setImageResource(CharacterSelectionActivity.HERO.getImageID());
        villainView = (ImageView) findViewById(R.id.enemyCharacter);
        villainView.setImageResource(CharacterSelectionActivity.VILLAIN.getImageID());
        play_pause_button = findViewById(R.id.play_pause_button);
        /*
            This method automatically opens up the math question activity and asks the user a math question
         */
        // https://stackoverflow.com/questions/7965494/how-to-put-some-delay-in-calling-an-activity-from-another-activity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i= new Intent(GameplayActivity.this,mathQuestion.class);
                startActivity(i);
            }
        }, 10000);

    }

    public void homePage(View v){
        Intent homePage = new Intent(this, MainActivity.class);
        startActivity(homePage);
    }

//    public void pauseMenu(View view)
//    {
//        Intent pauseMenu = new Intent(this, PauseActivity.class);
//        startActivity(pauseMenu);
//    }

    public void pauseGame(View v){
        if(play){
            onPause();
            play = false;
            play_pause_button.setImageResource(R.drawable.pauseicon);
        }

        else if(!play){
            onResume();
            play = true;
            play_pause_button.setImageResource(R.drawable.playicon);
        }
    }
}