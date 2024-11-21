package com.example.android_lab2;

import androidx.recyclerview.widget.RecyclerView;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

// ViewHolder для одного элемента RecyclerView, содержит ссылки на представления (View) элемента.
public class CharacterViewHolder extends RecyclerView.ViewHolder {

    // Поля для отображения данных персонажа.
    TextView nameTextView, ageTextView;
    ImageView avatarImageView;
    Button infoButton;

    // Конструктор, инициализирует представления с помощью findViewById.
    public CharacterViewHolder(View v) {
        super(v);
        nameTextView = v.findViewById(R.id.textViewName); // Текстовое поле для имени
        ageTextView = v.findViewById(R.id.textViewAge);   // Текстовое поле для возраста
        avatarImageView = v.findViewById(R.id.imageViewCover); // Изображение аватара
        infoButton = v.findViewById(R.id.buttonInfo); // Кнопка для дополнительной информации
    }
}
