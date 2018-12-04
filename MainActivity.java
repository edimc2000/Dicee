package com.minted.arne.dicee;

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

        /* variables --- type and name*/
        Button rollButton;
        rollButton = (Button) findViewById(R.id.rollButton);

        ImageView leftdice = (ImageView) findViewById(R.id.image_leftDice);
        ImageView rightdice = (ImageView) findViewById(R.id.image_rightDice);

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dicee","The Ze button has been pressed (123)");

                Random randomNumberGenerator = new Random();

                int number = randomNumberGenerator.nextInt(6);

                Log.d("Dicee","The random number is :" + number);
            }
        });

    }
}
