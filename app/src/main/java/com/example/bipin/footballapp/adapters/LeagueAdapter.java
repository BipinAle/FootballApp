package com.example.bipin.footballapp.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.bipin.footballapp.activities.ClubActivity;
import com.example.bipin.footballapp.pojos.LeagueItem;
import com.example.bipin.footballapp.R;

import java.util.ArrayList;

/**
 * Created by bipin on 8/17/16.
 */
public class LeagueAdapter extends RecyclerView.Adapter<LeagueAdapter.MyViewHolder> {

    LayoutInflater inflater;
    Context context;
    ArrayList<LeagueItem> data=new ArrayList<>();


    public LeagueAdapter(Context context) {
        this.context = context;
        inflater = LayoutInflater.from(context);

    }

    public void setData(ArrayList<LeagueItem> data) {

        this.data=data;

    }

    @Override
    public LeagueAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.league_item, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(LeagueAdapter.MyViewHolder holder, int position) {
        holder.textView.setText(data.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView textView;


        public MyViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            textView= (TextView) itemView.findViewById(R.id.leagueName);

        }

        @Override
        public void onClick(View v) {


                Intent intent = new Intent(context, ClubActivity.class);
                context.startActivity(intent);
            }

    }
}
