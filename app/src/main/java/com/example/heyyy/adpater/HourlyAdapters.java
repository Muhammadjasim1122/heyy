package com.example.heyyy.adpater;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.heyyy.Domain.trading;
import com.example.heyyy.R;

import java.util.ArrayList;

public class HourlyAdapters extends RecyclerView.Adapter<HourlyAdapters.viewHolder> {
    ArrayList<trading> items;
    Context context;
    public HourlyAdapters(ArrayList<trading> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public HourlyAdapters.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate= LayoutInflater.from(parent.getContext()).inflate(R.layout.viewgraph,parent,false);
        context = parent.getContext();
        return new viewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull HourlyAdapters.viewHolder holder, int position) {
        holder.brandtxt.setText(items.get(position).getBrandname());
        holder.ratetxt.setText(items.get(position).getRate());
        holder.preratetxt.setText(items.get(position).getPrerate());
        holder.percenttxt.setText(items.get(position).getPercent());
        int drawableResourceId1 = holder.itemView.getResources().getIdentifier(items.get(position).getPicpath(),  "drawable", holder.itemView.getContext().getPackageName());
        Glide.with(context)
                .load(drawableResourceId1)
                .into(holder.Pic1);
        int drawableResourceId = holder.itemView.getResources().getIdentifier(items.get(position).getPicpath(),  "drawable", holder.itemView.getContext().getPackageName());
        Glide.with(context)
                .load(drawableResourceId)
                .into(holder.Pic);

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder {
        TextView brandtxt,ratetxt,preratetxt,percenttxt;
        ImageView Pic,Pic1;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            brandtxt= itemView.findViewById(R.id.brandname);
            ratetxt= itemView.findViewById(R.id.rates);
            preratetxt= itemView.findViewById(R.id.coinprice);
            percenttxt= itemView.findViewById(R.id.coinprice2);
            Pic=itemView.findViewById(R.id.pic);
            Pic1=itemView.findViewById(R.id.pic1);



        }
    }
}
