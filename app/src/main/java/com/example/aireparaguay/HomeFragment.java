package com.example.aireparaguay;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import org.w3c.dom.Text;

import java.util.List;
import java.util.Objects;

public class HomeFragment extends Fragment {

    TextView appDescription;
    TextView airQualityAndHealth;
    TextView airPollution;
    TextView twitter;
    TextView aireParaguayTwitter;

    @SuppressLint("SetTextI18n")
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.home_fragment, container, false);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {



        appDescription = (TextView) getActivity().findViewById(R.id.tvDescription);
        airQualityAndHealth = (TextView) getActivity().findViewById(R.id.aqHealth);
        airPollution = (TextView) getActivity().findViewById(R.id.pollution);
        twitter = (TextView) getActivity().findViewById(R.id.twitter);
        aireParaguayTwitter = (TextView) getActivity().findViewById(R.id.apTwitter);


        //add hyperlinks
        appDescription.setMovementMethod(new ScrollingMovementMethod());
        appDescription.setText("This app shows the results of a sensor system with laser technology, created for the measurement of air quality in the country. The sensors measure the density of particles suspended in the air, with a diameter less than or equal to 2.5 micrometers, a measure known as PM 2.5, or in Spanish, particulate matter 2.5. The measurement values \u200B\u200Bare processed in real time and according to the \"NowCast\" regulation, of the US Environmental Protection Agency, to calculate the so-called Air Quality Index (US-AQI) and obtain a reference standard measurement. .\n" +
                "\n" +
                "The sensors are installed in various points of Asunción and nearby cities, measuring PM 2.5 values \u200B\u200Bat all times (24/7). The data is transmitted to the Internet and stored in a database in the cloud, from where it is consulted to be displayed on this web page. Unlike taking samples and measurement in the laboratory, real-time measurement allows citizens to know the quality of the air in their environment, and thus, take the necessary precautions, avoid excessive exposure and adapt their daily activities.\n" +
                "\n" +
                "The purpose of developing this platform was primarily to raise awareness about the impact of air quality on health. According to studies by the World Health Organization, air quality is the cause of a large number of premature deaths in the world ( See Air Quality and Health ), among which are mainly cited deaths from heart disease (25%), brain (24%) and lung (43%) ( See Air Pollution ). In this way, we hope to contribute from civil society, with the availability of an open measurement platform, complying with the highest precision standards, which allows visualizing the air quality indices in the environment, and promoting citizen participation and awareness. with the environment.\n" +
                "\n" +
                "The results of the measurements are also published automatically and from time to time on social networks, and can be consulted using Twitter ( See Twitter ) , under the @aireparaguay ( See Aire Paraguay Twitter ) account . Through this account, information and articles related to Air Quality in Paraguay and in the world are published, as well as the results of research carried out by the project team.\n" +
                "\n" +
                "All sensors in operation have an international (Swiss) calibration certificate, the long-life factory warranty for this calibration, a European certification (MCERTS), and meet the highest manufacturing quality standards. The creators of the project are engineers trained abroad, and with a proven track record in creating industrial products in Europe and the United States.\n" +
                "\n" +
                "Do you have suggestions or feedback? Interested in potentially setting up a sensor in an area you know? Please fill out this form ( See Form ) ");


        airQualityAndHealth.setMovementMethod(LinkMovementMethod.getInstance());
        airPollution.setMovementMethod(LinkMovementMethod.getInstance());
        twitter.setMovementMethod(LinkMovementMethod.getInstance());
        aireParaguayTwitter.setMovementMethod(LinkMovementMethod.getInstance());

        super.onViewCreated(view, savedInstanceState);

    }
}
