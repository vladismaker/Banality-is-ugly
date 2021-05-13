package com.example.eyesontheprize;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.widget.FrameLayout;

import java.util.ArrayList;

public class ShowAllActivity extends AppCompatActivity {
    public static final String EXTRA_FONT_ID = "fontId";
    public static final String EXTRA_BACKGROUND_ID = "backgroundId";
    public static final String EXTRA_WORDS_ONE = "wordOne";
    public static final String EXTRA_WORDS_TWO = "wordTwo";
    public static ArrayList<String> EXTRA_FILL_GRID;
    int fontId, backgroundId, backgroundImage;
    String wordOne, wordTwo;
    ArrayList<String> fillGrid;
    FrameLayout frameLayoutMainPlace;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_all);
        init();

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Banality is ugly");
        //toolbar.setBackground(getDrawable(R.drawable.button_light_grey));
        setSupportActionBar(toolbar);

        //Получение данных из Intent
        fontId = (Integer) getIntent().getExtras().get(EXTRA_FONT_ID);
        backgroundId = (Integer) getIntent().getExtras().get(EXTRA_BACKGROUND_ID);
        wordOne = (String) getIntent().getExtras().get(EXTRA_WORDS_ONE);
        wordTwo = (String) getIntent().getExtras().get(EXTRA_WORDS_TWO);
        //fillGrid = (ArrayList<String>) getIntent().getExtras().get(String.valueOf(EXTRA_FILL_GRID));

        backgroundImage = LibraryBackground.back[backgroundId].getImageResourceId();
        frameLayoutMainPlace.setBackground(ContextCompat.getDrawable(this, backgroundImage));
    }

    public void init(){
        frameLayoutMainPlace = findViewById(R.id.frame_main_place);
    }
}