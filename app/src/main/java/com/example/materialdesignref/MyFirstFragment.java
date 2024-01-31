package com.example.materialdesignref;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.Navigator;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

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
        view.findViewById(R.id.text).setOnClickListener(v -> {
                    Navigation.findNavController(view).navigate(R.id.action_myFirstFragment_to_mySecondFragment);
                });
        return view;
    }
}