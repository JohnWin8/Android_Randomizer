package com.JohnWin.realrandomizer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public static String OPTION_TEXT_1 = "";
    public static String OPTION_TEXT_2 = "";
    public static String OPTION_TEXT_3 = "";
    public static String OPTION_TEXT_4 = "";
    public static String OPTION_TEXT_5 = "";
    public static String OPTION_TEXT_6 = "";
    public static String OPTION_TEXT_7 = "";
    public static String OPTION_TEXT_8 = "";
    public static String OPTION_TEXT_9 = "";
    public static String OPTION_TEXT_10 = "";
    public static String OPTION_TEXT_11 = "";

    // All the elements on the page we might need
    private SeekBar bar;
    private Button randomButton;
    private TextView results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // These fill out the global variable elements
        bar = findViewById(R.id.MainScrollBar);
        randomButton = findViewById(R.id.randomButton);
        results = (TextView) findViewById(R.id.ResultView);

        randomButton.setOnClickListener(this);
        // waits for the button to be clicked to change the view
        configureNextButton();
    }

    // deals with switching the view between the two screens
    private void configureNextButton() {
        // find the button we want
        Button nextButton = (Button) findViewById(R.id.setChoicesButton);
        // set a clickListener
        nextButton.setOnClickListener(new View.OnClickListener() {
            // need to override this method to instantiate a OnClickListener
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });
    }

    String getInputString(Integer i) {
        String retval = "";
        switch (i) {
            case 1: {
                retval = OPTION_TEXT_1;
                break;
            }
            case 2: {
                retval = OPTION_TEXT_2;
                break;
            }
            case 3: {
                retval = OPTION_TEXT_3;
                break;
            }
            case 4: {
                retval = OPTION_TEXT_4;
                break;
            }
            case 5: {
                retval = OPTION_TEXT_5;
                break;
            }
            case 6: {
                retval = OPTION_TEXT_6;
                break;
            }
            case 7: {
                retval = OPTION_TEXT_7;
                break;
            }
            case 8: {
                retval = OPTION_TEXT_8;
                break;
            }
            case 9: {
                retval = OPTION_TEXT_9;
                break;
            }
            case 10: {
                retval = OPTION_TEXT_10;
                break;
            }
            case 11: {
                retval = OPTION_TEXT_11;
                break;
            }

        }
        return retval;
    }

    // handles clicks on buttons aside from the switch-view button
    //      so far just used for the randomButton
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.randomButton: {
                int rand = new Random().nextInt(bar.getProgress() + 1) + 1;
                String output = getInputString(rand);
                if (output.isEmpty() || output.equals(null)) output = Integer.toString(rand);
                results.setText(output);
            }
        }
    }

}
