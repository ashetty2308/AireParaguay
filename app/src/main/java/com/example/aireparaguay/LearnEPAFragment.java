package com.example.aireparaguay;

import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Locale;

public class LearnEPAFragment extends Fragment {
    private RecyclerView recyclerViewEPA;
    private RecyclerView.Adapter adapterEPA;
    private RecyclerView.LayoutManager layoutManagerEPA;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.learn_epa_fragment, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        ArrayList<EPAitemClass> epScaleArrList = new ArrayList<>();
        Locale userLocale = getResources().getConfiguration().locale;

        if(userLocale.toString().equalsIgnoreCase("en_US")){
            epScaleArrList.add(new EPAitemClass(R.drawable.sunglassemoji, "Good (0-50)", "Concerns: Nobody!"));
            epScaleArrList.add(new EPAitemClass(R.drawable.str8face, "Moderate (51-100)", "Concerns: People who may be exceptionally sensitive to particulate contamination."));
            epScaleArrList.add(new EPAitemClass(R.drawable.sneezingemoji, "Unhealthy For Sensitive Groups (101-150)", "Concerns: Sensitive groups include people with heart or lung disease, older adults, children, and adolescents."));
            epScaleArrList.add(new EPAitemClass(R.drawable.maskemoji, "Unhealthy (151-200)", "Concerns: All."));
            epScaleArrList.add(new EPAitemClass(R.drawable.maskemoji, "Very Unhealthy (201-300)", "Concerns: All."));
            epScaleArrList.add(new EPAitemClass(R.drawable.dangerousemoji, "Hazardous (301-500)", "Concerns: All."));
        } else{
            epScaleArrList.add(new EPAitemClass(R.drawable.sunglassemoji, "Bueno (0-50)", "Preocupaciones: ¡Nadie!"));
            epScaleArrList.add(new EPAitemClass(R.drawable.str8face, "Moderado (51-100)", "Preocupaciones: Personas que podrían ser excepcionalmente sensibles a la contaminación por partículas."));
            epScaleArrList.add(new EPAitemClass(R.drawable.sneezingemoji, "Insalubre p/ grupos sensibles (101-150)", "Preocupaciones: Los grupos sensibles comprenden a personas con cardiopatías o enfermedades pulmonares, adultos mayores, niños y adolescentes."));
            epScaleArrList.add(new EPAitemClass(R.drawable.maskemoji, "Insalubre (151-200)", "Preocupaciones: Todos."));
            epScaleArrList.add(new EPAitemClass(R.drawable.maskemoji, "Muy  Insalubre (201-300)", "Preocupaciones: Todos."));
            epScaleArrList.add(new EPAitemClass(R.drawable.dangerousemoji, "Peligroso (301-500)", "Preocupaciones: Todos."));
        }


        recyclerViewEPA = getActivity().findViewById(R.id.rvEPAScale);
        recyclerViewEPA.setHasFixedSize(true);
        layoutManagerEPA = new LinearLayoutManager(getActivity());
        adapterEPA = new EPAAdapter(epScaleArrList);

        recyclerViewEPA.setLayoutManager(layoutManagerEPA);
        recyclerViewEPA.setAdapter(adapterEPA);

        super.onViewCreated(view, savedInstanceState);
    }
}
