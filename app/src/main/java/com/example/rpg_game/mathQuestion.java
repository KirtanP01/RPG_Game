package com.example.rpg_game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class mathQuestion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_question);
        int rand = (int)(Math.random() * 5);
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

        ArrayList<String> bonusQuestion= new ArrayList<>();
        bonusQuestion.add("∫sin(x)dx");

        ArrayList<String> bonusQuestionAnswer = new ArrayList<>();
        bonusQuestionAnswer.add("-cos(x) + c");

        TextView questionTV = findViewById(R.id.mathQuestionTextView);
        questionTV.setText(firstGradeQuestions.get(rand));
    }

    public void submitAnswer(View v)
    {
        EditText userAnswer = findViewById(R.id.mathAnswerEditText);
        String  input = userAnswer.getText().toString();
        input = input.replace(" ", "");

        ArrayList<String> mathQuestionAnswers = new ArrayList<>();
        mathQuestionAnswers.add("4" + "4" + "3" + "6" + "6");
        mathQuestionAnswers.add("13" + "13" + "12" + "20" + "18");
        mathQuestionAnswers.add("12" + "12" + "36" + "8" + "48");
        mathQuestionAnswers.add("1009" + "683" + "976" + "880" + "792");
        mathQuestionAnswers.add("183" + "376" + "-237" + "-297" + "351");
        mathQuestionAnswers.add("6" + "5" + "7" + "5" + "7");
        mathQuestionAnswers.add("-cos(x)+c");

        for(int i = 0; i < mathQuestionAnswers.size(); i++)
        {
            if(input.equals(mathQuestionAnswers.get(i)))
            {

            }

            else
            {

            }
        }
    }

    public static void main(String[] args) {
//        ArrayList<String> firstGradeQuestions = new ArrayList<String>();
//        firstGradeQuestions.add("2 + 2");
//        firstGradeQuestions.add("1 + 3");
//        firstGradeQuestions.add("1 + 2");
//        firstGradeQuestions.add("4 + 2");
//        firstGradeQuestions.add("3 + 3");

//        ArrayList<String> firstGradeAnswers = new ArrayList<String>();
//        firstGradeAnswers.add("4");
//        firstGradeAnswers.add("4");
//        firstGradeAnswers.add("3");
//        firstGradeAnswers.add("6");
//        firstGradeAnswers.add("6");
//
//        ArrayList<String> secondGradeQuestions = new ArrayList<String>();
//        secondGradeQuestions.add("11 + 2");
//        secondGradeQuestions.add("4 + 9");
//        secondGradeQuestions.add("7 + 5");
//        secondGradeQuestions.add("12 + 8");
//        secondGradeQuestions.add("13 + 5");
//
//        ArrayList<String> secondGradeAnswers = new ArrayList<String>();
//        secondGradeAnswers.add("13");
//        secondGradeAnswers.add("13");
//        secondGradeAnswers.add("12");
//        secondGradeAnswers.add("20");
//        secondGradeAnswers.add("18");
//
//        ArrayList<String> thirdGradeQuestions = new ArrayList<String>();
//        thirdGradeQuestions.add("6 * 2");
//        thirdGradeQuestions.add("4 * 3");
//        thirdGradeQuestions.add("4 * 9");
//        thirdGradeQuestions.add("2 * 4");
//        thirdGradeQuestions.add("8 * 6");
//
//        ArrayList<String> thirdGradeAnswers = new ArrayList<String>();
//        thirdGradeAnswers.add("12");
//        thirdGradeAnswers.add("12");
//        thirdGradeAnswers.add("36");
//        thirdGradeAnswers.add("8");
//        thirdGradeAnswers.add("48");
//
//
//        ArrayList<String> fourthGradeQuestions = new ArrayList<String>();
//        fourthGradeQuestions.add("752 + 257");
//        fourthGradeQuestions.add("375 + 308");
//        fourthGradeQuestions.add("602 + 374");
//        fourthGradeQuestions.add("329 + 551");
//        fourthGradeQuestions.add("586 + 206");
//
//
//        ArrayList<String> fourthGradeAnswers = new ArrayList<String>();
//        fourthGradeAnswers.add("1009");
//        fourthGradeAnswers.add("683");
//        fourthGradeAnswers.add("976");
//        fourthGradeAnswers.add("880");
//        fourthGradeAnswers.add("792");
//
//        ArrayList<String> fifthGradeQuestions = new ArrayList<String>();
//        fifthGradeQuestions.add("426 - 243");
//        fifthGradeQuestions.add("718 - 342");
//        fifthGradeQuestions.add("548 - 785");
//        fifthGradeQuestions.add("391 - 688");
//        fifthGradeQuestions.add("420 - 69");
//
//        ArrayList<String> fifthGradeAnswers = new ArrayList<String>();
//        fifthGradeAnswers.add("183");
//        fifthGradeAnswers.add("376");
//        fifthGradeAnswers.add("-237");
//        fifthGradeAnswers.add("-297");
//        fifthGradeAnswers.add("351");
//
//        ArrayList<String> sixthGradeQuestions = new ArrayList<String>();
//        sixthGradeQuestions.add("36 / 6");
//        sixthGradeQuestions.add("40 / 8");
//        sixthGradeQuestions.add("56 / 8");
//        sixthGradeQuestions.add("35 / 7");
//        sixthGradeQuestions.add("28 / 4");
//
//        ArrayList<String> sixthGradeAnswers = new ArrayList<String>();
//        sixthGradeAnswers.add("6");
//        sixthGradeAnswers.add("5");
//        sixthGradeAnswers.add("7");
//        sixthGradeAnswers.add("5");
//        sixthGradeAnswers.add("7");
//
//        ArrayList bonusQuestion= new ArrayList();
//        bonusQuestion.add("∫sin(x)dx");
//
//        ArrayList bonusQuestionAnswer = new ArrayList();
//        bonusQuestionAnswer.add("-cos(x) + c");

    }

    // onCreate: display random problem
    // submit button
    //https://www.google.com/search?q=how+to+convert+a+string+into+an+equation+in+java&rlz=1C1GCEU_enUS973US973&oq=how+to+turn+a+string+into+an+equatio&aqs=chrome.2.69i57j0i22i30l3j0i390l2.9910j0j7&sourceid=chrome&ie=UTF-8#kpvalbx=_r612Ya3CCfKnqtsPxZaEiAs21
    // convert string to equation^


}