package com.JohnWin.realrandomizer;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton clear1;
    private ImageButton clear2;
    private ImageButton clear3;
    private ImageButton clear4;
    private ImageButton clear5;
    private ImageButton clear6;
    private ImageButton clear7;
    private ImageButton clear8;
    private ImageButton clear9;
    private ImageButton clear10;
    private ImageButton clear11;

    private TextInputEditText ET1;
    private EditText ET2;
    private EditText ET3;
    private EditText ET4;
    private EditText ET5;
    private EditText ET6;
    private EditText ET7;
    private EditText ET8;
    private EditText ET9;
    private EditText ET10;
    private EditText ET11;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        // Set all our global edit texts
        ET1 = findViewById(R.id.inputLine1);
        ET2 = (EditText) findViewById(R.id.inputLine2);
        ET3 = (EditText) findViewById(R.id.inputLine3);
        ET4 = (EditText) findViewById(R.id.inputLine4);
        ET5 = (EditText) findViewById(R.id.inputLine5);
        ET6 = (EditText) findViewById(R.id.inputLine6);
        ET7 = (EditText) findViewById(R.id.inputLine7);
        ET8 = (EditText) findViewById(R.id.inputLine8);
        ET9 = (EditText) findViewById(R.id.inputLine9);
        ET10 = (EditText) findViewById(R.id.inputLine10);
        ET11 = (EditText) findViewById(R.id.inputLine11);

        // Fill all of our edit texts with any pre-filled strings
        ET1.setText(MainActivity.OPTION_TEXT_1);
        ET2.setText(MainActivity.OPTION_TEXT_2);
        ET3.setText(MainActivity.OPTION_TEXT_3);
        ET4.setText(MainActivity.OPTION_TEXT_4);
        ET5.setText(MainActivity.OPTION_TEXT_5);
        ET6.setText(MainActivity.OPTION_TEXT_6);
        ET7.setText(MainActivity.OPTION_TEXT_7);
        ET8.setText(MainActivity.OPTION_TEXT_8);
        ET9.setText(MainActivity.OPTION_TEXT_9);
        ET10.setText(MainActivity.OPTION_TEXT_10);
        ET11.setText(MainActivity.OPTION_TEXT_11);

        ET1.setSelection(ET1.getText().length());

        // Set all global clear buttons so we can access them at any time
        clear1 = (ImageButton) findViewById(R.id.clearButton1);
        clear2 = (ImageButton) findViewById(R.id.clearButton2);
        clear3 = (ImageButton) findViewById(R.id.clearButton3);
        clear4 = (ImageButton) findViewById(R.id.clearButton4);
        clear5 = (ImageButton) findViewById(R.id.clearButton5);
        clear6 = (ImageButton) findViewById(R.id.clearButton6);
        clear7 = (ImageButton) findViewById(R.id.clearButton7);
        clear8 = (ImageButton) findViewById(R.id.clearButton8);
        clear9 = (ImageButton) findViewById(R.id.clearButton9);
        clear10 = (ImageButton) findViewById(R.id.clearButton10);
        clear11 = (ImageButton) findViewById(R.id.clearButton11);

        // Set all buttons onto click listeners
        clear1.setOnClickListener(this);
        clear2.setOnClickListener(this);
        clear3.setOnClickListener(this);
        clear4.setOnClickListener(this);
        clear5.setOnClickListener(this);
        clear6.setOnClickListener(this);
        clear7.setOnClickListener(this);
        clear8.setOnClickListener(this);
        clear9.setOnClickListener(this);
        clear10.setOnClickListener(this);
        clear11.setOnClickListener(this);

        configureBackButton();
    }

    private void configureBackButton(){
        // find the button
        Button back = (Button) findViewById(R.id.backButton);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                MainActivity.OPTION_TEXT_1 = getInString(1);
                MainActivity.OPTION_TEXT_2 = getInString(2);
                MainActivity.OPTION_TEXT_3 = getInString(3);
                MainActivity.OPTION_TEXT_4 = getInString(4);
                MainActivity.OPTION_TEXT_5 = getInString(5);
                MainActivity.OPTION_TEXT_6 = getInString(6);
                MainActivity.OPTION_TEXT_7 = getInString(7);
                MainActivity.OPTION_TEXT_8 = getInString(8);
                MainActivity.OPTION_TEXT_9 = getInString(9);
                MainActivity.OPTION_TEXT_10 = getInString(10);
                MainActivity.OPTION_TEXT_11 = getInString(11);

                finish();
            }
        });
    }

    private String getInString(Integer i){
        String retval = "";
        switch(i){
            case 1: {
                retval = ET1.getText().toString();
                break;
            }
            case 2: {
                retval = ET2.getText().toString();
                break;
            }
            case 3: {
                retval = ET3.getText().toString();
                break;
            }
            case 4: {
                retval = ET4.getText().toString();
                break;
            }
            case 5: {
                retval = ET5.getText().toString();
                break;
            }
            case 6: {
                retval = ET6.getText().toString();
                break;
            }
            case 7: {
                retval = ET7.getText().toString();
                break;
            }
            case 8: {
                retval = ET8.getText().toString();
                break;
            }
            case 9: {
                retval = ET9.getText().toString();
                break;
            }
            case 10: {
                retval = ET10.getText().toString();
                break;
            }
            case 11: {
                retval = ET11.getText().toString();
                break;
            }

        }
        return retval;
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.clearButton1 : {
                ET1.getText().clear();
                Toast.makeText(this, "Cleared Line 1", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.clearButton2: {
                ET2.setText("");
                Toast.makeText(this, "Cleared Line 2", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.clearButton3: {
                ET3.getText().clear();
                Toast.makeText(this, "Cleared Line 3", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.clearButton4: {
                ET4.getText().clear();
                Toast.makeText(this, "Cleared Line 4", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.clearButton5: {
                ET5.getText().clear();
                Toast.makeText(this, "Cleared Line 5", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.clearButton6: {
                ET6.getText().clear();
                Toast.makeText(this, "Cleared Line 6", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.clearButton7: {
                ET7.getText().clear();
                Toast.makeText(this, "Cleared Line 7", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.clearButton8: {
                ET8.getText().clear();
                Toast.makeText(this, "Cleared Line 8", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.clearButton9: {
                ET9.getText().clear();
                Toast.makeText(this, "Cleared Line 9", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.clearButton10: {
                ET10.getText().clear();
                Toast.makeText(this, "Cleared Line 10", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.clearButton11: {
                ET11.getText().clear();
                Toast.makeText(this, "Cleared Line 11", Toast.LENGTH_SHORT).show();
                break;
            }
            default: Toast.makeText(this, "No button was found", Toast.LENGTH_SHORT).show();
            break;
        }
    }
}
