package com.r3dm4n.nestedactionbartabswithviewpagerdemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Nest1Fragment extends Fragment {

    public static Nest1Fragment newInstance(int position) {
        Nest1Fragment fragment = new Nest1Fragment();
        Bundle args = new Bundle();
        args.putInt("position", position);
        fragment.setArguments(args);

        return fragment;
    }

    public Nest1Fragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
           /* mPosition = getArguments().getInt("position");*/
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_nest1, container, false);


        return view;
    }

}