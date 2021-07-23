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
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

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

public class MapFragment extends Fragment implements OnMapReadyCallback {

    GoogleMap map;
    ArrayList<String> regionList;
    ArrayList<Double> latList;
    ArrayList<Double> longList;

    @Nullable
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.map_fragment, null, false);
        SupportMapFragment mapFragment = (SupportMapFragment) this.getChildFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        new GetApiDataForMap().execute();

        return view;
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        map = googleMap;
    }
    public class GetApiDataForMap extends AsyncTask<Void, Void, Void> {

        JSONArray apiData = new JSONArray();

        @Override
        protected Void doInBackground(Void... voids) {

            regionList = new ArrayList<>();
            latList = new ArrayList<>();
            longList = new ArrayList<>();

            try {
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


            for (int i = 0; i < apiData.length(); i++) {
                try {
                    regionList.add(apiData.getJSONObject(i).getString("region"));
                    latList.add(apiData.getJSONObject(i).getJSONObject("ubicacion").getDouble("lat"));
                    longList.add(apiData.getJSONObject(i).getJSONObject("ubicacion").getDouble("lng"));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            LatLng latLng;
            for(int i = 0; i < regionList.size(); i++){
                latLng = new LatLng(latList.get(i), longList.get(i));
                map.addMarker(new MarkerOptions().position(latLng).title(regionList.get(i)));
                map.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng,11f));
            }
        }
    }
}
