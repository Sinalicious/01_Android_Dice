package com.example.sina.a01_android_dice;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Link the id given in the xml to a variable to be used inside Java
        Button rollButton = (Button) findViewById(R.id.rollButton);
        final ImageView DiceLeft = (ImageView) findViewById(R.id.imgDiceLeft);
        final ImageView DiceRight = (ImageView) findViewById(R.id.imgDiceRight);

        // Create an array(list) to store the images for our dices
        // making it final so it won't be changed (constant variable)
        final int[] diceArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        // Create event OnClick for the rollButton
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Print the log d = Debug
                Log.d("Dice", "button pressed");

                Random randomNumberGenerator = new Random();

                // Create number as int to store a random number generated but the function from 0 to 5
                int number = randomNumberGenerator.nextInt(6);

                DiceLeft.setImageResource(diceArray[number]);

                number = randomNumberGenerator.nextInt(6);

                DiceRight.setImageResource(diceArray[number]);
            }
        });
    }
}
