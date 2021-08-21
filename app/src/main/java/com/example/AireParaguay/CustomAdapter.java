package com.example.AireParaguay;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<MyViewHolder> {

    Context c;
    ArrayList<String> epaData;
    AdapterView.OnItemClickListener mListener;

    public CustomAdapter(Context c, ArrayList<String> epaData){
        this.c=c;
        this.epaData=epaData;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(c).inflate(R.layout.list_item, null);

        return new MyViewHolder(view);
    }



    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(position==0){
                    Intent intent = new Intent(c,GoodClass.class);
                    c.startActivity(intent);
                }
                if(position==1){
                    Intent intent = new Intent(c,ModerateClass.class);
                    c.startActivity(intent);
                }
                if(position==2){
                    Intent intent = new Intent(c,UnhSensClass.class);
                    c.startActivity(intent);
                }
                if(position==3){
                    Intent intent = new Intent(c,UnhClass.class);
                    c.startActivity(intent);
                }
                if(position==4){
                    Intent intent = new Intent(c,VUnhClass.class);
                    c.startActivity(intent);
                }
                if(position==5){
                    Intent intent = new Intent(c,DangerousClass.class);
                    c.startActivity(intent);
                }
            }
        });

        holder.epaScaleLabel.setText(epaData.get(position));

    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position, @NonNull List<Object> payloads) {

        if(position==0){
            holder.itemView.setBackgroundColor(Color.rgb(0,228,0));

         //   Intent x = new Intent(this, GoodClass.class);
           // c.startActivity(x);
        }
        if(position==1){
            holder.itemView.setBackgroundColor(Color.rgb(255,255,0));
        }
        if(position==2){
            holder.itemView.setBackgroundColor(Color.rgb(255,126,0));
        }
        if(position==3){
            holder.itemView.setBackgroundColor(Color.rgb(255,0,0));
        }
        if(position==4){
            holder.itemView.setBackgroundColor(Color.rgb(143,63,151));
        }
        if(position==5){
            holder.itemView.setBackgroundColor(Color.rgb(126,0,35));
        }



        super.onBindViewHolder(holder, position, payloads);
    }



    @Override
    public int getItemCount() {
        return epaData.size();
    }

}
