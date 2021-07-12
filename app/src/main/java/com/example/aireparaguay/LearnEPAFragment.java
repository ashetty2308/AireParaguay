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


        ListView listView;
        RecyclerView recyclerView;


        ArrayAdapter<String> arrayAdapter2;

        ArrayList<String> epScaleArrList = new ArrayList<>();
        epScaleArrList.add("Good (0-50)");
        epScaleArrList.add("Moderate (51-100)");
        epScaleArrList.add("Unhealthy for Sensitive Groups (101-150)");
        epScaleArrList.add("Unhealthy (151-200)");
        epScaleArrList.add("Very Unhealthy (201-300)");
        epScaleArrList.add("Dangerous (301-500)");

        recyclerView = getActivity().findViewById(R.id.rvEPAScale);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        CustomAdapter customAdapter = new CustomAdapter(getActivity(),epScaleArrList);


        recyclerView.setAdapter(customAdapter);




        //arrayAdapter2 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, epScaleArrList);



       /* ListView listView = getActivity().findViewById(R.id.epaScaleLV);

        ArrayList<String> epaScaleListValues = new ArrayList<>();

        epaScaleListValues.add("Good (0-50)");
        epaScaleListValues.add("Moderate (51-100)");
        epaScaleListValues.add("Unhealthy for Sensitive Groups (101-150)");
        epaScaleListValues.add("Unhealthy (151-200)");
        epaScaleListValues.add("Very Unhealthy (201-300)");
        epaScaleListValues.add("Dangerous (301-500)");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getActivity(),android.R.layout.simple_list_item_1,epaScaleListValues);

        listView.setAdapter(arrayAdapter);

        Log.d("Count",String.valueOf(listView.getChildCount()));*/

        super.onViewCreated(view, savedInstanceState);
    }

}
