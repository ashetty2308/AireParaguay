package com.example.aireparaguay;

import android.content.ClipData;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

public class DataFragment extends Fragment {

    ListView dataLV;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.data_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        new GetApiData().execute();
    }

    public class GetApiData extends AsyncTask<Void, Void, Void>{

        JSONArray apiData = new JSONArray();
        ArrayList<String> regionNameList;
        ArrayList<Integer> aqiValue;
        ArrayList<ItemClass> list;

        @Override
        protected Void doInBackground(Void... voids) {

            list = new ArrayList<>();

            recyclerView = getActivity().findViewById(R.id.recyclerView);
            recyclerView.setHasFixedSize(true);
            layoutManager = new LinearLayoutManager(getActivity());
            adapter = new ItemAdapter(list);
            recyclerView.setLayoutManager(layoutManager);
            recyclerView.setAdapter(adapter);



            try{
                URL url = new URL("https://aireparaguay.org/nodos_app");
                URLConnection urlConnection = url.openConnection();
                InputStream inputStream = urlConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                String data = bufferedReader.readLine();
                apiData = new JSONArray(data);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (JSONException e) {
                e.printStackTrace();
            }


             regionNameList = new ArrayList<>();
            ArrayList<String> sensorCodeList = new ArrayList<>();


            aqiValue = new ArrayList<>();
            ArrayList<String> dateList = new ArrayList<>();
            ArrayList<String> colorList = new ArrayList<>();
            ArrayList<String> textList = new ArrayList<>();

            ArrayList<Double> latCoorList = new ArrayList<>();
            ArrayList<Double> lngCoorList = new ArrayList<>();

            for(int i = 0; i < apiData.length(); i++){
                try {
                    regionNameList.add(apiData.getJSONObject(i).getString("region"));
                    sensorCodeList.add(apiData.getJSONObject(i).getString("codigo"));
                    aqiValue.add(apiData.getJSONObject(i).getJSONObject("aqi_now").getInt("value"));
                    dateList.add(apiData.getJSONObject(i).getJSONObject("aqi_now").getString("date"));
                    colorList.add(apiData.getJSONObject(i).getJSONObject("aqi_now").getString("color"));
                    textList.add(apiData.getJSONObject(i).getJSONObject("aqi_now").getString("text"));
                    latCoorList.add(apiData.getJSONObject(i).getJSONObject("ubicacion").getDouble("lat"));
                    lngCoorList.add(apiData.getJSONObject(i).getJSONObject("ubicacion").getDouble("lng"));

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {


            for(int i = 0; i < regionNameList.size(); i++){
                Log.d("aqiValue", String.valueOf(aqiValue.get(i)));
                int aqi = aqiValue.get(i);
                String city = regionNameList.get(i);

                if(aqi >= 0 && aqi <= 50){
                    list.add(new ItemClass(R.drawable.sunglassemoji, regionNameList.get(i), String.valueOf(aqi)));
                }
                if(aqi >= 51 && aqi <= 100){
                    list.add(new ItemClass(R.drawable.str8face, city, String.valueOf(aqi)));
                }
                if(aqi >= 101 && aqi <= 150){
                    list.add(new ItemClass(R.drawable.sneezingemoji, city, String.valueOf(aqi)));
                }
                if(aqi >= 151 && aqi <= 200){
                    list.add(new ItemClass(R.drawable.maskemoji, city, String.valueOf(aqi)));
                }
                if(aqi >= 201 && aqi <= 300){
                    list.add(new ItemClass(R.drawable.maskemoji, city, String.valueOf(aqi)));
                }
                if(aqi >= 301 && aqi <= 500){
                    list.add(new ItemClass(R.drawable.dangerousemoji, city, String.valueOf(aqi)));
                }

                recyclerView = getActivity().findViewById(R.id.recyclerView);
                recyclerView.setHasFixedSize(true);
                layoutManager = new LinearLayoutManager(getActivity());
                adapter = new ItemAdapter(list);
                recyclerView.setLayoutManager(layoutManager);
                recyclerView.setAdapter(adapter);
            }


            super.onPostExecute(aVoid);
        }
    }

}

