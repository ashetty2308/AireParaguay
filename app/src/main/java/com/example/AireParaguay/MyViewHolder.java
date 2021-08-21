package com.example.AireParaguay;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView epaScaleLabel;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        epaScaleLabel = itemView.findViewById(R.id.nameEPALabel);
    }

}
