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
    EditText name, email,age;
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
        age=findViewById(R.id.age);


        ArrayAdapter adapter = new ArrayAdapter<>(this,
                R.layout.support_simple_spinner_dropdown_item,
                countries);

        spinner.setAdapter(adapter);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Validation
                if(name.getText().toString().matches("")){
                    name.setError("Enter Name");
                    return;
                }if(email.getText().toString().matches("")){
                    email.setError("Enter Email");
                    return;
                }if(age.getText().toString().matches("")){
                    age.setError("Enter Age");
                    return;
                }
                String sname, semail, scountry,sage;
                sname = name.getText().toString();
                semail = email.getText().toString();
                scountry = spinner.getSelectedItem().toString();
                sage=age.getText().toString();
                Intent intentForm = new Intent(Form.this, Display.class);
                intentForm.putExtra("formName", sname);
                intentForm.putExtra("formEmail", semail);
                intentForm.putExtra("formAge", sage);
                intentForm.putExtra("formCountry", scountry);
                startActivity(intentForm);
            }
        });
    }
}
