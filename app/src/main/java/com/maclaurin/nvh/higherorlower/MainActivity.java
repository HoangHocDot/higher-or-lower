package com.maclaurin.nvh.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.lang.Math;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private  int randomNumber;
    public void guessFunction(View v) {

            EditText numberOfUser =(EditText) findViewById(R.id.editTextNumber);
            Log.i("NumberRandom",Integer.toString(randomNumber));

            int inputNumber = Integer.parseInt(numberOfUser.getText().toString());
            Log.i("Number Input",inputNumber+"");
            if(inputNumber > randomNumber){
                Toast.makeText(this, "Lower", Toast.LENGTH_SHORT).show();
            }  else if(inputNumber < randomNumber){
            Toast.makeText(this, "Higher", Toast.LENGTH_SHORT).show();
                }
            else{
                Toast.makeText(this, "you get it, you so cool", Toast.LENGTH_SHORT).show();
        }
        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random random = new Random();
        int n = random.nextInt(20) +1;
        randomNumber = n;
    }
}