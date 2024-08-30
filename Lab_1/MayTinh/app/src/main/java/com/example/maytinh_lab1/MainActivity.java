package com.example.maytinh_lab1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText txtX, txtY;
    TextView txtResult;
    Button btnPlus, btnSubtract, btnMultiply, btnDivide, btnPercent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        initControl();
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.txtResult), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    private void initControl() {
        txtX = findViewById(R.id.txtX);
        txtY = findViewById(R.id.txtY);
        txtResult = findViewById(R.id.txtResult);
        btnPlus = findViewById(R.id.btnPlus);
        btnSubtract = findViewById(R.id.btnSubtract);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);
        btnPercent = findViewById(R.id.btnPercent);
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double x = Double.parseDouble(txtX.getText().toString());
                double y = Double.parseDouble(txtY.getText().toString());
                double  result = x + y;
                txtResult.setText(String.valueOf(result));
            }
        });
        btnSubtract.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                double x = Double.parseDouble(txtX.getText().toString());
                double y = Double.parseDouble(txtY.getText().toString());
                double result = x - y;
                txtResult.setText(String.format("%.2f", result));
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                double x = Double.parseDouble(txtX.getText().toString());
                double y = Double.parseDouble(txtY.getText().toString());
                double result = x * y;
                txtResult.setText(String.format("%.2f", result));
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                double x = Double.parseDouble(txtX.getText().toString());
                double y = Double.parseDouble(txtY.getText().toString());
                if (y == 0) {
                    txtResult.setText("Không thể chia cho 0");
                } else {
                    double result = x / y;
                    txtResult.setText(String.format("%.2f", result));
                }
            }
        });
        btnPercent.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                double x = Double.parseDouble(txtX.getText().toString());
                double y = Double.parseDouble(txtY.getText().toString());
                if(y == 0){
                    txtResult.setText(("Không thể chia cho 0"));
                } else {
                    double result = (x / y)*100;
                    txtResult.setText(String.format("%.2f", result));
                }
            }
        });
    }
}