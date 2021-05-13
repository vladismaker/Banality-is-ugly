package com.example.eyesontheprize;

public class Clothes {
    private String name;
    private int imageResourceId;

    public static final Clothes[] clothes = {
            new Clothes("Hoodie", R.drawable.hoodie_model),
            new Clothes("T-Shirt", R.drawable.tshirt_model),
            new Clothes("Sweatshirt", R.drawable.sweatshirt_model2)
    };

    public Clothes(String name, int imageResourceId) {
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
