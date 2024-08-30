package com.example.xucxac;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView diceImage;
    private Button Roll_dice;
    private Random random;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        diceImage = findViewById(R.id.diceImage);
        Roll_dice = findViewById(R.id.Roll_dice);
        random = new Random();

        Roll_dice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = random.nextInt(6) + 1; // Số ngẫu nhiên từ 1 đến 6
                switch (number) {
                    case 1:
                        diceImage.setImageResource(R.drawable.mat1);
                        break;
                    case 2:
                        diceImage.setImageResource(R.drawable.mat2);
                        break;
                    case 3:
                        diceImage.setImageResource(R.drawable.mat3);
                        break;
                    case 4:
                        diceImage.setImageResource(R.drawable.mat4);
                        break;
                    case 5:
                        diceImage.setImageResource(R.drawable.mat5);
                        break;
                    case 6:
                        diceImage.setImageResource(R.drawable.mat6);
                        break;
                }
            }
        });
    }
}
