package com.example.bipin.footballapp.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.bipin.footballapp.R;
import com.example.bipin.footballapp.activities.YearListActivity;
import com.example.bipin.footballapp.pojos.ClubItem;

import java.util.ArrayList;

/**
 * Created by bipin on 8/17/16.
 */
public class ClubAdapter extends RecyclerView.Adapter<ClubAdapter.MyViewHolder> {
    Context context;
    LayoutInflater inflater;
    ArrayList<ClubItem> data=new ArrayList<>();

    public ClubAdapter(Context context) {
        this.context = context;
        inflater=LayoutInflater.from(context);

    }

    public void setData(ArrayList<ClubItem> data)
    {
        this.data=data;
    }

    @Override
    public ClubAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.club_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ClubAdapter.MyViewHolder holder, int position) {
        holder.tv.setText(data.get(position).getName());


    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder  implements View.OnClickListener{

        TextView tv;

        public MyViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            tv= (TextView) itemView.findViewById(R.id.clubName);

        }

        @Override
        public void onClick(View v) {

            Intent intent=new Intent(context, YearListActivity.class);
            context.startActivity(intent);

        }
    }
}
