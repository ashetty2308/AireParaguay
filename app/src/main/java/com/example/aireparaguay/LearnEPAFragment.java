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

public class LearnEPAFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        return inflater.inflate(R.layout.learn_epa_fragment, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        RecyclerView recyclerView;
        ArrayList<String> epScaleArrList = new ArrayList<>();
        epScaleArrList.add("Good (0-50)");
        epScaleArrList.add("Moderate (51-100)");
        epScaleArrList.add("Unhealthy for Sensitive Groups (101-150)");
        epScaleArrList.add("Unhealthy (151-200)");
        epScaleArrList.add("Very Unhealthy (201-300)");
        epScaleArrList.add("Hazardous (301-500)");

        recyclerView = getActivity().findViewById(R.id.rvEPAScale);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        CustomAdapter customAdapter = new CustomAdapter(getActivity(),epScaleArrList);

        recyclerView.setAdapter(customAdapter);

        super.onViewCreated(view, savedInstanceState);
    }


}
