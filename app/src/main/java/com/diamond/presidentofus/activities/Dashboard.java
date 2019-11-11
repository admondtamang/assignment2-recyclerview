package com.diamond.presidentofus.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.diamond.presidentofus.R;

public class Dashboard extends AppCompatActivity implements View.OnClickListener {

    Button assin1,assign2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        assin1 = findViewById(R.id.assignment1);
        assign2=findViewById(R.id.assignment2);
        assin1.setOnClickListener(this);
        assign2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.assignment1){
            Intent intent1 = new Intent(this, MainActivity.class);
            startActivity(intent1);
        }
        if(v.getId() == R.id.assignment2){
            Intent intent2 = new Intent(this, Form.class);
            startActivity(intent2);
        }
    }
}
