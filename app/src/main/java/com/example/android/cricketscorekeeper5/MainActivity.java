package com.example.android.cricketscorekeeper5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.cricketscorekeeper5.R;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int scorePlayerOne = 0;
    int scorePlayerOneTeamB = 0;
    int wicketTeamA = 0;
    int wicketTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkAnswerOne(View view) {
        RadioGroup radioGroupOne = (RadioGroup) findViewById(R.id.radio_group_1);
        int selectedId = radioGroupOne.getCheckedRadioButtonId();
        RadioButton answerRadioOne = (RadioButton) findViewById(R.id.teamNameA);
        RadioButton answerRadioTwo = (RadioButton) findViewById(R.id.teamNameB);
        Button answerOneButton = (Button) findViewById(R.id.addOneRun);
        RadioGroup radioGroupTwo = (RadioGroup) findViewById(R.id.radio_group_2);
        int selectedPlayerId = radioGroupTwo.getCheckedRadioButtonId();
        RadioButton playerRadioTwo = (RadioButton) findViewById(R.id.player_1);
        checkAnswersRadio(selectedId, answerRadioOne, selectedPlayerId, answerRadioTwo,
                answerOneButton, playerRadioTwo);
    }

    /**
     * Check the answer to question one and return the result of question 1 upon pressing the      *
     * Check answer button that is located right under Question 1.
     */
    private void checkAnswersRadio(int selectedId, RadioButton answerRadioOne, int selectedPlayerId,
                                   RadioButton answerRadioTwo, Button answerOneButton,
                                   RadioButton playerRadioTwo) {
        if ((selectedId == -1) || (selectedPlayerId == -1)) {
            Toast.makeText(this, getString(R.string.select_team_batting), Toast.LENGTH_LONG).show();
        } else if ((selectedId == answerRadioOne.getId()) && (selectedPlayerId == -1)) {
            Toast.makeText(this, getString(R.string.select_player_on_strike), Toast.LENGTH_LONG).show();
        } else if ((selectedId == answerRadioOne.getId()) && (selectedPlayerId == playerRadioTwo.getId())) {
            displayForTeamA(1);
            displayForPlayerOne(1);
        } else if ((selectedId == answerRadioTwo.getId()) && (selectedPlayerId == playerRadioTwo.getId())) {
            displayForTeamB(1);
            displayForPlayerOne(1);
        }
    }
//        else if ((selectedId == 0) && (selectedPlayerId == player2.getId())) {
//            displayForTeamA(run);
//            displayForPlayerOne(run);
//        } else if ((selectedId == 0) && (selectedPlayerId == player3.getId())) {
//            displayForTeamA(run);
//            displayForPlayerOne(run);
//        } else if ((selectedId == 0) && (selectedPlayerId == player4.getId())) {
//            displayForTeamA(run);
//            displayForPlayerOne(run);
//        } else if ((selectedId == 0) && (selectedPlayerId == player5.getId())) {
//            displayForTeamA(run);
//            displayForPlayerOne(run);
//        } else if ((selectedId == 0) && (selectedPlayerId == player6.getId())) {
//            displayForTeamA(run);
//            displayForPlayerOne(run);
//        } else if ((selectedId == 0) && (selectedPlayerId == player7.getId())) {
//            displayForTeamA(run);
//            displayForPlayerOne(run);
//        } else if ((selectedId == 0) && (selectedPlayerId == player8.getId())) {
//            displayForTeamA(run);
//            displayForPlayerOne(run);
//        } else if ((selectedId == 0) && (selectedPlayerId == player9.getId())) {
//            displayForTeamA(run);
//            displayForPlayerOne(run);
//        } else if ((selectedId == 0) && (selectedPlayerId == player10.getId())) {
//            displayForTeamA(run);
//            displayForPlayerOne(run);
//        } else if ((selectedId == 0) && (selectedPlayerId == player11.getId())) {
//            displayForTeamA(run);
//            displayForPlayerOne(run);
//        }
    /**
     * This method displays the total score for Team A on the screen.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.runsA);
        scoreTeamA = scoreTeamA + score;
        scoreView.setText(String.valueOf(scoreTeamA));
    }

    /**
     * This method displays the total score for Player 1 on the screen.
     */
    public void displayForPlayerOne(int score) {
        TextView scoreView = (TextView) findViewById(R.id.playerOneRuns);
        scorePlayerOne = scorePlayerOne + score;
        scoreView.setText(String.valueOf(scorePlayerOne));
    }

    /**
     * This method displays the total wickets for Team A on the screen.
     */
    public void displayWicketsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.wicketsA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the +1 button for Team A is clicked.
     */
    public void addOneRunForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        scorePlayerOne = scorePlayerOne + 1;
        displayForTeamA(scoreTeamA);
        displayForPlayerOne(scorePlayerOne);
    }

    /**
     * This method is called when the +2 button for Team A is clicked.
     */
    public void addTwoRunsForTeamA(View v) {
        scoreTeamA = scoreTeamA + 2;
        scorePlayerOne = scorePlayerOne + 2;
        displayForTeamA(scoreTeamA);
        displayForPlayerOne(scorePlayerOne);
    }

    /**
     * This method is called when the +3 button for Team A is clicked.
     */
    public void addThreeRunsForTeamA(View v) {
        scoreTeamA = scoreTeamA + 3;
        scorePlayerOne = scorePlayerOne + 3;
        displayForTeamA(scoreTeamA);
        displayForPlayerOne(scorePlayerOne);
    }

    /**
     * This method is called when the +4 button for Team A is clicked.
     */
    public void addFourRunsForTeamA(View v) {
        scoreTeamA = scoreTeamA + 4;
        scorePlayerOne = scorePlayerOne + 4;
        displayForTeamA(scoreTeamA);
        displayForPlayerOne(scorePlayerOne);
    }

    /**
     * This method is called when the +6 button for Team A is clicked.
     */
    public void addSixRunsForTeamA(View v) {
        scoreTeamA = scoreTeamA + 6;
        scorePlayerOne = scorePlayerOne + 6;
        displayForTeamA(scoreTeamA);
        displayForPlayerOne(scorePlayerOne);
    }

    /**
     * This method is called when the +1Wicket button is clicked.
     */
    public void addOneWicketForTeamA(View v) {
        wicketTeamA = wicketTeamA + 1;
        scorePlayerOne = 0;
        displayWicketsForTeamA(wicketTeamA);
        displayForPlayerOne(scorePlayerOne);
    }

    /**
     * This method displays the total score for Team B on the screen.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.runsB);
        scoreTeamB = scoreTeamB + score;
        scoreView.setText(String.valueOf(scoreTeamB));
    }

    /**
     * This method displays the total score for Player 1 on the screen.
     */
    public void displayForPlayerOneTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.playerOneRunsForTeamB);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method displays the total wickets for Team B on the screen.
     */
    public void displayWicketsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.wicketsB);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the +1 button for Team B is clicked.
     */
    public void addOneRunForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        scorePlayerOneTeamB = scorePlayerOneTeamB + 1;
        displayForTeamB(scoreTeamB);
        displayForPlayerOneTeamB(scorePlayerOneTeamB);
    }

    /**
     * This method is called when the +2 button for Team B is clicked.
     */
    public void addTwoRunsForTeamB(View v) {
        scoreTeamB = scoreTeamB + 2;
        scorePlayerOneTeamB = scorePlayerOneTeamB + 2;
        displayForTeamB(scoreTeamB);
        displayForPlayerOneTeamB(scorePlayerOneTeamB);
    }

    /**
     * This method is called when the +3 button for Team B is clicked.
     */
    public void addThreeRunsForTeamB(View v) {
        scoreTeamB = scoreTeamB + 3;
        scorePlayerOneTeamB = scorePlayerOneTeamB + 3;
        displayForTeamB(scoreTeamB);
        displayForPlayerOneTeamB(scorePlayerOneTeamB);
    }

    /**
     * This method is called when the +4 button for Team B is clicked.
     */
    public void addFourRunsForTeamB(View v) {
        scoreTeamB = scoreTeamB + 4;
        scorePlayerOneTeamB = scorePlayerOneTeamB + 4;
        displayForTeamB(scoreTeamB);
        displayForPlayerOneTeamB(scorePlayerOneTeamB);
    }

    /**
     * This method is called when the +6 button for Team B is clicked.
     */
    public void addSixRunsForTeamB(View v) {
        scoreTeamB = scoreTeamB + 6;
        scorePlayerOneTeamB = scorePlayerOneTeamB + 6;
        displayForTeamB(scoreTeamB);
        displayForPlayerOneTeamB(scorePlayerOneTeamB);
    }

    /**
     * This method is called when the +1Wicket button is clicked.
     */
    public void addOneWicketForTeamB(View v) {
        wicketTeamB = wicketTeamB + 1;
        scorePlayerOneTeamB = 0;
        displayWicketsForTeamB(wicketTeamB);
        displayForPlayerOneTeamB(scorePlayerOneTeamB);
    }

    /**
     * Resets the scores for Team B.
     */
    public void resetScores(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        wicketTeamA = 0;
        wicketTeamB = 0;
        scorePlayerOne = 0;
        scorePlayerOneTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayWicketsForTeamA(wicketTeamA);
        displayForTeamB(scoreTeamB);
        displayWicketsForTeamB(wicketTeamB);
        displayForPlayerOne(scorePlayerOne);
        displayForPlayerOneTeamB(scorePlayerOneTeamB);
    }
}
