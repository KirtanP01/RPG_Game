package com.example.rpg_game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.*;

public class mathQuestion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_question);
    }
    public static void main(String[] args) {
        ArrayList<String> firstGradeQuestions = new ArrayList<String>();
        firstGradeQuestions.add("2 + 2");
        firstGradeQuestions.add("1 + 3");
        firstGradeQuestions.add("1 + 2");
        firstGradeQuestions.add("4 + 2");
        firstGradeQuestions.add("3 + 3");

        ArrayList<String> firstGradeAnswers = new ArrayList<String>();
        firstGradeAnswers.add("4");
        firstGradeAnswers.add("4");
        firstGradeAnswers.add("3");
        firstGradeAnswers.add("6");
        firstGradeAnswers.add("6");

        ArrayList<String> secondGradeQuestions = new ArrayList<String>();
        secondGradeQuestions.add("11 + 2");
        secondGradeQuestions.add("4 + 9");
        secondGradeQuestions.add("7 + 5");
        secondGradeQuestions.add("12 + 8");
        secondGradeQuestions.add("13 + 5");

        ArrayList<String> secondGradeAnswers = new ArrayList<String>();
        secondGradeAnswers.add("13");
        secondGradeAnswers.add("13");
        secondGradeAnswers.add("12");
        secondGradeAnswers.add("20");
        secondGradeAnswers.add("18");

        ArrayList<String> thirdGradeQuestions = new ArrayList<String>();
        thirdGradeQuestions.add("6 * 2");
        thirdGradeQuestions.add("4 * 3");
        thirdGradeQuestions.add("4 * 9");
        thirdGradeQuestions.add("2 * 4");
        thirdGradeQuestions.add("8 * 6");

        ArrayList<String> thirdGradeAnswers = new ArrayList<String>();
        thirdGradeAnswers.add("12");
        thirdGradeAnswers.add("12");
        thirdGradeAnswers.add("36");
        thirdGradeAnswers.add("8");
        thirdGradeAnswers.add("48");


        ArrayList<String> fourthGradeQuestions = new ArrayList<String>();
        fourthGradeQuestions.add("752 + 257");
        fourthGradeQuestions.add("375 + 308");
        fourthGradeQuestions.add("602 + 374");
        fourthGradeQuestions.add("329 + 551");
        fourthGradeQuestions.add("586 + 206");


        ArrayList<String> fourthGradeAnswers = new ArrayList<String>();
        fourthGradeAnswers.add("1009");
        fourthGradeAnswers.add("683");
        fourthGradeAnswers.add("976");
        fourthGradeAnswers.add("880");
        fourthGradeAnswers.add("792");

        ArrayList<String> fifthGradeQuestions = new ArrayList<String>();
        fifthGradeQuestions.add("426 - 243");
        fifthGradeQuestions.add("718 - 342");
        fifthGradeQuestions.add("548 - 785");
        fifthGradeQuestions.add("391 - 688");
        fifthGradeQuestions.add("420 - 69");

        ArrayList<String> fifthGradeAnswers = new ArrayList<String>();
        fifthGradeAnswers.add("183");
        fifthGradeAnswers.add("376");
        fifthGradeAnswers.add("-237");
        fifthGradeAnswers.add("-297");
        fifthGradeAnswers.add("351");

        ArrayList<String> sixthGradeQuestions = new ArrayList<String>();
        sixthGradeQuestions.add("36 / 6");
        sixthGradeQuestions.add("40 / 8");
        sixthGradeQuestions.add("56 / 8");
        sixthGradeQuestions.add("35 / 7");
        sixthGradeQuestions.add("28 / 4");

        ArrayList<String> sixthGradeAnswers = new ArrayList<String>();
        sixthGradeAnswers.add("6");
        sixthGradeAnswers.add("5");
        sixthGradeAnswers.add("7");
        sixthGradeAnswers.add("5");
        sixthGradeAnswers.add("7");

        ArrayList bonusQuestion= new ArrayList();
        bonusQuestion.add("∫sin(x)dx");

        ArrayList bonusQuestionAnswer = new ArrayList();
        bonusQuestionAnswer.add("-cos(x) + c");




    }



}