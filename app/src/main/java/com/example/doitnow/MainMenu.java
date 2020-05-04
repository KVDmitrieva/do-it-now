package com.example.doitnow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {
    Button list, daily, project;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        daily = findViewById(R.id.but1);
        project = findViewById(R.id.but2);
        list = findViewById(R.id.but3);

        daily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainMenu.this, DailyRoutine.class);
                startActivity(intent);
                finish();

            }
        });

        project.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainMenu.this, Projects.class);
                startActivity(intent);
                finish();

            }
        });

        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainMenu.this, List.class);
                startActivity(intent);
                finish();

            }
        });

    }
}
