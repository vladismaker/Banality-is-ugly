package com.example.eyesontheprize;

public class LibraryBackground {
    private String name;
    private int imageResourceId;

    public static final LibraryBackground[] back = {
            new LibraryBackground("No Background", R.drawable.back),
            new LibraryBackground("Background One", R.drawable.back_one_cut),
            new LibraryBackground("Background Two", R.drawable.back_two_cut),
            new LibraryBackground("Background Three", R.drawable.back_three_cut),
            new LibraryBackground("Background Four", R.drawable.back_four_cut),
            new LibraryBackground("Background Five", R.drawable.back_five_cut),
            new LibraryBackground("Background Six", R.drawable.back_six_cut),
            new LibraryBackground("Background Seven", R.drawable.back_seven_cut)
    };

    public LibraryBackground(String name, int imageResourceId){
        this.name = name;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
