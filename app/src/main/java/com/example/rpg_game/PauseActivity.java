package com.example.rpg_game;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class PauseActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //set up main content view
        setContentView(R.layout.activity_pause);
        //this button will show the dialog
        Button button1main = (Button) findViewById(R.id.pauseButton);
        Intent homePage = new Intent(this, MainActivity.class);

        button1main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set up dialog
                Dialog dialog = new Dialog(PauseActivity.this);
                //dialog.setContentView(R.layout.maindialog);
                dialog.setTitle("This is my custom dialog box");
                dialog.setCancelable(true);
                //there are a lot of settings, for dialog, check them all out!

                //set up text
                TextView text = (TextView) dialog.findViewById(R.id.TextView01);
                //text.setText(R.string.lots_of_text);

                //set up image view
                ImageView img = (ImageView) dialog.findViewById(R.id.ImageView01);
                //img.setImageResource(R.drawable.nista_logo);

                //set up button
                Button play = (Button) dialog.findViewById(R.id.play);
                play.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        finish();
                    }
                });

                //set up button
                Button home = (Button) dialog.findViewById(R.id.home);
                home.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(homePage);
                    }
                });

                //set up button
                Button restart = (Button) dialog.findViewById(R.id.restart);
                restart.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        finish();
                    }
                });
                //now that the dialog is set up, it's time to show it
                dialog.show();
            }
        });
    }

    // How to create dimmed background - https://stackoverflow.com/questions/7878235/overlay-an-activity-on-another-activity-or-overlay-a-view-over-another
}