package com.example.rpg_game;

import static com.example.rpg_game.CharacterSelectionActivity.HERO;
import static com.example.rpg_game.CharacterSelectionActivity.VILLAIN;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
//import java.util.*;

public class mathQuestion extends AppCompatActivity {

    public static int enemyHealthLost;
    public static int playerHealthLost;

    int rand;
    public static boolean canAttack;

    ArrayList<String> firstGradeQuestions = new ArrayList<String>();
    ArrayList<String> firstGradeAnswers = new ArrayList<String>();
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_question);
        rand = (int)(Math.random() * 15);
        firstGradeQuestions.add("2 + 2");
        firstGradeQuestions.add("1 + 3");
        firstGradeQuestions.add("1 + 2");
        firstGradeQuestions.add("4 + 2");
        firstGradeQuestions.add("3 + 3");
        firstGradeAnswers.add("4");
        firstGradeAnswers.add("4");
        firstGradeAnswers.add("3");
        firstGradeAnswers.add("6");
        firstGradeAnswers.add("6");
        firstGradeQuestions.add("11 + 2");
        firstGradeQuestions.add("4 + 9");
        firstGradeQuestions.add("7 + 5");
        firstGradeQuestions.add("12 + 8");
        firstGradeQuestions.add("13 + 5");
        firstGradeAnswers.add("13");
        firstGradeAnswers.add("13");
        firstGradeAnswers.add("12");
        firstGradeAnswers.add("20");
        firstGradeAnswers.add("18");
        firstGradeQuestions.add("6 * 2");
        firstGradeQuestions.add("4 * 3");
        firstGradeQuestions.add("4 * 9");
        firstGradeQuestions.add("2 * 4");
        firstGradeQuestions.add("8 * 6");
        firstGradeAnswers.add("12");
        firstGradeAnswers.add("12");
        firstGradeAnswers.add("36");
        firstGradeAnswers.add("8");
        firstGradeAnswers.add("48");

        TextView questionTV = findViewById(R.id.mathQuestionTextView);
        questionTV.setText(firstGradeQuestions.get(rand));
    }

    public void submit(View v){
        EditText answer = findViewById(R.id.mathAnswerEditText);
        String realAns = firstGradeAnswers.get(rand);
        String userAns = answer.getText().toString();
        canAttack = userAns.equals(realAns);
        if (canAttack == true){
            HERO.setHeroDamage();
            Toast.makeText(this, "Correct! You did " + (int)HERO.getDamage() + " damage!", Toast.LENGTH_SHORT).show();
            HERO.dealDamage(VILLAIN);
            enemyHealthLost++;

            // If the damage dealt is greater than the villain's health, their health is set to 0
            if(VILLAIN.getHealth() < 10)
            {
                VILLAIN.setHealth(0);
            }
        }
        else {
            VILLAIN.setHeroDamage();
            Toast.makeText(this, "Incorrect! The enemy dealt " + (int)VILLAIN.getDamage() + " damage!", Toast.LENGTH_SHORT).show();
            VILLAIN.dealDamage(HERO);
            playerHealthLost++;
        }
        Intent sendInfo = new Intent(this, GameplayActivity.class);
        startActivity(sendInfo);
    }

    // onCreate: display random problem
    // submit button
    //https://www.google.com/search?q=how+to+convert+a+string+into+an+equation+in+java&rlz=1C1GCEU_enUS973US973&oq=how+to+turn+a+string+into+an+equatio&aqs=chrome.2.69i57j0i22i30l3j0i390l2.9910j0j7&sourceid=chrome&ie=UTF-8#kpvalbx=_r612Ya3CCfKnqtsPxZaEiAs21
    // convert string to equation^

}