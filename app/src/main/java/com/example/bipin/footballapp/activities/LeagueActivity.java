package com.example.bipin.footballapp.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.bipin.footballapp.R;
import com.example.bipin.footballapp.adapters.LeagueAdapter;
import com.example.bipin.footballapp.pojos.LeagueItem;

import java.util.ArrayList;

public class LeagueActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private LeagueAdapter leagueAdapter;
    ArrayList<LeagueItem> data=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView= (RecyclerView) findViewById(R.id.leagueRv);

        leagueAdapter=new LeagueAdapter(this);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        recyclerView.setAdapter(leagueAdapter);

        data.add(new LeagueItem("Laliga"));
        data.add(new LeagueItem("BundesLiga"));
        data.add(new LeagueItem("Ligue 1"));
        data.add(new LeagueItem("Copa Del"));
        data.add(new LeagueItem("Spanish Super Cup"));

        leagueAdapter.setData(data);


        sendJsonRequest();


    }

    private void sendJsonRequest() {



    }
}
