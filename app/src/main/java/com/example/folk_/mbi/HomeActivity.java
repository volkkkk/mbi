package com.example.folk_.mbi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        final Button start = findViewById(R.id.start_b);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast welcomeText = Toast.makeText(HomeActivity.this,"Hello",Toast.LENGTH_SHORT);
                welcomeText.show();

                Intent CalPage = new Intent(HomeActivity.this,Calculate.class);
                startActivity(CalPage);
                //e nha hee
            }
        });
    }
}
