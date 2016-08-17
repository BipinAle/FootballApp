package com.example.bipin.footballapp.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.bipin.footballapp.R;
import com.example.bipin.footballapp.pojos.YearItem;

import java.util.ArrayList;

/**
 * Created by bipin on 8/17/16.
 */
public class YearListAdapter extends RecyclerView.Adapter<YearListAdapter.MyViewHolder> {
    Context context;
    LayoutInflater inflater;
    ArrayList<YearItem> data=new ArrayList<>();


    public YearListAdapter(Context context) {
        this.context = context;
        inflater=LayoutInflater.from(context);

    }

    @Override
    public YearListAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.year_item,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(YearListAdapter.MyViewHolder holder, int position) {
        holder.textView.setText(data.get(position).getYear());


    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    public void setData(ArrayList<YearItem>data)

    {
        this.data=data;
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        public MyViewHolder(View itemView) {
            super(itemView);

            textView= (TextView) itemView.findViewById(R.id.year);
        }
    }
}
