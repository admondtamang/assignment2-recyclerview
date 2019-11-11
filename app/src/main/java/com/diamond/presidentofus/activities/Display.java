package com.diamond.presidentofus.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.diamond.presidentofus.R;

public class Display extends AppCompatActivity {
    TextView Name, Email, Country,Age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Name = findViewById(R.id.name);
        Email = findViewById(R.id.email);
        Country = findViewById(R.id.country);
        Age=findViewById(R.id.age);
        Bundle bundleForm = getIntent().getExtras();
        if(bundleForm != null){
            Name.setText(bundleForm.getString("formName"));
            Email.setText(bundleForm.getString("formEmail"));
            Country.setText(bundleForm.getString("formCountry"));
            Age.setText(bundleForm.getString("formAge"));
        }
        else{
            Toast.makeText(this, "No Message", Toast.LENGTH_LONG).show();
        }
    }
}
