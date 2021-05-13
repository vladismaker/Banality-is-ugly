package com.example.eyesontheprize;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.makeramen.roundedimageview.RoundedImageView;

public class HoodieFragment extends Fragment {
    RoundedImageView mainImage;
    RoundedImageView imageView1;
    RoundedImageView imageView2;
    RoundedImageView imageView3;
    RoundedImageView imageView4;
    RoundedImageView imageView5;
    RoundedImageView imageView6;
    RoundedImageView imageView7;
    RoundedImageView imageView8;
    RoundedImageView imageView9;
    RoundedImageView imageView10;
    TextView title;
    TextView description;
    TextView compositionTitle;
    TextView compositionDescription;
    TextView washingInstructionTitle;
    TextView washingInstructionDescription;
    TextView madeIn;
    Button buttonNext;
    String clothingColor;

    View root;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savesInstanceState) {
        root =  inflater.inflate(R.layout.hoodie_fragment, container, false);

        init();
        clickListener();

        //Подефолту нажата бежевая кофта
        imageView2.setBorderColor(getResources().getColor(R.color.grey));
        imageView2.setBorderWidth(8f);
        clothingColor = "bejeviy";
        mainImage.setImageResource(R.drawable.hoodie_bejeviy);

        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), BackgroundMerchActivity.class);
                intent.putExtra("color", clothingColor);
                startActivity(intent);
            }
        });

        return root;
    }

    public void init() {
        mainImage = root.findViewById(R.id.main_image);
        imageView1 = root.findViewById(R.id.button_white);
        imageView2 =  root.findViewById(R.id.button_bejeviy);
        imageView3 = root.findViewById(R.id.button_light_grey);
        imageView4 = root.findViewById(R.id.button_grey);
        imageView5 = root.findViewById(R.id.button_black);
        imageView6 = root.findViewById(R.id.button_green);
        imageView7 = root.findViewById(R.id.button_yellow);
        imageView8 = root.findViewById(R.id.button_orange);
        imageView9 = root.findViewById(R.id.button_red);
        imageView10 = root.findViewById(R.id.button_blue);
        title = root.findViewById(R.id.title);
        description = root.findViewById(R.id.description);
        compositionTitle = root.findViewById(R.id.composition_title);
        compositionDescription = root.findViewById(R.id.composition_description);
        washingInstructionTitle = root.findViewById(R.id.washing_instruction_title);
        washingInstructionDescription = root.findViewById(R.id.washing_instruction_description);
        madeIn = root.findViewById(R.id.made_in);
        buttonNext = root.findViewById(R.id.buttonNext);

    }

    public void clickListener() {
        imageView1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Устанавливаю нажатие
                imageView1.setBorderColor(getResources().getColor(R.color.grey));
                imageView1.setBorderWidth(8f);
                mainImage.setImageResource(R.drawable.hoodie_white);
                clothingColor = "white";

                //Убираю нажатие с других
                imageView2.setBorderColor(getResources().getColor(R.color.white));
                imageView2.setBorderWidth(3f);

                imageView3.setBorderColor(getResources().getColor(R.color.white));
                imageView3.setBorderWidth(3f);

                imageView4.setBorderColor(getResources().getColor(R.color.white));
                imageView4.setBorderWidth(3f);

                imageView5.setBorderColor(getResources().getColor(R.color.white));
                imageView5.setBorderWidth(3f);

                imageView6.setBorderColor(getResources().getColor(R.color.white));
                imageView6.setBorderWidth(3f);

                imageView7.setBorderColor(getResources().getColor(R.color.white));
                imageView7.setBorderWidth(3f);

                imageView8.setBorderColor(getResources().getColor(R.color.white));
                imageView8.setBorderWidth(3f);

                imageView9.setBorderColor(getResources().getColor(R.color.white));
                imageView9.setBorderWidth(3f);

                imageView10.setBorderColor(getResources().getColor(R.color.white));
                imageView10.setBorderWidth(3f);
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Устанавливаю нажатие
                imageView2.setBorderColor(getResources().getColor(R.color.grey));
                imageView2.setBorderWidth(8f);
                mainImage.setImageResource(R.drawable.hoodie_bejeviy);
                clothingColor = "bejeviy";

                //Убираю нажатие с других
                imageView1.setBorderColor(getResources().getColor(R.color.white));
                imageView1.setBorderWidth(3f);

                imageView3.setBorderColor(getResources().getColor(R.color.white));
                imageView3.setBorderWidth(3f);

                imageView4.setBorderColor(getResources().getColor(R.color.white));
                imageView4.setBorderWidth(3f);

                imageView5.setBorderColor(getResources().getColor(R.color.white));
                imageView5.setBorderWidth(3f);

                imageView6.setBorderColor(getResources().getColor(R.color.white));
                imageView6.setBorderWidth(3f);

                imageView7.setBorderColor(getResources().getColor(R.color.white));
                imageView7.setBorderWidth(3f);

                imageView8.setBorderColor(getResources().getColor(R.color.white));
                imageView8.setBorderWidth(3f);

                imageView9.setBorderColor(getResources().getColor(R.color.white));
                imageView9.setBorderWidth(3f);

                imageView10.setBorderColor(getResources().getColor(R.color.white));
                imageView10.setBorderWidth(3f);
            }
        });

        imageView3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Устанавливаю нажатие
                imageView3.setBorderColor(getResources().getColor(R.color.grey));
                imageView3.setBorderWidth(8f);
                mainImage.setImageResource(R.drawable.hoodie_light_grey);
                clothingColor = "light grey";

                //Убираю нажатие с других
                imageView1.setBorderColor(getResources().getColor(R.color.white));
                imageView1.setBorderWidth(3f);

                imageView2.setBorderColor(getResources().getColor(R.color.white));
                imageView2.setBorderWidth(3f);

                imageView4.setBorderColor(getResources().getColor(R.color.white));
                imageView4.setBorderWidth(3f);

                imageView5.setBorderColor(getResources().getColor(R.color.white));
                imageView5.setBorderWidth(3f);

                imageView6.setBorderColor(getResources().getColor(R.color.white));
                imageView6.setBorderWidth(3f);

                imageView7.setBorderColor(getResources().getColor(R.color.white));
                imageView7.setBorderWidth(3f);

                imageView8.setBorderColor(getResources().getColor(R.color.white));
                imageView8.setBorderWidth(3f);

                imageView9.setBorderColor(getResources().getColor(R.color.white));
                imageView9.setBorderWidth(3f);

                imageView10.setBorderColor(getResources().getColor(R.color.white));
                imageView10.setBorderWidth(3f);
            }
        });

        imageView4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Устанавливаю нажатие
                imageView4.setBorderColor(getResources().getColor(R.color.grey));
                imageView4.setBorderWidth(8f);
                mainImage.setImageResource(R.drawable.hoodie_grey);
                clothingColor = "grey";

                //Убираю нажатие с других
                imageView1.setBorderColor(getResources().getColor(R.color.white));
                imageView1.setBorderWidth(3f);

                imageView2.setBorderColor(getResources().getColor(R.color.white));
                imageView2.setBorderWidth(3f);

                imageView3.setBorderColor(getResources().getColor(R.color.white));
                imageView3.setBorderWidth(3f);

                imageView5.setBorderColor(getResources().getColor(R.color.white));
                imageView5.setBorderWidth(3f);

                imageView6.setBorderColor(getResources().getColor(R.color.white));
                imageView6.setBorderWidth(3f);

                imageView7.setBorderColor(getResources().getColor(R.color.white));
                imageView7.setBorderWidth(3f);

                imageView8.setBorderColor(getResources().getColor(R.color.white));
                imageView8.setBorderWidth(3f);

                imageView9.setBorderColor(getResources().getColor(R.color.white));
                imageView9.setBorderWidth(3f);

                imageView10.setBorderColor(getResources().getColor(R.color.white));
                imageView10.setBorderWidth(3f);
            }
        });

        imageView5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Устанавливаю нажатие
                imageView5.setBorderColor(getResources().getColor(R.color.grey));
                imageView5.setBorderWidth(8f);
                mainImage.setImageResource(R.drawable.hoodie_black);
                clothingColor = "black";

                //Устанавливаю картинку

                //Убираю нажатие с других
                imageView1.setBorderColor(getResources().getColor(R.color.white));
                imageView1.setBorderWidth(3f);

                imageView2.setBorderColor(getResources().getColor(R.color.white));
                imageView2.setBorderWidth(3f);

                imageView3.setBorderColor(getResources().getColor(R.color.white));
                imageView3.setBorderWidth(3f);

                imageView4.setBorderColor(getResources().getColor(R.color.white));
                imageView4.setBorderWidth(3f);

                imageView6.setBorderColor(getResources().getColor(R.color.white));
                imageView6.setBorderWidth(3f);

                imageView7.setBorderColor(getResources().getColor(R.color.white));
                imageView7.setBorderWidth(3f);

                imageView8.setBorderColor(getResources().getColor(R.color.white));
                imageView8.setBorderWidth(3f);

                imageView9.setBorderColor(getResources().getColor(R.color.white));
                imageView9.setBorderWidth(3f);

                imageView10.setBorderColor(getResources().getColor(R.color.white));
                imageView10.setBorderWidth(3f);

            }
        });

        imageView6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Устанавливаю нажатие
                imageView6.setBorderColor(getResources().getColor(R.color.grey));
                imageView6.setBorderWidth(8f);
                mainImage.setImageResource(R.drawable.hoodie_green);
                clothingColor = "green";

                //Устанавливаю картинку

                //Убираю нажатие с других
                imageView1.setBorderColor(getResources().getColor(R.color.white));
                imageView1.setBorderWidth(3f);

                imageView2.setBorderColor(getResources().getColor(R.color.white));
                imageView2.setBorderWidth(3f);

                imageView3.setBorderColor(getResources().getColor(R.color.white));
                imageView3.setBorderWidth(3f);

                imageView4.setBorderColor(getResources().getColor(R.color.white));
                imageView4.setBorderWidth(3f);

                imageView5.setBorderColor(getResources().getColor(R.color.white));
                imageView5.setBorderWidth(3f);

                imageView7.setBorderColor(getResources().getColor(R.color.white));
                imageView7.setBorderWidth(3f);

                imageView8.setBorderColor(getResources().getColor(R.color.white));
                imageView8.setBorderWidth(3f);

                imageView9.setBorderColor(getResources().getColor(R.color.white));
                imageView9.setBorderWidth(3f);

                imageView10.setBorderColor(getResources().getColor(R.color.white));
                imageView10.setBorderWidth(3f);

            }
        });

        imageView7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Устанавливаю нажатие
                imageView7.setBorderColor(getResources().getColor(R.color.grey));
                imageView7.setBorderWidth(8f);
                mainImage.setImageResource(R.drawable.hoodie_yellow);
                clothingColor = "yellow";

                //Устанавливаю картинку

                //Убираю нажатие с других
                imageView1.setBorderColor(getResources().getColor(R.color.white));
                imageView1.setBorderWidth(3f);

                imageView2.setBorderColor(getResources().getColor(R.color.white));
                imageView2.setBorderWidth(3f);

                imageView3.setBorderColor(getResources().getColor(R.color.white));
                imageView3.setBorderWidth(3f);

                imageView4.setBorderColor(getResources().getColor(R.color.white));
                imageView4.setBorderWidth(3f);

                imageView5.setBorderColor(getResources().getColor(R.color.white));
                imageView5.setBorderWidth(3f);

                imageView6.setBorderColor(getResources().getColor(R.color.white));
                imageView6.setBorderWidth(3f);

                imageView8.setBorderColor(getResources().getColor(R.color.white));
                imageView8.setBorderWidth(3f);

                imageView9.setBorderColor(getResources().getColor(R.color.white));
                imageView9.setBorderWidth(3f);

                imageView10.setBorderColor(getResources().getColor(R.color.white));
                imageView10.setBorderWidth(3f);

            }
        });

        imageView8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Устанавливаю нажатие
                imageView8.setBorderColor(getResources().getColor(R.color.grey));
                imageView8.setBorderWidth(8f);
                mainImage.setImageResource(R.drawable.hoodie_orange);
                clothingColor = "orange";

                //Устанавливаю картинку

                //Убираю нажатие с других
                imageView1.setBorderColor(getResources().getColor(R.color.white));
                imageView1.setBorderWidth(3f);

                imageView2.setBorderColor(getResources().getColor(R.color.white));
                imageView2.setBorderWidth(3f);

                imageView3.setBorderColor(getResources().getColor(R.color.white));
                imageView3.setBorderWidth(3f);

                imageView4.setBorderColor(getResources().getColor(R.color.white));
                imageView4.setBorderWidth(3f);

                imageView5.setBorderColor(getResources().getColor(R.color.white));
                imageView5.setBorderWidth(3f);

                imageView6.setBorderColor(getResources().getColor(R.color.white));
                imageView6.setBorderWidth(3f);

                imageView7.setBorderColor(getResources().getColor(R.color.white));
                imageView7.setBorderWidth(3f);

                imageView9.setBorderColor(getResources().getColor(R.color.white));
                imageView9.setBorderWidth(3f);

                imageView10.setBorderColor(getResources().getColor(R.color.white));
                imageView10.setBorderWidth(3f);

            }
        });

        imageView9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Устанавливаю нажатие
                imageView9.setBorderColor(getResources().getColor(R.color.grey));
                imageView9.setBorderWidth(8f);
                mainImage.setImageResource(R.drawable.hoodie_red);
                clothingColor = "red";

                //Устанавливаю картинку

                //Убираю нажатие с других
                imageView1.setBorderColor(getResources().getColor(R.color.white));
                imageView1.setBorderWidth(3f);

                imageView2.setBorderColor(getResources().getColor(R.color.white));
                imageView2.setBorderWidth(3f);

                imageView3.setBorderColor(getResources().getColor(R.color.white));
                imageView3.setBorderWidth(3f);

                imageView4.setBorderColor(getResources().getColor(R.color.white));
                imageView4.setBorderWidth(3f);

                imageView5.setBorderColor(getResources().getColor(R.color.white));
                imageView5.setBorderWidth(3f);

                imageView6.setBorderColor(getResources().getColor(R.color.white));
                imageView6.setBorderWidth(3f);

                imageView7.setBorderColor(getResources().getColor(R.color.white));
                imageView7.setBorderWidth(3f);

                imageView8.setBorderColor(getResources().getColor(R.color.white));
                imageView8.setBorderWidth(3f);

                imageView10.setBorderColor(getResources().getColor(R.color.white));
                imageView10.setBorderWidth(3f);

            }
        });

        imageView10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Устанавливаю нажатие
                imageView10.setBorderColor(getResources().getColor(R.color.grey));
                imageView10.setBorderWidth(8f);
                mainImage.setImageResource(R.drawable.hoodie_blue);
                clothingColor = "blue";

                //Устанавливаю картинку

                //Убираю нажатие с других
                imageView1.setBorderColor(getResources().getColor(R.color.white));
                imageView1.setBorderWidth(3f);

                imageView2.setBorderColor(getResources().getColor(R.color.white));
                imageView2.setBorderWidth(3f);

                imageView3.setBorderColor(getResources().getColor(R.color.white));
                imageView3.setBorderWidth(3f);

                imageView4.setBorderColor(getResources().getColor(R.color.white));
                imageView4.setBorderWidth(3f);

                imageView5.setBorderColor(getResources().getColor(R.color.white));
                imageView5.setBorderWidth(3f);

                imageView6.setBorderColor(getResources().getColor(R.color.white));
                imageView6.setBorderWidth(3f);

                imageView7.setBorderColor(getResources().getColor(R.color.white));
                imageView7.setBorderWidth(3f);

                imageView8.setBorderColor(getResources().getColor(R.color.white));
                imageView8.setBorderWidth(3f);

                imageView9.setBorderColor(getResources().getColor(R.color.white));
                imageView9.setBorderWidth(3f);

            }
        });
    }

}
