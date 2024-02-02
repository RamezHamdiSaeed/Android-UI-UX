package com.example.materialdesignref;

import android.os.Bundle;


import androidx.fragment.app.Fragment;

import androidx.navigation.Navigation;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class MyFirstFragment extends Fragment {

    public MyFirstFragment() {
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_my_first, container, false);
        MyFirstFragmentDirections.ActionMyFirstFragmentToMySecondFragment action = MyFirstFragmentDirections.actionMyFirstFragmentToMySecondFragment();
        action.setNumber("2");
        view.findViewById(R.id.text).setOnClickListener(v -> {
                    Navigation.findNavController(view).navigate(action);
                });
        return view;
    }
}