package com.example.aireparaguay;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.text.method.ScrollingMovementMethod;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import org.w3c.dom.Text;

import java.util.List;
import java.util.Locale;
import java.util.Objects;

public class HomeFragment extends Fragment {

    TextView appDescription;
    TextView airQualityAndHealth;
    TextView airPollution;
    TextView twitter;
    TextView aireParaguayTwitter;
    TextView formTV;

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @SuppressLint("SetTextI18n")
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.home_fragment, container, false);
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @SuppressLint("SetTextI18n")
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        appDescription = (TextView) getActivity().findViewById(R.id.tvDescription);
        airQualityAndHealth = (TextView) getActivity().findViewById(R.id.aqHealth);
        airPollution = (TextView) getActivity().findViewById(R.id.pollution);
        twitter = (TextView) getActivity().findViewById(R.id.twitter);
        aireParaguayTwitter = (TextView) getActivity().findViewById(R.id.apTwitter);
        formTV = (TextView) getActivity().findViewById(R.id.form);


        //add hyperlinks
        appDescription.setMovementMethod(new ScrollingMovementMethod());

        airQualityAndHealth.setMovementMethod(LinkMovementMethod.getInstance());
        airPollution.setMovementMethod(LinkMovementMethod.getInstance());
        twitter.setMovementMethod(LinkMovementMethod.getInstance());
        aireParaguayTwitter.setMovementMethod(LinkMovementMethod.getInstance());
        formTV.setMovementMethod(LinkMovementMethod.getInstance());

        super.onViewCreated(view, savedInstanceState);
    }
}
