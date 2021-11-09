package com.example.rpg_game;

import androidx.appcompat.app.AppCompatActivity;

<<<<<<< HEAD
import android.os.Bundle;
=======
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
>>>>>>> 642244d24301f4aaea5dca7fd12c63157d2d359e

public class truePauseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_true_pause);
    }
<<<<<<< HEAD
=======

    public void continueGame(View v){
        Intent continueGame = new Intent(this, GameplayActivity.class);
        startActivity(continueGame);
    }

    public void restartGame(View v){
        Intent continueGame = new Intent(this, MainActivity.class);
        startActivity(continueGame);
    }
>>>>>>> 642244d24301f4aaea5dca7fd12c63157d2d359e
}