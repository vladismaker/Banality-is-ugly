package com.example.eyesontheprize;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class SweatshirtFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savesInstanceState){
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.sweatshirt_fragment, container, false);
        return root;
    }
}
