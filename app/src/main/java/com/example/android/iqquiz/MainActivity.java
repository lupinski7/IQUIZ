package com.example.android.iqquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.android.iqquiz.R;

public class MainActivity extends AppCompatActivity {
    //Question 1
    RadioButton q1a4B;
    //Question 2
    RadioButton q2a4B;
    //Question 3
    RadioButton q3a1B;
    //Question 4
    RadioButton q4a3B;
    //Question 5
    RadioButton q5a1B;
    //Question 6
    RadioButton q6a3B;
    //Question 7
    RadioButton q7a1B;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        q1a4B = findViewById(R.id.q1a4B);
        q2a4B = findViewById(R.id.q2a4B);
        q3a1B = findViewById(R.id.q3a1B);
        q4a3B = findViewById(R.id.q4a3B);
        q5a1B = findViewById(R.id.q5a1B);
        q6a3B = findViewById(R.id.q6a3B);
        q7a1B = findViewById(R.id.q7a1B);
    }

    public void scoreB(View view) {
        //Score
        int totalScore = 0;
        // Get user's name
        EditText nameField = findViewById(R.id.name_field);
        Editable nameEditable = nameField.getText();
        String name = nameEditable.toString();

        // Figure out if the user wants to play :)
        CheckBox start = findViewById(R.id.start);
        boolean playAbility = start.isChecked();

        if (playAbility) {
            // Count points
            if (q1a4B.isChecked()) {
                totalScore += 1;
            }
            if (q2a4B.isChecked()) {
                totalScore += 1;
            }
            if (q3a1B.isChecked()) {
                totalScore += 1;
            }
            if (q4a3B.isChecked()) {
                totalScore += 1;
            }
            if (q5a1B.isChecked()) {
                totalScore += 1;
            }
            if (q6a3B.isChecked()) {
                totalScore += 1;
            }
            if (q7a1B.isChecked()) {
                totalScore += 1;
            }
            Toast.makeText(this, name + " your score is " + totalScore +" out of 7", Toast.LENGTH_LONG).show();


        } else {
            Toast.makeText(this, name + " check start at the beginning if you wanna play!", Toast.LENGTH_LONG).show();
        }

    }
}
