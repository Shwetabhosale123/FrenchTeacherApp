package com.example.frenchteacherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button blackBtn, greenBtn, purpleBtn, redBtn, yellowBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        blackBtn = findViewById(R.id.black);
        greenBtn = findViewById(R.id.green);
        purpleBtn = findViewById(R.id.purple);
        redBtn = findViewById(R.id.red);
        yellowBtn = findViewById(R.id.yellow);

        blackBtn.setOnClickListener(this);
        greenBtn.setOnClickListener(this);
        purpleBtn.setOnClickListener(this);
        redBtn.setOnClickListener(this);
        yellowBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        int clickedBtnId = v.getId();

        if (clickedBtnId == R.id.red) {
            PlaySounds(R.raw.red);
        } else if (clickedBtnId == R.id.black) {
            PlaySounds(R.raw.black);
        } else if (clickedBtnId == R.id.green) {
            PlaySounds(R.raw.green);
        } else if (clickedBtnId == R.id.purple) {
            PlaySounds(R.raw.purple);
        } else if (clickedBtnId == R.id.yellow) {
            PlaySounds(R.raw.yellow);
        }
    }

    public void PlaySounds(int id) {
        MediaPlayer mediaPlayer = MediaPlayer.create(
                this,
                id
        );
        mediaPlayer.start();
    }
}