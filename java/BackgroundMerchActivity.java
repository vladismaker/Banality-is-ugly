package com.example.eyesontheprize;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.ImageView;

import com.google.android.material.tabs.TabLayout;

public class BackgroundMerchActivity extends AppCompatActivity {

    private static String clothingColor;
//    String clothingColor;
    float dX;
    float dY;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_background_merch);
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Выберите фон");
        setSupportActionBar(toolbar);

        //Получение данных из HoodieFragment.java
        Bundle arguments = getIntent().getExtras();
        if (arguments != null) {
            clothingColor = arguments.getString("color");
        }

        SectionsPagerAdapter pagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        ViewPager pager = (ViewPager)findViewById(R.id.pager);
        pager.setAdapter(pagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(pager);

    }

    private class SectionsPagerAdapter extends FragmentPagerAdapter {
        public SectionsPagerAdapter(FragmentManager fm){
            super(fm);
        }
        public int getCount(){
            return 2;
        }

        public Fragment getItem(int position){
            switch (position){
                case 0:
                    return new UseFragment();
                case 1:
                    return new CreateFragment();

            }
            return null;
        }
        public CharSequence getPageTitle (int position){
            switch (position){
                case 0:
                    return getResources().getText(R.string.use_tab);
                case 1:
                    return getResources().getText(R.string.create_tab);
            }
            return null;
        }
    }

    public static String getClothingColor() {
        return clothingColor;
    }
/*        imageView = findViewById(R.id.main_image);

        imageView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                switch (event.getAction()) {

                    case MotionEvent.ACTION_DOWN:
                        dX = view.getX() - event.getRawX();
                        dY = view.getY() - event.getRawY();
                        break;

                    case MotionEvent.ACTION_MOVE:
                        view.animate()
                                .x(event.getRawX() + dX)
                                .y(event.getRawY() + dY)
                                .setDuration(0)
                                .start();
                        break;
                    case MotionEvent.ACTION_UP:
                        break;
                    default:
                        return false;
                }
                return true;
            }
        });*/


}