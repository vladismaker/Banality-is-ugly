package com.example.eyesontheprize;

import android.os.Bundle;

import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.makeramen.roundedimageview.RoundedImageView;

public class CreateFragment extends Fragment {
    String clothingColor;
    RoundedImageView imageView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_create, container, false);
        clothingColor =  BackgroundMerchActivity.getClothingColor();
        imageView = view.findViewById(R.id.create_container);
        switch (clothingColor){
            case "white":
                //imageView.setBackgroundColor(getResources().getColor(R.color.white));
                imageView.setImageResource(R.color.white);
                break;
            case "bejeviy":
                //nestedScrollView.setBackgroundColor(getResources().getColor(R.color.bejeviy));
                imageView.setImageResource(R.color.bejeviy);
                break;
            case "light grey":
                //nestedScrollView.setBackgroundColor(getResources().getColor(R.color.light_gray));
                imageView.setImageResource(R.color.light_gray);
                break;
            case "grey":
                //nestedScrollView.setBackgroundColor(getResources().getColor(R.color.grey));
                imageView.setImageResource(R.color.grey);
                break;
            case "black":
                //nestedScrollView.setBackgroundColor(getResources().getColor(R.color.black));
                imageView.setImageResource(R.color.black);
                break;
            case "green":
                //nestedScrollView.setBackgroundColor(getResources().getColor(R.color.green));
                imageView.setImageResource(R.color.green);
                break;
            case "yellow":
                //nestedScrollView.setBackgroundColor(getResources().getColor(R.color.yellow));
                imageView.setImageResource(R.color.yellow);
                break;
            case "orange":
                //nestedScrollView.setBackgroundColor(getResources().getColor(R.color.orange));
                imageView.setImageResource(R.color.orange);
                break;
            case "red":
                //nestedScrollView.setBackgroundColor(getResources().getColor(R.color.red));
                imageView.setImageResource(R.color.red);
                break;
            case "blue":
                //nestedScrollView.setBackgroundColor(getResources().getColor(R.color.blue));
                imageView.setImageResource(R.color.blue);
                break;
        }
        return view;
    }
}