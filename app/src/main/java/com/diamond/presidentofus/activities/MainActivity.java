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
    private HashMap<String, String> presidentMap;
    private static final String detail[] = {
            "Donald Trump", "Donald John Trump is the 45th and current president of the United States. Before entering politics, he was a businessman and television personality. Trump was born and raised in the New York City borough of Queens, and received a B.S. degree in economics from the Wharton School at the University of Pennsylvania.",
            "Barack Obama", "Barack Hussein Obama II is an American attorney and politician who served as the 44th president of the United States from 2009 to 2017. A member of the Democratic Party, he was the first African American to be elected to the presidency.",
            "George W. Bush", "George Walker Bush is an American politician and businessman who served as the 43rd president of the United States from 2001 to 2009. He had previously served as the 46th governor of Texas from 1995 to 2000.",
//            "Bill Clinton", "William Jefferson Clinton is an American politician who served as the 42nd president of the United States from 1993 to 2001. Prior to his presidency, he served as governor of Arkansas and as attorney general of Arkansas. A member of the Democratic Party, Clinton was known as a New Democrat, and many of his policies reflected a centrist \"Third Way\" political philosophy.",
//            "George Bush", "George Herbert Walker Bush was an American politician and businessman who served as the 41st president of the United States from 1989 to 1993 and the 43rd vice president from 1981 to 1989.",
//            "Ronald Reagan", "Ronald Wilson Reagan was an American politician who served as the 40th president of the United States from 1981 to 1989 and became the highly influential voice of modern conservatism. Prior to his presidency, he was a Hollywood actor and union leader before serving as the 33rd governor of California from 1967 to 1975.",
//            "Jimmy Carter", "James Earl Carter Jr. is an American politician and philanthropist who served as the 39th president of the United States from 1977 to 1981. A member of the Democratic Party.",
//            "Gerald Ford", "Gerald Rudolph Ford Jr. was an American politician who served as the 38th president of the United States from August 1974 to January 1977. Before his accession to the presidency, Ford served as the 40th vice president of the United States from December 1973 to August 1974."
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presidentMap = new HashMap<>();
        for(int i = 0; i < detail.length; i += 2){
            presidentMap.put(detail[i], detail[i+1]);
        }

        pres = new ArrayList<>();
        pres.add(new President("Joe", "Joseph Robinette Biden Jr. is an American politician who served as the 47th vice president of the United States from 2009 to 2017.", R.drawable.joe));
        pres.add(new President("Obama", "Donald John Trump is the 45th and current president of the United States. Before entering politics, he was a businessman and television personality.", R.drawable.obama));
        pres.add(new President("Boris", "Alexander Boris de Pfeffel Johnson Hon FRIBA is a British politician, writer, and former journalist serving as Prime Minister .", R.drawable.boris));
        RecyclerView recyclerView = findViewById(R.id.recyclerview);


        RecyclerViewAdapter myadapter = new RecyclerViewAdapter(this, pres);
        recyclerView.setAdapter(myadapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

    }
}
