package com.example.rpg_game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class PauseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pause);
    }

    // How to create dimmed background - https://stackoverflow.com/questions/7878235/overlay-an-activity-on-another-activity-or-overlay-a-view-over-another
}