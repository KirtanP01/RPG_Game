package com.example.rpg_game;

import static com.example.rpg_game.CharacterSelectionActivity.HERO;
import static com.example.rpg_game.CharacterSelectionActivity.VILLAIN;
import static com.example.rpg_game.mathQuestion.canAttack;

import androidx.appcompat.app.AppCompatActivity;

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
    public static int defeatCount;
    ImageButton play_pause_button;
    int playIndex;
    public boolean stop = false;
    double originalVHealth;
    Intent i;

    Character villain2 = new Character(150,10, R.drawable.boss2);
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
//        heroHealth.setText((HERO.getHealth()) + "");
//        villainHealth.setText((VILLAIN.getHealth()) + "");
        updateHealth();
        //play = true;
//        playIndex = 0;
        //play_pause_button = findViewById(R.id.play_pause_button);
        playGame();
//        if (playIndex >= 1){
//            playGame();
//        }
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
                }, 6000);
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

                HERO.setHealth(100);

                stop = false;
            }
            else if(defeatCount == 2)
            {
                Toast.makeText(this, "The monster has been defeated! A new monster appeared!", Toast.LENGTH_SHORT).show();
                VILLAIN.setHealth(150 + 50);
                VILLAIN.setImageID(villain3.getImageID());

                HERO.setHealth(100);

                stop = false;
            }
            else if (defeatCount == 3)
            {
                stop = false;

                Intent congrats = new Intent(this, Congratulations.class);
                startActivity(congrats);
            }

            else if (defeatCount >= 4)
            {
                stop = false;
                defeatCount = 0;
            }

            //originalVHealth = VILLAIN.getHealth();
            //VILLAIN.setVillainDamage(VILLAIN.getDamage() + 5);
        }

        if (HERO.getHealth() <= 0)
        {
            stop = true;

            Intent gameOver = new Intent(this, GameOver.class);
            startActivity(gameOver);
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

//    public void pauseMenu(View view)
//    {
//        Intent pauseMenu = new Intent(this, PauseActivity.class);
//        startActivity(pauseMenu);
//    }

        public void pauseGame (View v)
        {
            stop = true;

            Intent pauseGame = new Intent(this,truePauseActivity.class);
            startActivity(pauseGame);
        }
    }
