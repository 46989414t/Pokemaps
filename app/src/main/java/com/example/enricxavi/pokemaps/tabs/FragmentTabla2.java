package com.example.enricxavi.pokemaps.tabs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.enricxavi.pokemaps.R;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Created by enric on 26/7/16.
 */
public class FragmentTabla2 extends Fragment implements GoogleMap.OnMapClickListener{
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_tabla2, container, false);

        GPSTracker gps = new GPSTracker(getActivity());

        double latitude = gps.getLatitude();
        double longitude = gps.getLongitude();

        System.out.println("RESULTADOS LAT "+latitude+" LONG "+longitude);

        actualizarMapa(latitude, longitude);

        /*latitud.setText(strLatitud);
        longitud.setText(strLongitud);

        String idEmail = email.replace(".", "%");
        Localizacion loc = new Localizacion(email,latitude, longitude);
        subirCoordenadas(idEmail, loc, pathGeneral);*/

        return rootView;
    }

    private void actualizarMapa(double latitude, double longitude) {
        LatLng position = new LatLng(latitude, longitude);
        // Instantiating MarkerOptions class
        MarkerOptions options = new MarkerOptions();

        // Setting position for the MarkerOptions
        options.position(position);

        // Setting title for the MarkerOptions
        options.title("YO MISMO");

        // Setting snippet for the MarkerOptions
        options.snippet("Latitude:"+latitude+",Longitude:"+longitude);

        // Getting Reference to SupportMapFragment of activity_map.xml
        GoogleMap fm = ((SupportMapFragment) getChildFragmentManager()
                .findFragmentById(R.id.map)).getMap();

        fm.setMapType(GoogleMap.MAP_TYPE_HYBRID);
        // Getting reference to google map
        //GoogleMap googleMap = fm.getMap();

        // Adding Marker on the Google Map
        fm.addMarker(options);

        // Creating CameraUpdate object for position
        CameraUpdate updatePosition = CameraUpdateFactory.newLatLngZoom(position, 17);;
        fm.animateCamera(updatePosition);

    }

    @Override
    public void onMapClick(LatLng latLng) {

    }
}
