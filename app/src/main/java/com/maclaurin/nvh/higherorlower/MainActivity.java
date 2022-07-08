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
    public void generateRandomNumber(){
        Random random = new Random();
        randomNumber = random.nextInt(20) +1;
    }
    public void guessFunction(View v) {

            EditText numberOfUser =(EditText) findViewById(R.id.editTextNumber);
            Log.i("NumberRandom",Integer.toString(randomNumber));
            String message;
            int inputNumber = Integer.parseInt(numberOfUser.getText().toString());
            Log.i("Number Input",inputNumber+"");
            if(inputNumber > randomNumber){
                message = "Lower";
            }  else if(inputNumber < randomNumber){
                message = "Higher";
                }
            else{
                message = "you get it, you so cool, You can try again!";
                this.generateRandomNumber();
        }
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}