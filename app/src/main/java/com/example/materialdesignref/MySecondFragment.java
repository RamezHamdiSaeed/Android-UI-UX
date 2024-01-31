package com.example.materialdesignref;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class MySecondFragment extends Fragment {


    public MySecondFragment() {
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_my_second, container, false);
        view.findViewById(R.id.text).setOnClickListener(v -> {
            Navigation.findNavController(view).navigate(R.id.action_mySecondFragment_to_myFirstFragment);
        });
        return view;

    }
}