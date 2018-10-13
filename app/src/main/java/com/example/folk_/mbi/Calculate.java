package com.example.folk_.mbi;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calculate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);
        final Button calculate = findViewById(R.id.calculate_b);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText HeightText = findViewById(R.id.height_t);
                EditText WeightText = findViewById(R.id.weight_t);
                int height = Integer.parseInt(HeightText.getText().toString());
                int weight = Integer.parseInt(WeightText.getText().toString());
                float CalHeight = height/100f;
                float bmi = weight/(CalHeight*CalHeight);
                String PrintText = "";
                if (bmi < 18.5){
                    PrintText = "ผอมมากจ้า ลมพัดจะปลิวอยู่แล้ว...";
                }
                else if (bmi < 25){
                    PrintText = "หุ่นดี อย่าเสร่อบ่นว่าอ้วนแล้ว";
                }
                else if (bmi < 30){
                    PrintText = "อ้วน อ้วนเหมียนหนูรัตน์";
                }
                else {
                    PrintText = "อีดอก เกียมซื้อรถเข็น..";
                }

                AlertDialog.Builder dialog = new AlertDialog.Builder(Calculate.this);
                dialog.setTitle("ผลการคำนวณ");
                dialog.setMessage(PrintText);
                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                dialog.show();
            }
        });
    }
}
