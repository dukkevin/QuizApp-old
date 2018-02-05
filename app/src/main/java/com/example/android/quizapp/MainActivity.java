package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstRadioGroup = (RadioGroup) findViewById(R.id.first_radio_group);
        secondRadioGroup = (RadioGroup) findViewById(R.id.second_radio_group);
        thirdRadioGroup = (RadioGroup) findViewById(R.id.third_radio_group);
        fourthRadioGroup = (RadioGroup) findViewById(R.id.fourth_radio_group);
        fifthRadioGroup = (RadioGroup) findViewById(R.id.fifth_radio_group);
        sixthRadioGroup = (RadioGroup) findViewById(R.id.sixth_radio_group);
        firstCheckBox = (CheckBox) findViewById(R.id.first_checkbox);
        secondCheckBox = (CheckBox) findViewById(R.id.second_checkbox);
        thirdCheckBox = (CheckBox) findViewById(R.id.third_checkbox);

    }


    private RadioGroup firstRadioGroup;
    private RadioGroup secondRadioGroup;
    private RadioGroup thirdRadioGroup;
    private RadioGroup fourthRadioGroup;
    private RadioGroup fifthRadioGroup;
    private RadioGroup sixthRadioGroup;
    private CheckBox firstCheckBox;
    private CheckBox secondCheckBox;
    private CheckBox thirdCheckBox;

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
    }

    /**
     * Call resetData method when RESET button is pressed
     *
     * @param view
     */
    public void resetButton(View view) {
        resetData();
    }

    public void showGoodAnswers(View view) {
        resetData();

    }
}



