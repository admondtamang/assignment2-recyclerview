package com.diamond.presidentofus.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.diamond.presidentofus.Model.President;
import com.diamond.presidentofus.R;
import com.diamond.presidentofus.Adapter.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<President> pres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pres = new ArrayList<>();
        pres.add(new President("George W. Bush", "George Walker Bush is an American politician and businessman who served as the 43rd president of the United States from 2001 to 2009 .", R.drawable.george));
        pres.add(new President("Joe", "Joseph Robinette Biden Jr. is an American politician who served as the 47th vice president of the United States from 2009 to 2017.", R.drawable.joe));
        pres.add(new President("Bill", "Alexander Boris de Pfeffel Johnson Hon FRIBA is a British politician, writer, and former journalist serving as Prime Minister .", R.drawable.bill));
        pres.add(new President("Obama", "Donald John Trump is the 45th and current president of the United States. Before entering politics, he was a businessman and television personality.", R.drawable.obama));
        pres.add(new President("Donal", "Donald John Trump is the 45th and current president of the United States. Before entering politics, he was a businessman and television personality.", R.drawable.donal));
        pres.add(new President("Boris", "Alexander Boris de Pfeffel Johnson Hon FRIBA is a British politician, writer, and former journalist serving as Prime Minister .", R.drawable.boris));
        pres.add(new President("Joe", "Joseph Robinette Biden Jr. is an American politician who served as the 47th vice president of the United States from 2009 to 2017.", R.drawable.joe));
        RecyclerView recyclerView = findViewById(R.id.recyclerview);


        RecyclerViewAdapter myadapter = new RecyclerViewAdapter(this, pres);
        recyclerView.setAdapter(myadapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

    }
}
