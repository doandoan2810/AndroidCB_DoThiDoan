package com.example.randomnumber;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView NumberText;
    private Button RandomButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NumberText = findViewById(R.id.NumberText);
        RandomButton = findViewById(R.id.RandomButton);

        RandomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int number = random.nextInt(100); // Số ngẫu nhiên từ 0 đến 99
                NumberText.setText(String.format("%02d", number)); // Hiển thị 2 chữ số
            }
        });
    }
}