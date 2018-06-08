package com.projectworlds.diceee;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button rollButton;
    ImageView imgleft,imgright;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rollButton=(Button)findViewById(R.id.button);


        imgleft=(ImageView)findViewById(R.id.dice_id1);
        imgright=(ImageView)findViewById(R.id.dice_id2);
        final int[] DiceArray={R.drawable.dice1,R.drawable.dice2,R.drawable.dice3,R.drawable.dice4,R.drawable.dice5,R.drawable.dice6};

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dice App","Button has pressed");

                Random randomNumberGenrator=new Random();
                int number =randomNumberGenrator.nextInt(6);
                Log.d("Dice App","The random number is"+ number);

                imgleft.setImageResource(DiceArray[number]);
                number=randomNumberGenrator.nextInt(6);
                imgright.setImageResource(DiceArray[number]);
            }
        });

    }
}
