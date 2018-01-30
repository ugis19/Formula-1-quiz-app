package com.example.android.formula1quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called, when the Submit Answers button is clicked
     */
    public void submitAnswers(View view) {
        String name = getName();
        String summaryMessage;
        summaryMessage = createSummary(name, calculateTotalScore());
        Toast.makeText(this, summaryMessage, Toast.LENGTH_LONG).show();
    }

    /**
     * Checks EditText name
     *
     * @return string of the name
     */
    private String getName() {
        EditText name = (EditText) findViewById(R.id.your_name_view);
        String nameText = name.getText().toString();
        return nameText;
    }

    /**
     * This method creates summary message
     *
     * @param name
     * @return summaryMessage
     */
    private String createSummary(String name, int totalScore) {
        String summaryMessage = "Congratulations, " + name + "!";
        summaryMessage = summaryMessage + "\nYour score is " + totalScore + " of 12!";
        return summaryMessage;
    }

    /**
     * This method calculates total score
     */
    private int calculateTotalScore() {
        int totalScore = 0;
        /**
         *  This method checks if question 1 right answer is checked and ads 1 point to total score, if it is
         */
        RadioButton rb_q1 = (RadioButton) findViewById(R.id.q1_lewis_hamilton);
        rb_q1.isChecked();
        if (rb_q1.isChecked()) {
            totalScore = totalScore + 1;
        }
        /**
         *  This method checks if question 2 right answer is checked and ads 1 point to total score, if it is
         */
        RadioButton rb_q2 = (RadioButton) findViewById(R.id.q2_mercedes);
        rb_q2.isChecked();
        if (rb_q2.isChecked()) {
            totalScore = totalScore + 1;
        }
        /**
         *  This method checks if question 1 right answer is checked and ads 1 point to total score, if it is
         */
        RadioButton rb_q3 = (RadioButton) findViewById(R.id.q3_valtteri_bottas);
        rb_q3.isChecked();
        if (rb_q3.isChecked()) {
            totalScore = totalScore + 1;
        }
        /**
         *  This method checks if question 4 right answer is checked and ads 1 point to total score, if it is
         */
        RadioButton rb_q4 = (RadioButton) findViewById(R.id.q4_force_india);
        rb_q4.isChecked();
        if (rb_q4.isChecked()) {
            totalScore = totalScore + 1;
        }
        /**
         *  This method checks if question 5 right answers are checked and ads 1+1 point to total score, if it is
         */
        boolean q5_korea = ((CheckBox) findViewById(R.id.q5_korea)).isChecked();
        if (q5_korea) {
            totalScore = totalScore + 1;
        }
        boolean q5_germany = ((CheckBox) findViewById(R.id.q5_germany)).isChecked();
        if (q5_germany) {
            totalScore = totalScore + 1;
        }
        /**
         *  This method checks if question 6 right answer is checked and ads 1 point to total score, if it is
         */
        RadioButton rb_q6 = (RadioButton) findViewById(R.id.q6_3);
        rb_q6.isChecked();
        if (rb_q6.isChecked()) {
            totalScore = totalScore + 1;
        }
        /**
         *  This method checks if question 7 right answer is checked and ads 1 point to total score, if it is
         */
        RadioButton rb_q7 = (RadioButton) findViewById(R.id.q7_2);
        rb_q7.isChecked();
        if (rb_q7.isChecked()) {
            totalScore = totalScore + 1;
        }
        /**
         *  This method checks if question 8 right answer is checked and ads 1 point to total score, if it is
         */
        RadioButton rb_q8 = (RadioButton) findViewById(R.id.q8_20);
        rb_q8.isChecked();
        if (rb_q8.isChecked()) {
            totalScore = totalScore + 1;
        }
        /**
         *  This method checks if question 9 right answers are checked and ads 1+1 point to total score, if it is
         */
        boolean q9_hungary = ((CheckBox) findViewById(R.id.q9_hungary)).isChecked();
        if (q9_hungary) {
            totalScore = totalScore + 1;
        }
        boolean q9_monaco = ((CheckBox) findViewById(R.id.q9_monaco)).isChecked();
        if (q9_monaco) {
            totalScore = totalScore + 1;
        }
        /**
         *  This method checks if question 8 right answer is checked and ads 1 point to total score, if it is
         */
        RadioButton rb_q10 = (RadioButton) findViewById(R.id.q10_yes);
        rb_q10.isChecked();
        if (rb_q10.isChecked()) {
            totalScore = totalScore + 1;
        }
        return totalScore;
    }

}
