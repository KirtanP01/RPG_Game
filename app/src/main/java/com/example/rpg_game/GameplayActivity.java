package com.example.rpg_game;

import static com.example.rpg_game.CharacterSelectionActivity.HERO;
import static com.example.rpg_game.CharacterSelectionActivity.VILLAIN;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class GameplayActivity extends AppCompatActivity {
    ImageView heroView;
    ImageView villainView;
    TextView heroHealth;
    TextView villainHealth;
    boolean play;
    ImageButton play_pause_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameplay);
        heroView = (ImageView) findViewById(R.id.userCharacter);
        heroView.setImageResource(CharacterSelectionActivity.HERO.getImageID());
        villainView = (ImageView) findViewById(R.id.enemyCharacter);
        villainView.setImageResource(CharacterSelectionActivity.VILLAIN.getImageID());
        heroHealth = findViewById(R.id.playerHealthText);
        villainHealth = findViewById(R.id.enemyHealthText);
        heroHealth.setText((HERO.getHealth()) + "");
        villainHealth.setText((VILLAIN.getHealth()) + "");
        play = true;
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
        }, 3000);

//        while (HERO.getHealth() > 0 && VILLAIN.getHealth() > 0){
//            attack();
//        }
    }

    public void attack(View v){

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
        boolean play = true;

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