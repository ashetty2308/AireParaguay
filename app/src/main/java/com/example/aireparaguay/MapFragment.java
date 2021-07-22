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

        return view;
    }
    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {


        //new GetApiDataForMap().execute();


        Log.d("Regions", String.valueOf(longList));

        map = googleMap;
        float zlevel = 11f;

        LatLng Bo_Villa_Morra = new LatLng(-25.287982,  -57.58586);
        map.addMarker(new MarkerOptions().position(Bo_Villa_Morra).title("Bo. Villa Morra (Asu)"));
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(Bo_Villa_Morra, zlevel));

        LatLng Bo_Las_Mercedes = new LatLng(-25.291721,  -57.612337);
        map.addMarker(new MarkerOptions().position(Bo_Las_Mercedes).title("Bo. Las Mercedes (Asu)"));
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(Bo_Las_Mercedes, zlevel));

        LatLng Mercado_4 = new LatLng(-25.301672,   -57.628171);
        map.addMarker(new MarkerOptions().position(Mercado_4).title("Mercado 4 (Asu)"));
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(Mercado_4, zlevel));


        LatLng Bo_Obrero = new LatLng(-25.296891,  -57.646008);
        map.addMarker(new MarkerOptions().position(Bo_Obrero).title("Bo. Obrero (Asu)"));
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(Bo_Obrero, zlevel));


        LatLng Bo_Bella_Vista = new LatLng(-25.268886,  -57.591041);
        map.addMarker(new MarkerOptions().position(Bo_Bella_Vista).title("Bo. Bella Vista (Asu)"));
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(Bo_Bella_Vista, zlevel));


        LatLng Bo_Itá_Enramada = new LatLng(-25.348588,  -57.644467);
        map.addMarker(new MarkerOptions().position(Bo_Itá_Enramada).title("Bo. Itá Enramada (Asu)"));
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(Bo_Itá_Enramada, zlevel));


        LatLng Bo_Herrera = new LatLng(-25.295225,  -57.554957);
        map.addMarker(new MarkerOptions().position(Bo_Herrera).title("Bo. Herrera (Asu)"));
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(Bo_Herrera, zlevel));

        LatLng Zeballos_Cué = new LatLng(-25.230944,  -57.572913);
        map.addMarker(new MarkerOptions().position(Zeballos_Cué).title("Zeballos Cué (Asu)"));
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(Zeballos_Cué, zlevel));

        LatLng Bo_Policial = new LatLng(-25.2859963,  -57.5321415);
        map.addMarker(new MarkerOptions().position(Bo_Policial).title("Bo. Policial (Luque)"));
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(Bo_Policial, zlevel));

        LatLng Cuarto_Barrio = new LatLng( -25.271927,  -57.507497);
        map.addMarker(new MarkerOptions().position(Cuarto_Barrio).title("Cuarto Barrio (Luque)"));
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(Cuarto_Barrio, zlevel));

        LatLng Centro = new LatLng(-25.325833,  -57.54748);
        map.addMarker(new MarkerOptions().position(Centro).title("Centro (Fdo. de la Mora)"));
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(Centro, zlevel));

        LatLng Tres_Bocas = new LatLng(-25.355429,  -57.568617);
        map.addMarker(new MarkerOptions().position(Tres_Bocas).title("Tres Bocas (Fdo. de la Mora)"));
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(Tres_Bocas, zlevel));



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
            super.onPostExecute(aVoid);
        }
    }
}
