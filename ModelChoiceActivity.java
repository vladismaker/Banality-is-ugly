package com.example.eyesontheprize;

import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.yarolegovich.slidingrootnav.SlidingRootNav;
import com.yarolegovich.slidingrootnav.SlidingRootNavBuilder;

import java.util.Arrays;
import java.util.Set;

public class ModelChoiceActivity extends AppCompatActivity {
//    private static final int POS_CLOSE = 0;
    private static final int POS_HOODIE = 0;
    private static final int POS_T_SHIRT = 1;
    private static final int POS_SWEATSHIRT = 2;
//    private static final int POS_SETTINGS = 3;
//    private static final int POS_ABOUT_US = 4;
//    private static final int POS_LOGOUT = 5;

//    private String[] screenTitles;
//    private Drawable[] screenIcons;
    private LinearLayout mCustomBottomSheet;
    private BottomSheetBehavior mBottomSheetBehavior;

    private SlidingRootNav slidingRootNav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model_choice);

        /*//Делает прозрачной строку состояния
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);*/

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        slidingRootNav = new SlidingRootNavBuilder(this)
                .withDragDistance(180)
                .withRootViewScale(0.85f)
                .withRootViewElevation(25)
                .withToolbarMenuToggle(toolbar)
                .withMenuOpened(false)
                .withContentClickableWhenMenuOpened(false)
                .withSavedState(savedInstanceState)
                .withMenuLayout(R.layout.drawer_menu)
                .inject();

        String[] clothesNames = new String[Clothes.clothes.length];
        for (int i = 0; i < clothesNames.length; i++){
            clothesNames[i] = Clothes.clothes[i].getName();
        }
        int[] clothesImages = new int[Clothes.clothes.length];
        for(int i = 0; i < clothesImages.length; i++){
            clothesImages[i] = Clothes.clothes[i].getImageResourceId();
        }
        RecyclerView list = findViewById(R.id.clothes_recycler);
        ClCardsAdapter adapter = new ClCardsAdapter(clothesNames, clothesImages);
        list.setNestedScrollingEnabled(false);
        list.setLayoutManager(new GridLayoutManager(this, 1));
        list.setAdapter(adapter);

        adapter.setListener(new ClCardsAdapter.Listener() {
            @Override
            public void onClick(int position) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                if(position == POS_HOODIE){
                    HoodieFragment hoodieFragment = new HoodieFragment();
                    transaction.replace(R.id.container, hoodieFragment);
                }
                else if(position == POS_T_SHIRT){
                    TShitFragment tShirtFragment = new TShitFragment();
                    transaction.replace(R.id.container, tShirtFragment);
                }
                else if(position == POS_SWEATSHIRT){
                    SweatshirtFragment sweatshirtFragment = new SweatshirtFragment();
                    transaction.replace(R.id.container, sweatshirtFragment);
                }

                slidingRootNav.closeMenu();
                transaction.addToBackStack(null);
                transaction.commit();

            }
        });

        //adapter.setSelected(POS_ABOUT_US);
        //screenIcons = loadScreenIcons();
        //screenTitles = loadScreenTitles();


/*        DrawerAdapter adapter = new DrawerAdapter(Arrays.asList(
                createItemFor(POS_CLOSE),
                createItemFor(POS_DASHBOARD).setChecked(true),
                createItemFor(POS_MY_PROFILE),
                createItemFor(POS_NEARBY_RES),
                createItemFor(POS_SETTINGS),
                createItemFor(POS_ABOUT_US),
                createItemFor(POS_LOGOUT)
        ));*/
/*        adapter.setListener(this);

        RecyclerView list = findViewById(R.id.drawer_list);
        list.setNestedScrollingEnabled(false);
        list.setLayoutManager(new GridLayoutManager(this, 1));
        list.setAdapter(adapter);
        adapter.setSelected(POS_ABOUT_US);*/
    }

   /* private DrawerItem createItemFor(int position){
        return new SimpleItem(screenIcons[position], screenTitles[position])
                .withIconTint(color(R.color.bejeviy))
                .withTextTint(color(R.color.bejeviy))
                .withSelectedIconTint(color(R.color.black))
                .withSelectedTextTint(color(R.color.black));
    }
    @ColorInt
    private  int color(@ColorRes int res){
        return ContextCompat.getColor(this, res);
    }

    private Drawable[] loadScreenIcons() {
        TypedArray ta = getResources().obtainTypedArray(R.array.id_activityScreenIcons);
        Drawable[] icons = new Drawable[ta.length()];
        for (int i = 0; i < ta.length(); i++) {
            int id = ta.getResourceId(i, 0);
            if(id!=0){
                icons[i] = ContextCompat.getDrawable(this, id);
            }
        }
        ta.recycle();
        return icons;
    }*/

/*    @Override
    public void onBackPressed() {
        finish();
    }*/

/*    private String[] loadScreenTitles() {
        return getResources().getStringArray(R.array.id_activityScreenTitles);
    }*/

/*    @Override
    public void onItemSelected(int position) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        if(position == POS_DASHBOARD){
            DashBoardFragment dashBoardFragment = new DashBoardFragment();
            transaction.replace(R.id.container, dashBoardFragment);
        }
        else if(position == POS_MY_PROFILE){
            MyProfileFragment myProfileFragment = new MyProfileFragment();
            transaction.replace(R.id.container, myProfileFragment);
        }
        else if(position == POS_NEARBY_RES){
            NearbyResFragment nearbyResFragment = new NearbyResFragment();
            transaction.replace(R.id.container, nearbyResFragment);
        }
        else if(position == POS_SETTINGS){
            SettingsFragment settingsFragment = new SettingsFragment();
            transaction.replace(R.id.container, settingsFragment);
        }
        else if(position == POS_ABOUT_US){
            AboutUsFragment aboutUsFragment = new AboutUsFragment();
            transaction.replace(R.id.container, aboutUsFragment);
        }
        else if(position == POS_LOGOUT){
            finish();
        }

        slidingRootNav.closeMenu();
        transaction.addToBackStack(null);
        transaction.commit();
    }*/
}