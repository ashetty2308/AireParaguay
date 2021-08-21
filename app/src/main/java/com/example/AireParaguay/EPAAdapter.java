package com.example.AireParaguay;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.card.MaterialCardView;

import java.util.ArrayList;

public class EPAAdapter extends RecyclerView.Adapter<EPAAdapter.EPAViewHolder> {
    private ArrayList<EPAitemClass> epaScaleList;

    @NonNull
    @Override
    public EPAViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.scale_item, parent, false);
        EPAViewHolder epaViewHolder = new EPAViewHolder(v);
        return epaViewHolder;
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull EPAViewHolder holder, int position) {
        EPAitemClass item = epaScaleList.get(position);
        holder.epaIV.setImageResource(item.getImageViewEPA());

        holder.epaTVLabel.setText(""+item.getEpaLabel());
        holder.epaTVConcern.setText(""+item.getEpaConcern());


        if(position==0){
            holder.materialCardView.setStrokeWidth(5);
            holder.materialCardView.setStrokeColor(Color.GREEN);
            holder.epaIV.setBackgroundColor(Color.GREEN);
        }
        if(position==1){
            holder.materialCardView.setStrokeWidth(5);
            holder.materialCardView.setStrokeColor(Color.rgb(255,255,0));
            holder.epaIV.setBackgroundColor(Color.rgb(255,255,0));
        }
        if(position==2){
            holder.materialCardView.setStrokeWidth(5);
            holder.materialCardView.setStrokeColor(Color.rgb(255,126,0));
            holder.epaIV.setBackgroundColor(Color.rgb(255,126,0));
        }

        if(position==3){
            holder.materialCardView.setStrokeWidth(5);
            holder.materialCardView.setStrokeColor(Color.rgb(255,0,0));
            holder.epaIV.setBackgroundColor(Color.rgb(255,0,0));
        }

        if(position==4){
            holder.materialCardView.setStrokeWidth(5);
            holder.materialCardView.setStrokeColor(Color.rgb(143,63,151));
            holder.epaIV.setBackgroundColor(Color.rgb(143,63,151));
        }
        if(position==5){
            holder.materialCardView.setStrokeWidth(5);
            holder.materialCardView.setStrokeColor(Color.rgb(126,0,35));
            holder.epaIV.setBackgroundColor(Color.rgb(126,0,35));

        }
    }

    @Override
    public int getItemCount() {
        return epaScaleList.size();
    }

    public static class EPAViewHolder extends RecyclerView.ViewHolder{

        public ImageView epaIV;
        public TextView epaTVLabel;
        public TextView epaTVConcern;
        public MaterialCardView materialCardView;


        public EPAViewHolder(@NonNull View itemView) {
            super(itemView);
            epaIV = itemView.findViewById(R.id.imageViewScaleEPA);
            epaTVLabel = itemView.findViewById(R.id.epaValueTV);
            epaTVConcern = itemView.findViewById(R.id.epaConcernTV);
            materialCardView = itemView.findViewById(R.id.materialcardview);

        }
    }

    public EPAAdapter(ArrayList<EPAitemClass> epaScaleListTwo){
        epaScaleList = epaScaleListTwo;
    }
}
