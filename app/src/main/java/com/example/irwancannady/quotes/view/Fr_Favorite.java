package com.example.irwancannady.quotes.view;
// Created by Arif Ariyan (me@arifariyan.com) on 11/10/16.

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.irwancannady.quotes.R;

public class Fr_Favorite extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frfavorite_layout, container, false);

        return view;
    }
}
