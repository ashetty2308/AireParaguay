package com.example.AireParaguay;

import android.graphics.Color;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.card.MaterialCardView;

import java.util.ArrayList;
import java.util.Locale;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {

    private ArrayList<ItemClass> dataList;


    public static class ItemViewHolder extends RecyclerView.ViewHolder{

        public MaterialCardView materialCardView;

        public ImageView imageView;
        public TextView cityAndDate;
        public TextView aqiValue;
        public TextView dateTime;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.emojiForAdapter);
            cityAndDate = itemView.findViewById(R.id.epaValueTV);
            aqiValue = itemView.findViewById(R.id.epaConcernTV);
            materialCardView = itemView.findViewById(R.id.materialcardview);
            dateTime = itemView.findViewById(R.id.timeTVSensorItem);
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

    @RequiresApi(api = Build.VERSION_CODES.P)
    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        ItemClass current = dataList.get(position);

        if ((Integer.valueOf(current.getAqiValue()) >= 0) && (Integer.valueOf(current.getAqiValue()) <= 50)) {
            holder.materialCardView.setStrokeWidth(5);
            holder.materialCardView.setStrokeColor(Color.GREEN);
            holder.imageView.setBackgroundColor(Color.GREEN);
        }
        if ((Integer.valueOf(current.getAqiValue()) >= 51) && (Integer.valueOf(current.getAqiValue()) <= 100)) {
            holder.materialCardView.setStrokeWidth(5);
            holder.materialCardView.setStrokeColor(Color.rgb(255, 255, 0));
            holder.imageView.setBackgroundColor(Color.rgb(255, 255, 0));
        }
        if ((Integer.valueOf(current.getAqiValue()) >= 101) && (Integer.valueOf(current.getAqiValue()) <= 150)) {
            holder.materialCardView.setStrokeWidth(5);
            holder.materialCardView.setStrokeColor(Color.rgb(255, 126, 0));
            holder.imageView.setBackgroundColor(Color.rgb(255, 126, 0));
        }
        if ((Integer.valueOf(current.getAqiValue()) >= 151) && (Integer.valueOf(current.getAqiValue()) <= 200)) {
            holder.materialCardView.setStrokeWidth(5);
            holder.materialCardView.setStrokeColor(Color.rgb(255, 0, 0));
            holder.imageView.setBackgroundColor(Color.rgb(255, 0, 0));
        }
        if ((Integer.valueOf(current.getAqiValue()) >= 201) && (Integer.valueOf(current.getAqiValue()) <= 300)) {
            holder.materialCardView.setStrokeWidth(5);
            holder.materialCardView.setStrokeColor(Color.rgb(143, 63, 151));
            holder.imageView.setBackgroundColor(Color.rgb(143, 63, 151));
        }
        if ((Integer.valueOf(current.getAqiValue()) >= 301) && (Integer.valueOf(current.getAqiValue()) <= 500)) {
            holder.materialCardView.setStrokeWidth(5);
            holder.materialCardView.setStrokeColor(Color.rgb(126, 0, 35));
            holder.imageView.setBackgroundColor(Color.rgb(126, 0, 35));
        }

        holder.imageView.setImageResource(current.getImageView());
        holder.cityAndDate.setText(current.getCityAndDate());
        holder.aqiValue.setText("AQI: " + current.getAqiValue());
        String userLocale = Locale.getDefault().getLanguage();

        if(userLocale.equalsIgnoreCase("en")) {
            holder.dateTime.setText("Time: " + current.getDateTime());
        }
        else{
            holder.dateTime.setText("Tiempo: "+ current.getDateTime());
        }


        if(userLocale.equalsIgnoreCase("en")) {
            if ((Integer.valueOf(current.getAqiValue()) >= 0) && (Integer.valueOf(current.getAqiValue()) <= 50)) {
                holder.aqiValue.setText("AQI: " + current.getAqiValue() + " - Good");
            }
            if ((Integer.valueOf(current.getAqiValue()) >= 51) && (Integer.valueOf(current.getAqiValue()) <= 100)) {
                holder.aqiValue.setText("AQI: " + current.getAqiValue() + " - Moderate");
            }
            if ((Integer.valueOf(current.getAqiValue()) >= 101) && (Integer.valueOf(current.getAqiValue()) <= 150)) {
                holder.aqiValue.setText("AQI: " + current.getAqiValue() + " - Unhealthy for Sensitive Groups");
            }
            if ((Integer.valueOf(current.getAqiValue()) >= 151) && (Integer.valueOf(current.getAqiValue()) <= 200)) {
                holder.aqiValue.setText("AQI: " + current.getAqiValue() + " - Unhealthy");
            }
            if ((Integer.valueOf(current.getAqiValue()) >= 201) && (Integer.valueOf(current.getAqiValue()) <= 300)) {
                holder.aqiValue.setText("AQI: " + current.getAqiValue() + " - Very Unhealthy");
            }
            if ((Integer.valueOf(current.getAqiValue()) >= 301) && (Integer.valueOf(current.getAqiValue()) <= 500)) {
                holder.aqiValue.setText("AQI: " + current.getAqiValue() + " - Hazardous");
            }
        }else{
            if ((Integer.valueOf(current.getAqiValue()) >= 0) && (Integer.valueOf(current.getAqiValue()) <= 50)) {
                holder.aqiValue.setText("AQI: " + current.getAqiValue() + " - Bueno");
            }
            if ((Integer.valueOf(current.getAqiValue()) >= 51) && (Integer.valueOf(current.getAqiValue()) <= 100)) {
                holder.aqiValue.setText("AQI: " + current.getAqiValue() + " - Moderado");
            }
            if ((Integer.valueOf(current.getAqiValue()) >= 101) && (Integer.valueOf(current.getAqiValue()) <= 150)) {
                holder.aqiValue.setText("AQI: " + current.getAqiValue() + " - Insalubre p/ grupos sensibles");
            }
            if ((Integer.valueOf(current.getAqiValue()) >= 151) && (Integer.valueOf(current.getAqiValue()) <= 200)) {
                holder.aqiValue.setText("AQI: " + current.getAqiValue() + " - Insalubre");
            }
            if ((Integer.valueOf(current.getAqiValue()) >= 201) && (Integer.valueOf(current.getAqiValue()) <= 300)) {
                holder.aqiValue.setText("AQI: " + current.getAqiValue() + " - Muy insalubre");
            }
            if ((Integer.valueOf(current.getAqiValue()) >= 301) && (Integer.valueOf(current.getAqiValue()) <= 500)) {
                holder.aqiValue.setText("AQI: " + current.getAqiValue() + " - Peligroso");
            }
        }

    }
    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
