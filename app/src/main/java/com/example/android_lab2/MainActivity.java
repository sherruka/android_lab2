package com.example.android_lab2;

import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this); // Включаем отображение контента до краёв экрана
        setContentView(R.layout.activity_main);

        rView = findViewById(R.id.recyclerView); // Находим RecyclerView по ID
        rView.setLayoutManager(new LinearLayoutManager(this)); // Устанавливаем менеджер для отображения списка

        // Загружаем данные для персонажей
        String[] names = com.example.android_lab2.CharacterDataLoader.loadNames(this);
        String[] ages = com.example.android_lab2.CharacterDataLoader.loadAges(this);
        String[] descriptions = com.example.android_lab2.CharacterDataLoader.loadDescriptions(this);
        int[] imageIds = com.example.android_lab2.CharacterDataLoader.loadImageIds(this);

        // Создаём список персонажей
        List<com.example.android_lab2.Character> characterList = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            characterList.add(new com.example.android_lab2.Character(names[i], ages[i], imageIds[i], descriptions[i])); // Добавляем персонажей в список
        }

        // Устанавливаем адаптер для RecyclerView
        rView.setAdapter(new com.example.android_lab2.CharacterAdapter(this, characterList));
    }
}
