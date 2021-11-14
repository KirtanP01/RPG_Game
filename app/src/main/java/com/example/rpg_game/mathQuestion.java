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
    ArrayList<String> secondGradeQuestions = new ArrayList<String>();
    ArrayList<String> secondGradeAnswers = new ArrayList<String>();
    ArrayList<String> thirdGradeQuestions = new ArrayList<String>();
    ArrayList<String> thirdGradeAnswers = new ArrayList<String>();
    ArrayList<String> fourthGradeQuestions = new ArrayList<String>();
    ArrayList<String> fourthGradeAnswers = new ArrayList<String>();
    ArrayList<String> fifthGradeQuestions = new ArrayList<String>();
    ArrayList<String> fifthGradeAnswers = new ArrayList<String>();
    ArrayList<String> sixthGradeQuestions = new ArrayList<String>();
    ArrayList<String> sixthGradeAnswers = new ArrayList<String>();
    ArrayList bonusQuestion= new ArrayList();
    ArrayList bonusQuestionAnswer = new ArrayList();
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_question);
        rand = (int)(Math.random() * 5);
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
//        secondGradeQuestions.add("11 + 2");
//        secondGradeQuestions.add("4 + 9");
//        secondGradeQuestions.add("7 + 5");
//        secondGradeQuestions.add("12 + 8");
//        secondGradeQuestions.add("13 + 5");
//        secondGradeAnswers.add("13");
//        secondGradeAnswers.add("13");
//        secondGradeAnswers.add("12");
//        secondGradeAnswers.add("20");
//        secondGradeAnswers.add("18");
//        thirdGradeQuestions.add("6 * 2");
//        thirdGradeQuestions.add("4 * 3");
//        thirdGradeQuestions.add("4 * 9");
//        thirdGradeQuestions.add("2 * 4");
//        thirdGradeQuestions.add("8 * 6");
//        thirdGradeAnswers.add("12");
//        thirdGradeAnswers.add("12");
//        thirdGradeAnswers.add("36");
//        thirdGradeAnswers.add("8");
//        thirdGradeAnswers.add("48");
//        fourthGradeQuestions.add("752 + 257");
//        fourthGradeQuestions.add("375 + 308");
//        fourthGradeQuestions.add("602 + 374");
//        fourthGradeQuestions.add("329 + 551");
//        fourthGradeQuestions.add("586 + 206");
//        fourthGradeAnswers.add("1009");
//        fourthGradeAnswers.add("683");
//        fourthGradeAnswers.add("976");
//        fourthGradeAnswers.add("880");
//        fourthGradeAnswers.add("792");
//        fifthGradeQuestions.add("426 - 243");
//        fifthGradeQuestions.add("718 - 342");
//        fifthGradeQuestions.add("548 - 785");
//        fifthGradeQuestions.add("391 - 688");
//        fifthGradeQuestions.add("420 - 69");
//        fifthGradeAnswers.add("183");
//        fifthGradeAnswers.add("376");
//        fifthGradeAnswers.add("-237");
//        fifthGradeAnswers.add("-297");
//        fifthGradeAnswers.add("351");
//        sixthGradeQuestions.add("36 / 6");
//        sixthGradeQuestions.add("40 / 8");
//        sixthGradeQuestions.add("56 / 8");
//        sixthGradeQuestions.add("35 / 7");
//        sixthGradeQuestions.add("28 / 4");
//        sixthGradeAnswers.add("6");
//        sixthGradeAnswers.add("5");
//        sixthGradeAnswers.add("7");
//        sixthGradeAnswers.add("5");
//        sixthGradeAnswers.add("7");
//        bonusQuestion.add("∫sin(x)dx");
//        bonusQuestionAnswer.add("-cos(x) + c");
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