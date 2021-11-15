package com.example.rpg_game;

import static com.example.rpg_game.CharacterSelectionActivity.HERO;
import static com.example.rpg_game.CharacterSelectionActivity.VILLAIN;
//import static com.example.rpg_game.mathQuestion.canAttack;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class GameplayActivity extends AppCompatActivity { ;
    ImageView heroView;
    ImageView villainView;
    TextView heroHealth;
    TextView villainHealth;
    boolean play;
    public static int defeatCount = 0;
    ImageButton play_pause_button;
    int playIndex;
    public boolean stop = false;
    double originalVHealth;
    Intent i;

    int backgroundImage2 = R.drawable.mediumdifficulty;

    Character villain1 = new Character(100,10, R.drawable.boss);
    Character villain2 = new Character(150,20, R.drawable.boss2);
    Character villain3 = new Character(200,30, R.drawable.boss3);

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
        updateHealth();
        stop = false;
        if(defeatCount < 3){
            playGame();
        }
    }

    public void playGame()
    {
        /*defeatCount = 0;*/
        updateHealth();
            if (playIndex == 0)
            {
                /*
                   This method automatically opens up the math question activity and asks the user a math question
                 */
                // https://stackoverflow.com/questions/7965494/how-to-put-some-delay-in-calling-an-activity-from-another-activity
                playIndex++;
                Handler handler = new Handler();
                handler.postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        if (stop)
                        {
                            handler.removeCallbacksAndMessages(null);
                        }
                        else
                        {
                            i = new Intent(GameplayActivity.this, mathQuestion.class);
                            startActivity(i);
                        }
                    }
                }, 4000);
            }

        if (defeatCount == 0)
        {
            ConstraintLayout background1 = (ConstraintLayout) findViewById(R.id.gameplayActivityXML);
            background1.setBackgroundResource(R.drawable.background);

            ImageView ground1 = (ImageView) findViewById(R.id.ground);
            ground1.setImageResource(R.drawable.grassground);
        }

        if (defeatCount == 1)
        {
            ConstraintLayout background2 = (ConstraintLayout) findViewById(R.id.gameplayActivityXML);
            background2.setBackgroundResource(R.drawable.desert);

            ImageView ground3 = (ImageView) findViewById(R.id.ground);
            ground3.setImageResource(R.drawable.perfectsandground);
        }

        if (defeatCount == 2)
        {
            ConstraintLayout background3 = (ConstraintLayout) findViewById(R.id.gameplayActivityXML);
            background3.setBackgroundResource(R.drawable.finalbossbackground);

            ImageView ground3 = (ImageView) findViewById(R.id.ground);
            ground3.setImageResource(R.drawable.obsidianground);
        }

        if (VILLAIN.getHealth() <= 0)
        {
            defeatCount++;

            stop = true;

            if (defeatCount < 3)
            {
                Toast.makeText(this, "The monster has been defeated! A new monster appeared!", Toast.LENGTH_SHORT).show();
            }

            if(defeatCount == 1)
            {
                Toast.makeText(this, "The monster has been defeated! A new monster appeared!", Toast.LENGTH_SHORT).show();
                VILLAIN.setHealth(100 + 50);
                VILLAIN.setImageID(villain2.getImageID());
                //VILLAIN.setVillainDamage(HERO.getDamage() + 5);

                HERO.setHealth(100);

                stop = false;
            }
            else if(defeatCount == 2)
            {
                Toast.makeText(this, "The monster has been defeated! A new monster appeared!", Toast.LENGTH_SHORT).show();
                VILLAIN.setHealth(150 + 50);
                VILLAIN.setImageID(villain3.getImageID());
                //VILLAIN.setVillainDamage(HERO.getDamage() + 10);

                HERO.setHealth(100);

                stop = false;
            }

            else if (defeatCount == 3)
            {
                stop = true;

                Intent congrats = new Intent(this, Congratulations.class);
                startActivity(congrats);
                defeatCount = 0;
            }

//            else if (defeatCount >= 4)
//            {
//                stop = false;
//                defeatCount = 0;
//            }

            //originalVHealth = VILLAIN.getHealth();
            //VILLAIN.setVillainDamage(VILLAIN.getDamage() + 5);
        }

        if (HERO.getHealth() <= 0)
        {
            stop = true;

            Intent gameOver = new Intent(this, GameOver.class);
            startActivity(gameOver);
            defeatCount = 0;
        }
    }

        public void updateHealth () {
            heroHealth.setText((HERO.getHealth()) + " HP");
            villainHealth.setText((VILLAIN.getHealth()) + " HP");
        }

        public void homePage (View v){
            Intent homePage = new Intent(this, MainActivity.class);
            startActivity(homePage);
        }

        public void pauseGame (View v) {
            stop = true;
            Intent pauseGame = new Intent(this,truePauseActivity.class);
            startActivity(pauseGame);
        }
    }
