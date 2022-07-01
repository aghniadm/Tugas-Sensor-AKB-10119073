package com.example.tugassensorakb_10119073.view.about;
/*
    NIM  : 10119073
    Nama : Aghnia Dewi Mahiranie
    Kelas: IF-2
 */
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tugassensorakb_10119073.R;

import java.util.ArrayList;
import java.util.List;

public class AboutFragment extends Fragment {

    ViewPager2 viewPager2;
    List<AboutItemModel> aboutList;

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_about, container, false);

        viewPager2 = view.findViewById(R.id.viewpager);
        aboutList = new ArrayList<>();

        String[] judul = {"About:", "Dibuat Oleh:"};
        String[] desc = {"Apps ini dibuat untuk memenuhi Tugas Aplikasi Memanfaatkan Sensor Android", "Aghnia Dewi Mahiranie - 10119073"};

        for (int i=0; i < judul.length; i++){
            AboutItemModel item = new AboutItemModel(judul[i], desc[i]);
            aboutList.add(item);
        }

        ViewPagerAboutAdapter adapter = new ViewPagerAboutAdapter(aboutList);
        viewPager2.setAdapter(adapter);
        viewPager2.setClipToPadding(false);
        viewPager2.setClipChildren(false);
        viewPager2.setOffscreenPageLimit(2);
        viewPager2.getChildAt(0).setOverScrollMode(View.OVER_SCROLL_NEVER);

        return view;
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
//        binding = null;
    }
}