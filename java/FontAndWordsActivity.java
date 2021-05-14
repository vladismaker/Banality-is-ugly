package com.example.eyesontheprize;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class FontAndWordsActivity extends AppCompatActivity {
    public static final String EXTRA_BACKGROUND_ID = "backgroundId";
    EditText wordOne, wordTwo;
    TextView wordOneTextView, wordTwoTextView;
    String wordOneString, wordTwoString;
    int countCharsWordOne = 0 , countCharsWordTwo = 0, backgroundId, backgroundImage;
    ArrayList<String> overlapChar = new ArrayList<>();
    ArrayList<String> wordArrayOne, wordArrayTwo, fillGrid;
    int indentLeft, indentRight, horizontalSize = 8, verticalSize = 7;
    TextView char1, char2, char3, char4, char5, char6, char7, char8, char9, char10, char11, char12, char13, char14, char15, char16, char17, char18, char19, char20, char21, char22, char23, char24, char25, char26, char27, char28, char29, char30, char31, char32, char33, char34, char35, char36, char37, char38, char39, char40, char41, char42, char43, char44, char45, char46, char47, char48, char49, char50, char51, char52, char53, char54, char55, char56;
    TextView[] arr;
    String[] arr_english_char = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    ArrayList<TextView> array_text_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_font_and_words);
        init();

        //Toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Выберите шрифт и слова");
        setSupportActionBar(toolbar);

        //Получение данных от карточки
        backgroundId = (Integer) getIntent().getExtras().get(EXTRA_BACKGROUND_ID);
        String backgroundName = LibraryBackground.back[backgroundId].getName();
        TextView textView = (TextView) findViewById(R.id.background_text);
        textView.setText(backgroundName);
        backgroundImage = LibraryBackground.back[backgroundId].getImageResourceId();
        ImageView imageView = (ImageView) findViewById(R.id.background_image);
        imageView.setImageDrawable(ContextCompat.getDrawable(this, backgroundImage));

        int[] fontImages = new int[Font.fonts.length];
        for (int i = 0; i < fontImages.length; i++) {
            fontImages[i] = Font.fonts[i].getImageResourceId();
        }
        RecyclerView list = findViewById(R.id.font_recycler);
        FontAndWordsAdapter adapter = new FontAndWordsAdapter(fontImages);
        //list.setNestedScrollingEnabled(false);
        list.setLayoutManager(new GridLayoutManager(this, 1));
        list.setAdapter(adapter);

        adapter.setListener(new FontAndWordsAdapter.Listener() {
            @Override
            public void onClick(int position) {
                Intent intent = new Intent(FontAndWordsActivity.this, ShowAllActivity.class);
                intent.putExtra(ShowAllActivity.EXTRA_FONT_ID, position);
                intent.putExtra(ShowAllActivity.EXTRA_BACKGROUND_ID, backgroundId);
                if(!wordOneString.isEmpty() || !wordTwoString.isEmpty()){
                    intent.putExtra(ShowAllActivity.EXTRA_WORDS_ONE, wordOneString);
                    intent.putExtra(ShowAllActivity.EXTRA_WORDS_TWO, wordTwoString);
                }else   {
                    Toast toast = Toast.makeText(getApplicationContext(), "Сначала введите оба слова", Toast.LENGTH_SHORT);
                    toast.show();
                    //Подстветить ошибкой поля ввода слов
                    //и вывести уведомление Toast
                }
                //intent.putExtra(String.valueOf(ShowAllActivity.EXTRA_FILL_GRID), fillGrid);

                startActivity(intent);
            }
        });

        fillGrid();

    }

    public void init(){
        char1 = findViewById(R.id.char1);
        char2 = findViewById(R.id.char2);
        char3 = findViewById(R.id.char3);
        char4 = findViewById(R.id.char4);
        char5 = findViewById(R.id.char5);
        char6 = findViewById(R.id.char6);
        char7 = findViewById(R.id.char7);
        char8 = findViewById(R.id.char8);
        char9 = findViewById(R.id.char9);
        char10 = findViewById(R.id.char10);
        char11 = findViewById(R.id.char11);
        char12 = findViewById(R.id.char12);
        char13 = findViewById(R.id.char13);
        char14 = findViewById(R.id.char14);
        char15 = findViewById(R.id.char15);
        char16 = findViewById(R.id.char16);
        char17 = findViewById(R.id.char17);
        char18 = findViewById(R.id.char18);
        char19 = findViewById(R.id.char19);
        char20 = findViewById(R.id.char20);
        char21 = findViewById(R.id.char21);
        char22 = findViewById(R.id.char22);
        char23 = findViewById(R.id.char23);
        char24 = findViewById(R.id.char24);
        char25 = findViewById(R.id.char25);
        char26 = findViewById(R.id.char26);
        char27 = findViewById(R.id.char27);
        char28 = findViewById(R.id.char28);
        char29 = findViewById(R.id.char29);
        char30 = findViewById(R.id.char30);
        char31 = findViewById(R.id.char31);
        char32 = findViewById(R.id.char32);
        char33 = findViewById(R.id.char33);
        char34 = findViewById(R.id.char34);
        char35 = findViewById(R.id.char35);
        char36 = findViewById(R.id.char36);
        char37 = findViewById(R.id.char37);
        char38 = findViewById(R.id.char38);
        char39 = findViewById(R.id.char39);
        char40 = findViewById(R.id.char40);
        char41 = findViewById(R.id.char41);
        char42 = findViewById(R.id.char42);
        char43 = findViewById(R.id.char43);
        char44 = findViewById(R.id.char44);
        char45 = findViewById(R.id.char45);
        char46 = findViewById(R.id.char46);
        char47 = findViewById(R.id.char47);
        char48 = findViewById(R.id.char48);
        char49 = findViewById(R.id.char49);
        char50 = findViewById(R.id.char50);
        char51 = findViewById(R.id.char51);
        char52 = findViewById(R.id.char52);
        char53 = findViewById(R.id.char53);
        char54 = findViewById(R.id.char54);
        char55 = findViewById(R.id.char55);
        char56 = findViewById(R.id.char56);
        arr = new TextView[] {char1, char2, char3, char4, char5, char6, char7, char8, char9, char10, char11, char12, char13, char14, char15, char16, char17, char18, char19, char20, char21, char22, char23, char24, char25, char26, char27, char28, char29, char30, char31, char32, char33, char34, char35, char36, char37, char38, char39, char40, char41, char42, char43, char44, char45, char46, char47, char48, char49, char50, char51, char52, char53, char54, char55, char56};
        array_text_view = new ArrayList<>(Arrays.asList(arr));
    }

    public void onButtonClickEnter(View view) {
        // Get TEXT from two EditText
        wordOne = findViewById(R.id.outlineTextField1);
        wordTwo = findViewById(R.id.outlineTextField2);
        wordOneTextView = findViewById(R.id.word_one);
        wordTwoTextView = findViewById(R.id.word_two);
        wordOneString = wordOne.getText().toString();
        wordTwoString = wordTwo.getText().toString();

        //wordOneTextView.setText(wordOneString);
        //wordTwoTextView.setText(wordTwoString);
        overlapChar.clear();
        createGrid(wordOneString, wordTwoString);
    }

    public void createGrid(String word1, String word2) {
        //Проверить количество букв в словах и разбить по буквам
        wordArrayOne = new ArrayList<>();
        wordArrayTwo = new ArrayList<>();
        for (char element : word1.toCharArray()) {
            wordArrayOne.add(Character.toString(element));
            countCharsWordOne++;
        }
        for (char element : word2.toCharArray()) {
            wordArrayTwo.add(Character.toString(element));
            countCharsWordTwo++;
        }
        for (int i = 0; i < wordArrayOne.size(); i++) {
            for (int j = 0; j < wordArrayTwo.size(); j++) {
                if(wordArrayOne.get(i).equals(wordArrayTwo.get(j))){
                    overlapChar.add(wordArrayOne.get(i));
                    indentLeft = j;
                    indentRight = wordArrayTwo.size() - (j+1);
                    String indentLeftStr = String.valueOf(indentLeft);
                    String indentRightStr = String.valueOf(indentRight);
                    wordOneTextView.setText(indentLeftStr);
                    wordTwoTextView.setText(indentRightStr);
                }
            }
        }
        //Расстановка первого слова
        //Рандомный столбец в диапозоне
        int max = (horizontalSize - indentRight);
        int min = indentLeft + 1;
        int range = (int) (Math.random() * (max-min+1)) + min;
        String rangeStr = String.valueOf(range);
        Toast toast1 = Toast.makeText(getApplicationContext(), "range"  + rangeStr, Toast.LENGTH_SHORT);
        toast1.show();
        int count = -1;
        for (int i = 0; i < wordOneString.length(); i++) {
            array_text_view.get(range + count).setText(wordArrayOne.get(i));
            array_text_view.get(range + count).setTextColor(getResources().getColor(R.color.bejeviy));
            count = count + 8;
        }
        
        //Проверить пересечение слов
        //Создать алгоритм расположения слов в таблице
        //Заполнить остальное пространство рандомными буквами
        //Вывод слов
    }
    public void fillGrid(){

        for (int i = 0; i < 56; i++) {
            int number = randomChoiceChar();
            //fillGrid.add(arr_english_char[number]);
            array_text_view.get(i).setText(arr_english_char[number]);
        }
    }

    public Integer randomChoiceChar(){
        int max = 25;
        int min = 0;
        int range = (int) (Math.random() * (max-min+1)) + min;
        return range;
    }
}
