package com.example.eyesontheprize;

public class Font {
    private int imageResourceId;

    public static final Font[] fonts = {
            new Font(R.drawable.font_one),
            new Font(R.drawable.font_two),
            new Font(R.drawable.font_three),
            new Font(R.drawable.font_four),
            new Font(R.drawable.font_five),
            new Font(R.drawable.font_six),
            new Font(R.drawable.font_seven),
            new Font(R.drawable.font_eight),
            new Font(R.drawable.font_nine),
            new Font(R.drawable.font_ten)
    };

    public Font(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
