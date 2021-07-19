package com.example.aireparaguay;

import android.content.ClipData;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {

    private ArrayList<ItemClass> dataList;

    public static class ItemViewHolder extends RecyclerView.ViewHolder{

        public ImageView imageView;
        public TextView cityAndDate;
        public TextView aqiValue;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.emojiForAdapter);
            cityAndDate = itemView.findViewById(R.id.cityAndDateAdapter);
            aqiValue = itemView.findViewById(R.id.aqiAdapter);
        }
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.sensor_item, parent, false);
        ItemViewHolder itemViewHolder = new ItemViewHolder(view);
        return itemViewHolder;
    }

    public ItemAdapter(ArrayList<ItemClass> list){
        dataList = list;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        ItemClass current = dataList.get(position);
        if((Integer.valueOf(current.getAqiValue())>= 0) && (Integer.valueOf(current.getAqiValue())<=50)){
            holder.imageView.setBackgroundColor(Color.GREEN);
        }
        if((Integer.valueOf(current.getAqiValue())>= 51) && (Integer.valueOf(current.getAqiValue())<=100)){
            holder.imageView.setBackgroundColor(Color.rgb(255,255,0));
        }
        if((Integer.valueOf(current.getAqiValue())>= 101) && (Integer.valueOf(current.getAqiValue())<=150)){
            holder.imageView.setBackgroundColor(Color.rgb(255,126,0));
        }
        if((Integer.valueOf(current.getAqiValue())>= 151) && (Integer.valueOf(current.getAqiValue())<=200)){
            holder.imageView.setBackgroundColor(Color.rgb(255,0,0));
        }
        if((Integer.valueOf(current.getAqiValue())>= 201) && (Integer.valueOf(current.getAqiValue())<=300)){
            holder.imageView.setBackgroundColor(Color.rgb(143,63,151));
        }
        if((Integer.valueOf(current.getAqiValue())>= 301) && (Integer.valueOf(current.getAqiValue())<=500)){
            holder.imageView.setBackgroundColor(Color.rgb(126,0,35));
        }

        holder.imageView.setImageResource(current.getImageView());
        holder.cityAndDate.setText(current.getCityAndDate());
        holder.aqiValue.setText(current.getAqiValue());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
