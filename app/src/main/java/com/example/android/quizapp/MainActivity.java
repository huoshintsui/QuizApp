package com.example.android.quizapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton q1a1, q1a2, q1a3;
    Button submit;
    String selection;
    RadioGroup radioGroupQ1;
    public int correct = 0;
    public int wrong = 0;
    CheckBox checkBoxQ2A1, checkBoxQ2A2, checkBoxQ2A3, checkBoxQ2A4;
    public EditText incarnationTextBox;
    public EditText crucifixionTextBox;
    public EditText resurrectionTextBox;
    public EditText ascensionTextBox;

    @Override
    // not sure what OnClickListener is
    // not sure why the reset button not working
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void displayMessage(String message) {
        TextView messageTextView = (TextView) findViewById(R.id.Q1_response);
        messageTextView.setText(message);
    }

    private void addCorrect(int score) {
        TextView quantityTextView = (TextView) findViewById(R.id.correct);
        quantityTextView.setText("Correct: " + score);
    }

    private void addWrong(int score) {
        TextView quantityTextView = (TextView) findViewById(R.id.wrong);
        quantityTextView.setText("Wrong: " + score);
    }

    // Actions for the submit button for question 1

    public void submitQ1(View view) {
        q1a1 = (RadioButton) findViewById(R.id.Q1A1);
        q1a2 = (RadioButton) findViewById(R.id.Q1A2);
        q1a3 = (RadioButton) findViewById(R.id.Q1A3);
        submit = (Button) findViewById(R.id.submit);
        radioGroupQ1 = (RadioGroup) findViewById(R.id.radiogroupQ1);
//        Button clearAll = (Button)findViewById(R.id.clearall);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (q1a1.isChecked()) {
                    displayMessage("Sorry! Try again!");
                    wrong = wrong + 1;
                    addWrong(wrong);
                    selection = q1a1.getText().toString();
                } else if (q1a2.isChecked()) {
                    displayMessage("Sorry! Try again!");
                    wrong = wrong + 1;
                    addWrong(wrong);
                    selection = q1a2.getText().toString();
                } else if (q1a3.isChecked()) {
                    displayMessage("Good job!");
                    correct = correct + 1;
                    addCorrect(correct);
                    selection = q1a3.getText().toString();
                }
                Toast.makeText(getApplicationContext(), selection, Toast.LENGTH_LONG).show(); // print the value of the selection
            }
        });
    }

    // Actions for the submit button for question 2

    public void submitQ2(View view) {
        CheckBox checkBoxQ2A1 = (CheckBox) findViewById(R.id.checkboxQ2A1);
        boolean hasCheckBoxQ2A1 = checkBoxQ2A1.isChecked();
        CheckBox checkBoxQ2A2 = (CheckBox) findViewById(R.id.checkboxQ2A2);
        boolean hasCheckBoxQ2A2 = checkBoxQ2A2.isChecked();
        CheckBox checkBoxQ2A3 = (CheckBox) findViewById(R.id.checkboxQ2A3);
        boolean hasCheckBoxQ2A3 = checkBoxQ2A3.isChecked();
        CheckBox checkBoxQ2A4 = (CheckBox) findViewById(R.id.checkboxQ2A4);
        boolean hasCheckBoxQ2A4 = checkBoxQ2A4.isChecked();
        if (hasCheckBoxQ2A1==false && hasCheckBoxQ2A2 && hasCheckBoxQ2A3 && hasCheckBoxQ2A4) {
            TextView messageTextView = (TextView) findViewById(R.id.Q2_response);
            messageTextView.setText("Good job!");
            correct = correct + 1;
            addCorrect(correct);
        } else {
            TextView messageTextView = (TextView) findViewById(R.id.Q2_response);
            messageTextView.setText("Sorry! Try again!");
            wrong = wrong + 1;
            addWrong(wrong);
        }
    }

    // Actions for the submit button for question 3

    public void submitQ3(View view) {
        EditText incarnationTextBox = (EditText) findViewById(R.id.incarnation_text);
        Editable incarnationText = incarnationTextBox.getText();
        String incarnationString = incarnationText.toString();
        Log.v("MainActivity","IncarnationString is " + incarnationString);

        if (incarnationString.trim().equalsIgnoreCase("die Fleischwerdung") || incarnationString.trim().equalsIgnoreCase("Fleischwerdung")) {
            TextView messageTextView = (TextView) findViewById(R.id.Q3_response);
            messageTextView.setText("Good job!");
            correct = correct + 1;
            addCorrect(correct);
        } else {
            TextView messageTextView = (TextView) findViewById(R.id.Q3_response);
            messageTextView.setText("Sorry! Try again!");
            wrong = wrong + 1;
            addWrong(wrong);
        }

    }

    // Actions for the submit button for question 4

    public void submitQ4(View view) {
        EditText crucifixionTextBox = (EditText) findViewById(R.id.crucifixion_text);
        Editable crucifixionText = crucifixionTextBox.getText();
        String crucifixionString = crucifixionText.toString();

        if (crucifixionString.trim().equalsIgnoreCase("die Kreuzigung") || crucifixionString.trim().equalsIgnoreCase("Kreuzigung")) {
            TextView messageTextView = (TextView) findViewById(R.id.Q4_response);
            messageTextView.setText("Good job!");
            correct = correct + 1;
            addCorrect(correct);
        } else {
            TextView messageTextView = (TextView) findViewById(R.id.Q4_response);
            messageTextView.setText("Sorry! Try again!");
            wrong = wrong + 1;
            addWrong(wrong);
        }
    }

    // Actions for the submit button for question 5

    public void submitQ5(View view) {
        EditText resurrectionTextBox = (EditText) findViewById(R.id.resurrection_text);
        Editable resurrectionText = resurrectionTextBox.getText();
        String resurrectionString = resurrectionText.toString();

        if (resurrectionString.trim().equalsIgnoreCase("die Auferstehung") || resurrectionString.trim().equalsIgnoreCase("Auferstehung")) {
            TextView messageTextView = (TextView) findViewById(R.id.Q5_response);
            messageTextView.setText("Good job!");
            correct = correct + 1;
            addCorrect(correct);
        } else {
            TextView messageTextView = (TextView) findViewById(R.id.Q5_response);
            messageTextView.setText("Sorry! Try again!");
            wrong = wrong + 1;
            addWrong(wrong);
        }
    }

    // Actions for the submit button for question 6

    public void submitQ6(View view) {
        EditText ascensionTextBox = (EditText) findViewById(R.id.ascension_text);
        Editable ascensionText = ascensionTextBox.getText();
        String ascensionString = ascensionText.toString();

        if (ascensionString.trim().equalsIgnoreCase("die Auffahrt") || ascensionString.trim().equalsIgnoreCase("Auffahrt")) {
            TextView messageTextView = (TextView) findViewById(R.id.Q6_response);
            messageTextView.setText("Good job!");
            correct = correct + 1;
            addCorrect(correct);
        } else {
            TextView messageTextView = (TextView) findViewById(R.id.Q6_response);
            messageTextView.setText("Sorry! Try again!");
            wrong = wrong + 1;
            addWrong(wrong);
        }
    }

    // Actions for the submit button for question 7

    public void submitQ7(View view) {
        EditText dispensingTextBox = (EditText) findViewById(R.id.dispensing_text);
        Editable dispensingText = dispensingTextBox.getText();
        String dispensingString = dispensingText.toString();

        if (dispensingString.trim().equalsIgnoreCase("die Austeilung") || dispensingString.trim().equalsIgnoreCase("Austeilung")) {
            TextView messageTextView = (TextView) findViewById(R.id.Q7_response);
            messageTextView.setText("Good job!");
            correct = correct + 1;
            addCorrect(correct);
        } else {
            TextView messageTextView = (TextView) findViewById(R.id.Q7_response);
            messageTextView.setText("Sorry! Try again!");
            wrong = wrong + 1;
            addWrong(wrong);
        }
    }

    // The onClear button isn't functioning correctly

    public void onClear(View view) {
        /* Clears all selected radio buttons to default */
        correct = 0;
        wrong = 0;
        radioGroupQ1.clearCheck();
        addCorrect(correct);
        addWrong(wrong);
//        checkBoxQ2A1.setChecked(false);
//        checkBoxQ2A2.setChecked(false);
//        checkBoxQ2A3.setChecked(false);
//        checkBoxQ2A4.setChecked(false);
//        incarnationTextBox.setText("");
//        crucifixionTextBox.setText("");
//        resurrectionTextBox.setText("");
//        ascensionTextBox.setText("");
    }
}
