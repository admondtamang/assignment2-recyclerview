package com.diamond.presidentofus.activities;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.diamond.presidentofus.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class PresidentDetail extends AppCompatActivity {

    CircleImageView img;
    TextView txtName, txtDetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_president_detail);
        img = findViewById(R.id.d_image);
        txtName = findViewById(R.id.d_name);
        txtDetail = findViewById(R.id.d_description);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            int image = bundle.getInt("image");
            String name = bundle.getString("name");
            String detail = bundle.getString("detail");

            img.setImageResource(image);
            txtName.setText(name);
            txtDetail.setText(detail);

            ActionBar actionBar = getSupportActionBar();
            actionBar.setTitle(bundle.getString("name"));
        }
        else{
            Toast.makeText(this, "No Data found", Toast.LENGTH_LONG).show();
        }

    }
}
