package com.example.eyesontheprize;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.FileObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
public class UseFragment extends Fragment {
    //String clothingColor;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_use, container, false);
        //clothingColor =  BackgroundMerchActivity.getClothingColor();

        String[] libBackNames = new String[LibraryBackground.back.length];
        for (int i = 0; i < libBackNames.length; i++){
            libBackNames[i] = LibraryBackground.back[i].getName();
        }
        int[] libBackImages = new int[LibraryBackground.back.length];
        for(int i = 0; i < libBackImages.length; i++){
            libBackImages[i] = LibraryBackground.back[i].getImageResourceId();
        }

        RecyclerView libBackRecycler = (RecyclerView) view.findViewById(R.id.library_background_recycler);
        LibraryBackgroundAdapter adapter = new LibraryBackgroundAdapter(libBackNames, libBackImages);
//        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
//        layoutManager.setGapStrategy(StaggeredGridLayoutManager.GAP_HANDLING_NONE);
        libBackRecycler.setNestedScrollingEnabled(false);
        libBackRecycler.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        libBackRecycler.setAdapter(adapter);

        adapter.setListener(new LibraryBackgroundAdapter.Listener() {
            @Override
            public void onClick(int position) {
                Intent intent = new Intent(getActivity(), FontAndWordsActivity.class);
                intent.putExtra(FontAndWordsActivity.EXTRA_BACKGROUND_ID, position);
                getActivity().startActivity(intent);
            }
        });

        return view;
    }
}