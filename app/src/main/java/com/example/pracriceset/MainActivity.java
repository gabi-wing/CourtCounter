package com.example.pracriceset;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int teamAScore = 0;

    public void addOneForTeamA(View v) {
        teamAScore++;
        displayForTeamA(teamAScore);
    }

    public void addTwoForTeamA(View v) {
        teamAScore+=2;
        displayForTeamA(teamAScore);
    }

    public void addThreeForTeamA(View v) {
        teamAScore+=3;
        displayForTeamA(teamAScore);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
}