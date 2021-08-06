package com.example.aireparaguay;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class AboutMeFragment extends Fragment {

    ImageView me;
    TextView aboutMe;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.about_me, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        me = (ImageView) getActivity().findViewById(R.id.meImageView);
        me.setImageResource(R.drawable.pfp);
        aboutMe = (TextView) getActivity().findViewById(R.id.aboutmeTV);

        aboutMe.setMovementMethod(new ScrollingMovementMethod());

        super.onViewCreated(view, savedInstanceState);
    }
}
