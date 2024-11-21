package com.example.android_lab2;

import android.content.Context;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

// Класс для обработки кликов на элементы списка RecyclerView.
public class CharacterClickListener extends AppCompatActivity {

    // Метод для отображения описания персонажа в диалоговом окне.
    public static void onCharacterClick(Context context, String description) {
        // Создаём и отображаем диалоговое окно.
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("Описание")
                .setMessage(description)
                .setPositiveButton("Закрыть", (dialog, which) -> dialog.dismiss()) // Кнопка для закрытия
                .create()
                .show();
    }
}
