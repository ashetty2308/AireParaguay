package com.example.AireParaguay;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

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
