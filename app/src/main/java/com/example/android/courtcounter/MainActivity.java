package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This adds 3 pts to Team A.
     */
    public void threePointsTeamA(View view) {
        scoreTeamA = scoreTeamA +3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * This adds 2 pts to Team A.
     */
    public void twoPointsTeamA(View view){
        scoreTeamA = scoreTeamA +2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * This adds 1 pts to Team A.
     */
    public void onePointTeamA(View view){
        scoreTeamA = scoreTeamA +1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * This adds 3 pts to Team B.
     */
    public void threePointsTeamB(View view) {
        scoreTeamB = scoreTeamB +3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * This adds 2 pts to Team B.
     */
    public void twoPointsTeamB(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * This adds 1 pts to Team B.
     */
    public void onePointTeamB(View view){
        scoreTeamB = scoreTeamB +1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * This resets the score.
     */
    public void resetButton(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
