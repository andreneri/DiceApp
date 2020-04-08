package com.andreneri;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button rollButton;
    private ImageView leftDice;
    private ImageView rightDice;
    private ImageView appLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rollButton = findViewById(R.id.rollButton);
        leftDice = findViewById(R.id.image_leftDice);
        rightDice = findViewById(R.id.image_rightDice);
        appLogo = findViewById(R.id.image_logo);

        final int[] dices = new int[] {
                R.drawable.dice1, R.drawable.dice2,
                R.drawable.dice3, R.drawable.dice4,
                R.drawable.dice5, R.drawable.dice6
        };


        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int numberGenerated = random.nextInt(6);

                leftDice.setImageResource(dices[numberGenerated]);
                numberGenerated = random.nextInt(6);
                rightDice.setImageResource(dices[numberGenerated]);

            }
        });
    }
}
