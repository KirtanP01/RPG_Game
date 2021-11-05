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
import android.widget.Toast;

public class GameplayActivity extends AppCompatActivity {
    ImageView heroView;
    ImageView villainView;
    TextView heroHealth;
    TextView villainHealth;
    boolean play;
    ImageButton play_pause_button;
    int defeatCount = 0;
    int playIndex;
    double originalVHealth;
    Intent i;

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
        originalVHealth = VILLAIN.getHealth();
//        heroHealth.setText((HERO.getHealth()) + "");
//        villainHealth.setText((VILLAIN.getHealth()) + "");
        //updateHealth();
        //play = true;
//        playIndex = 0;
        //play_pause_button = findViewById(R.id.play_pause_button);
        playGame();
//        if (playIndex >= 1){
//            playGame();
//        }
        /*
            This method automatically opens up the math question activity and asks the user a math question
         */
        // https://stackoverflow.com/questions/7965494/how-to-put-some-delay-in-calling-an-activity-from-another-activity
//        if (playIndex == 0) {
//            playIndex++;
//            new Handler().postDelayed(new Runnable() {
//                @Override
//                public void run() {
//                    i = new Intent(GameplayActivity.this, mathQuestion.class);
//                    startActivity(i);
//                }
//            }, 5000);
//        }

    }
        // https://developer.android.com/guide/components/activities/activity-lifecycle
        public void playGame () {

            while (defeatCount < 3) {

                i = new Intent(GameplayActivity.this, mathQuestion.class);
                startActivity(i);
                if (VILLAIN.getHealth() <= 0) {
                    Toast.makeText(this, "The monster has been defeated! A new monster appeared!", Toast.LENGTH_SHORT).show();
                    defeatCount++;
                    if (defeatCount == 3) {
                        Intent congrats = new Intent(this, Congratulations.class);
                        startActivity(congrats);
                    }
                    HERO.setHealth(100);
                    VILLAIN.setHealth(originalVHealth + 5);
                    originalVHealth = VILLAIN.getHealth();
                    VILLAIN.setVillainDamage(VILLAIN.getDamage() + 5);
                }
                //updateHealth();
                VILLAIN.dealDamage(HERO);
                updateHealth();
                Toast.makeText(this, "The villain dealt " + VILLAIN.getDamage() + " damage!", Toast.LENGTH_SHORT).show();
                if (HERO.getHealth() <= 0) {
                    Intent gameOver = new Intent(this, GameOver.class);
                    startActivity(gameOver);
                }
            }
        }

        public void updateHealth () {
            heroHealth.setText((HERO.getHealth()) + "");
            villainHealth.setText((VILLAIN.getHealth()) + "");
        }

        public void homePage (View v){
            Intent homePage = new Intent(this, MainActivity.class);
            startActivity(homePage);
        }

//    public void pauseMenu(View view)
//    {
//        Intent pauseMenu = new Intent(this, PauseActivity.class);
//        startActivity(pauseMenu);
//    }

        public void pauseGame (View v){
            boolean play = true;

            if (play) {
                onPause();
                play = false;
                play_pause_button.setImageResource(R.drawable.pauseicon);
            } else if (!play) {
                onResume();
                play = true;
                play_pause_button.setImageResource(R.drawable.playicon);
            }

        }
    }
