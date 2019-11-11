package com.diamond.presidentofus.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.diamond.presidentofus.R;

public class Form extends AppCompatActivity {
    EditText name, email;
    Spinner spinner;
    Button btnRegister;

    public static final String countries[] = {
            "Nepal",
            "India",
            "South Africa",
            "England",
            "Pakistan",
            "Sri Lanka",
            "China",
            "Bangladesh"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        btnRegister = findViewById(R.id.btnRegister);
        spinner = findViewById(R.id.spinner);


        ArrayAdapter adapter = new ArrayAdapter<>(this,
                R.layout.support_simple_spinner_dropdown_item,
                countries);

        spinner.setAdapter(adapter);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sname, semail, scountry;
                sname = name.getText().toString();
                semail = email.getText().toString();
                scountry = spinner.getSelectedItem().toString();

                Intent intentForm = new Intent(Form.this, Display.class);
                intentForm.putExtra("formName", sname);
                intentForm.putExtra("formEmail", semail);
                intentForm.putExtra("formCountry", scountry);
                startActivity(intentForm);
            }
        });
    }
}
