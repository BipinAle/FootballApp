package com.example.bipin.footballapp.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.bipin.footballapp.R;
import com.example.bipin.footballapp.adapters.YearListAdapter;
import com.example.bipin.footballapp.pojos.YearItem;

import java.util.ArrayList;

public class YearListActivity extends AppCompatActivity {

    ArrayList<YearItem>data=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_year_list);
        RecyclerView recyclerView= (RecyclerView) findViewById(R.id.yearlistRv);
        YearListAdapter adapter=new YearListAdapter(this);

        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        data.add(new YearItem("1990"));
        data.add(new YearItem("1991"));
        data.add(new YearItem("1992"));
        data.add(new YearItem("1994"));
        data.add(new YearItem("1995"));
        adapter.setData(data);

        recyclerView.setAdapter(adapter);


    }
}
