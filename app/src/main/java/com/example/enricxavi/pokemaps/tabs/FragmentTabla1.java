package com.example.enricxavi.pokemaps.tabs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.enricxavi.pokemaps.R;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;

/**
 * Created by enric on 26/7/16.
 */
public class FragmentTabla1 extends Fragment implements GoogleMap.OnMapClickListener{
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_tabla1, container, false);
        return rootView;
    }

    @Override
    public void onMapClick(LatLng latLng) {

    }
}
