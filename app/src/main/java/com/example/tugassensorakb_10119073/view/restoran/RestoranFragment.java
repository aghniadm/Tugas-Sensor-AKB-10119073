package com.example.tugassensorakb_10119073.view.restoran;
/*
    NIM  : 10119073
    Nama : Aghnia Dewi Mahiranie
    Kelas: IF-2
 */
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tugassensorakb_10119073.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class RestoranFragment extends Fragment implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_restoran, container, false);
        SupportMapFragment mMapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.restoran);
        mMapFragment.getMapAsync(this);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        mMap = googleMap;

        LatLng delapanpadi = new LatLng(-6.898080732805518, 107.61413368447374);
        LatLng eatboss = new LatLng(-6.8973546398693575, 107.61317937991357);
        LatLng coffeelab = new LatLng(-6.896859894012549, 107.61477747370385);
        LatLng cheesecuit = new LatLng(-6.896830582643167, 107.61276289297982);
        LatLng mietasik = new LatLng(-6.896907945092511, 107.61413598744105);

        mMap.addMarker(new MarkerOptions().position(delapanpadi).title("Delapan Padi"));
        mMap.addMarker(new MarkerOptions().position(eatboss).title("Eatboss"));
        mMap.addMarker(new MarkerOptions().position(coffeelab).title("911 Coffeelab"));
        mMap.addMarker(new MarkerOptions().position(cheesecuit).title("Cheesecuit"));
        mMap.addMarker(new MarkerOptions().position(mietasik).title("Mie Tasik"));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(delapanpadi, 15));
    }
}