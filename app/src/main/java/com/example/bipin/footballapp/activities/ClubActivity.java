package com.example.bipin.footballapp.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.bipin.footballapp.R;
import com.example.bipin.footballapp.adapters.ClubAdapter;
import com.example.bipin.footballapp.pojos.ClubItem;

import java.util.ArrayList;


public class ClubActivity extends AppCompatActivity {

    ArrayList<ClubItem> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club);
        RecyclerView rc = (RecyclerView) findViewById(R.id.clubRv);
        ClubAdapter clubAdapter = new ClubAdapter(this);

        if (rc != null) {

            rc.setLayoutManager(new GridLayoutManager(this, 2));
            rc.setAdapter(clubAdapter);
        }

        data.add(new ClubItem("Barcelona"));
        data.add(new ClubItem("Real Madrid"));
        data.add(new ClubItem("Sevilla"));
        data.add(new ClubItem("Malaga"));
        data.add(new ClubItem("At Madrid"));


        clubAdapter.setData(data);
    }
}
