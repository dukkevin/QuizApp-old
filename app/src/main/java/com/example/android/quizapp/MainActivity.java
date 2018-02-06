package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * This is a quiz app with wich you can learn capitals of the world.
 */
public class MainActivity extends AppCompatActivity {

    private RadioGroup firstRadioGroup;
    private RadioGroup secondRadioGroup;
    private RadioGroup thirdRadioGroup;
    private RadioGroup fourthRadioGroup;
    private RadioGroup fifthRadioGroup;
    private RadioGroup sixthRadioGroup;
    private CheckBox firstCheckBox;
    private CheckBox secondCheckBox;
    private CheckBox thirdCheckBox;
    private RadioButton firstRadioButton;
    private RadioButton secondRadioButton;
    private RadioButton thirdRadioButton;
    private RadioButton fourthRadioButton;
    private RadioButton fifthRadioButton;
    private RadioButton sixthRadioButton;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstRadioGroup = (RadioGroup) findViewById(R.id.first_radio_group);
        secondRadioGroup = (RadioGroup) findViewById(R.id.second_radio_group);
        thirdRadioGroup = (RadioGroup) findViewById(R.id.third_radio_group);
        firstRadioButton = (RadioButton) findViewById(R.id.first_correct);
        secondRadioButton = (RadioButton) findViewById(R.id.second_correct);
        thirdRadioButton = (RadioButton) findViewById(R.id.third_correct);
        fourthRadioButton = (RadioButton) findViewById(R.id.fourth_correct);
        fifthRadioButton = (RadioButton) findViewById(R.id.fifth_correct);
        sixthRadioButton = (RadioButton) findViewById(R.id.sixth_correct);
        fourthRadioGroup = (RadioGroup) findViewById(R.id.fourth_radio_group);
        fifthRadioGroup = (RadioGroup) findViewById(R.id.fifth_radio_group);
        sixthRadioGroup = (RadioGroup) findViewById(R.id.sixth_radio_group);
        firstCheckBox = (CheckBox) findViewById(R.id.first_checkbox);
        secondCheckBox = (CheckBox) findViewById(R.id.second_checkbox);
        thirdCheckBox = (CheckBox) findViewById(R.id.third_checkbox);
        editText = (EditText) findViewById(R.id. first_edit_text);
    }

    /**
     * This method is called when the RESULT button is clicked.
     */
    public void displayResults (View view) {
        int point = 0;

        boolean toCheckOne = firstRadioButton.isChecked();
        if (toCheckOne) {
            point++;
        }

        boolean toCheckTwo = secondRadioButton.isChecked();
        if (toCheckTwo) {
            point++;
        }

        boolean toCheckThree = thirdRadioButton.isChecked();
        if (toCheckThree) {
            point++;
        }

        boolean toCheckFour = fourthRadioButton.isChecked();
        if (toCheckFour) {
            point++;
        }

        boolean toCheckFive = fifthRadioButton.isChecked();
        if (toCheckFive) {
            point++;
        }

        boolean toCheckSix = sixthRadioButton.isChecked();
        if (toCheckSix) {
            point++;
        }

        String toCheckSeven = editText.getText().toString();
        String answer = "195";
        if (toCheckSeven.equals(answer)){
            point++;
        }

        boolean toCheckFirstCheckBox = firstCheckBox.isChecked();
        boolean toCheckSecondCheckBox = secondCheckBox.isChecked();
        boolean toCheckThirdCheckBox = thirdCheckBox.isChecked();

        if ((toCheckFirstCheckBox && toCheckThirdCheckBox) &&
                (toCheckSecondCheckBox==false)) {
            point++;
        }

        Toast.makeText(this, "You got " + point + " on 8", Toast.LENGTH_LONG).show();
    }


    /**
     * This method is called when the ANSWERS button is clicked.
     */
    public void showGoodAnswers (View view) {
        resetData();
        firstRadioButton.setChecked(true);
        secondRadioButton.setChecked(true);
        thirdRadioButton.setChecked(true);
        fourthRadioButton.setChecked(true);
        fifthRadioButton.setChecked(true);
        sixthRadioButton.setChecked(true);
        firstCheckBox.setChecked(true);
        thirdCheckBox.setChecked(true);
        editText.setText("195");
    }

    /**
     * This method is called when the RESET button is clicked.
     */
    public void resetButton(View view) {
        resetData();
    }

    /**
     * Reset all answers
     */
    public void resetData() {

        firstRadioGroup.clearCheck();
        secondRadioGroup.clearCheck();
        thirdRadioGroup.clearCheck();
        fourthRadioGroup.clearCheck();
        fifthRadioGroup.clearCheck();
        sixthRadioGroup.clearCheck();
        firstCheckBox.setChecked(false);
        secondCheckBox.setChecked(false);
        thirdCheckBox.setChecked(false);
        editText.getText().clear();

    }
}



