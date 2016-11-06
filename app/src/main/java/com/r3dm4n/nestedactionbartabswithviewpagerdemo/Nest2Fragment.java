package com.r3dm4n.nestedactionbartabswithviewpagerdemo;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class Nest2Fragment extends Fragment {

    public static Nest2Fragment newInstance(int position) {
        Nest2Fragment fragment = new Nest2Fragment();
        Bundle args = new Bundle();
        args.putInt("position", position);
        fragment.setArguments(args);

        return fragment;
    }

    public Nest2Fragment() {

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
        View view = inflater.inflate(R.layout.fragment_nest2, container, false);


        return view;
    }

}