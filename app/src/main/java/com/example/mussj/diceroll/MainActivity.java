package com.example.mussj.diceroll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public Button rollButton;
    public ImageView imageViewDiceOne;
    public ImageView imageViewDiceTwo;
    public Random myRandomNumber = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageViewDiceOne=findViewById(R.id.imageView);
        imageViewDiceTwo=findViewById(R.id.imageView2);
        rollButton=findViewById(R.id.rollBtn);
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(),"Works",Toast.LENGTH_SHORT).show();
                rollOurDice();

            }
        });
    }
    public void rollOurDice(){
        int myRanNumber = myRandomNumber.nextInt(36)+1;
        switch (myRanNumber){
            case 1:
                imageViewDiceOne.setImageResource(R.drawable.dice1);
                imageViewDiceTwo.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageViewDiceOne.setImageResource(R.drawable.dice1);
                imageViewDiceTwo.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageViewDiceOne.setImageResource(R.drawable.dice1);
                imageViewDiceTwo.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageViewDiceOne.setImageResource(R.drawable.dice1);
                imageViewDiceTwo.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageViewDiceOne.setImageResource(R.drawable.dice1);
                imageViewDiceTwo.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageViewDiceOne.setImageResource(R.drawable.dice1);
                imageViewDiceTwo.setImageResource(R.drawable.dice6);
                break;
            case 7:
                imageViewDiceOne.setImageResource(R.drawable.dice2);
                imageViewDiceTwo.setImageResource(R.drawable.dice1);
                break;
            case 8:
                imageViewDiceOne.setImageResource(R.drawable.dice2);
                imageViewDiceTwo.setImageResource(R.drawable.dice2);
                break;
            case 9:
                imageViewDiceOne.setImageResource(R.drawable.dice2);
                imageViewDiceTwo.setImageResource(R.drawable.dice3);
                break;
            case 10:
                imageViewDiceOne.setImageResource(R.drawable.dice2);
                imageViewDiceTwo.setImageResource(R.drawable.dice4);
                break;
            case 11:
                imageViewDiceOne.setImageResource(R.drawable.dice2);
                imageViewDiceTwo.setImageResource(R.drawable.dice5);
                break;
            case 12:
                imageViewDiceOne.setImageResource(R.drawable.dice2);
                imageViewDiceTwo.setImageResource(R.drawable.dice6);
                break;
            case 13:
                imageViewDiceOne.setImageResource(R.drawable.dice3);
                imageViewDiceTwo.setImageResource(R.drawable.dice1);
                break;
            case 14:
                imageViewDiceOne.setImageResource(R.drawable.dice3);
                imageViewDiceTwo.setImageResource(R.drawable.dice2);
                break;
            case 15:
                imageViewDiceOne.setImageResource(R.drawable.dice3);
                imageViewDiceTwo.setImageResource(R.drawable.dice3);
                break;
            case 16:
                imageViewDiceOne.setImageResource(R.drawable.dice3);
                imageViewDiceTwo.setImageResource(R.drawable.dice4);
                break;
            case 17:
                imageViewDiceOne.setImageResource(R.drawable.dice3);
                imageViewDiceTwo.setImageResource(R.drawable.dice5);
                break;
            case 18:
                imageViewDiceOne.setImageResource(R.drawable.dice3);
                imageViewDiceTwo.setImageResource(R.drawable.dice6);
                break;
            case 19:
                imageViewDiceOne.setImageResource(R.drawable.dice4);
                imageViewDiceTwo.setImageResource(R.drawable.dice1);
                break;
            case 20:
                imageViewDiceOne.setImageResource(R.drawable.dice4);
                imageViewDiceTwo.setImageResource(R.drawable.dice2);
                break;
            case 21:
                imageViewDiceOne.setImageResource(R.drawable.dice4);
                imageViewDiceTwo.setImageResource(R.drawable.dice3);
                break;
            case 22:
                imageViewDiceOne.setImageResource(R.drawable.dice4);
                imageViewDiceTwo.setImageResource(R.drawable.dice4);
                break;
            case 23:
                imageViewDiceOne.setImageResource(R.drawable.dice4);
                imageViewDiceTwo.setImageResource(R.drawable.dice5);
                break;
            case 24:
                imageViewDiceOne.setImageResource(R.drawable.dice4);
                imageViewDiceTwo.setImageResource(R.drawable.dice6);
                break;
            case 25:
                imageViewDiceOne.setImageResource(R.drawable.dice5);
                imageViewDiceTwo.setImageResource(R.drawable.dice1);
                break;
            case 26:
                imageViewDiceOne.setImageResource(R.drawable.dice5);
                imageViewDiceTwo.setImageResource(R.drawable.dice2);
                break;
            case 27:
                imageViewDiceOne.setImageResource(R.drawable.dice5);
                imageViewDiceTwo.setImageResource(R.drawable.dice3);
                break;
            case 28:
                imageViewDiceOne.setImageResource(R.drawable.dice5);
                imageViewDiceTwo.setImageResource(R.drawable.dice4);
                break;
            case 29:
                imageViewDiceOne.setImageResource(R.drawable.dice5);
                imageViewDiceTwo.setImageResource(R.drawable.dice5);
                break;
            case 30:
                imageViewDiceOne.setImageResource(R.drawable.dice5);
                imageViewDiceTwo.setImageResource(R.drawable.dice6);
                break;
            case 31:
                imageViewDiceOne.setImageResource(R.drawable.dice6);
                imageViewDiceTwo.setImageResource(R.drawable.dice1);
                break;
            case 32:
                imageViewDiceOne.setImageResource(R.drawable.dice6);
                imageViewDiceTwo.setImageResource(R.drawable.dice2);
                break;
            case 33:
                imageViewDiceOne.setImageResource(R.drawable.dice6);
                imageViewDiceTwo.setImageResource(R.drawable.dice3);
                break;
            case 34:
                imageViewDiceOne.setImageResource(R.drawable.dice6);
                imageViewDiceTwo.setImageResource(R.drawable.dice4);
                break;
            case 35:
                imageViewDiceOne.setImageResource(R.drawable.dice6);
                imageViewDiceTwo.setImageResource(R.drawable.dice5);
                break;
            case 36:
                imageViewDiceOne.setImageResource(R.drawable.dice6);
                imageViewDiceTwo.setImageResource(R.drawable.dice6);
                break;
        }

    }
}
