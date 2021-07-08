package com.example.aireparaguay;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

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

public class DataFragment extends Fragment {
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
        @Override
        protected Void doInBackground(Void... voids) {

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

            Log.d("Api length", String.valueOf(apiData.length()));

            ArrayList<String> regionNameList = new ArrayList<>();
            ArrayList<String> sensorCodeList = new ArrayList<>();


            ArrayList<Integer> aqiValue = new ArrayList<>();
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
    }
}
