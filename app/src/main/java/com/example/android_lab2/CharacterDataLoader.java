package com.example.android_lab2;

import android.content.Context;
import android.util.Log;

public class CharacterDataLoader {

    // Загружает массив имен персонажей из ресурсов.
    public static String[] loadNames(Context context) {
        return context.getResources().getStringArray(R.array.character_names);
    }

    // Загружает массив возрастов персонажей из ресурсов.
    public static String[] loadAges(Context context) {
        return context.getResources().getStringArray(R.array.character_ages);
    }

    // Загружает массив описаний персонажей из ресурсов.
    public static String[] loadDescriptions(Context context) {
        return context.getResources().getStringArray(R.array.character_descriptions);
    }

    // Загружает массив идентификаторов изображений персонажей.
    public static int[] loadImageIds(Context context) {
        String[] imageNames = context.getResources().getStringArray(R.array.character_images);
        int[] imageIds = new int[imageNames.length];

        // Преобразуем строковые имена изображений в идентификаторы ресурсов.
        for (int i = 0; i < imageNames.length; i++) {
            String resourceName = imageNames[i].replace("res/drawable/", "").replace(".png", "");
            imageIds[i] = context.getResources().getIdentifier(resourceName, "drawable", context.getPackageName());
            Log.d("CharacterDataLoader", "Image " + i + ": " + resourceName + " -> " + imageIds[i]);
        }

        return imageIds; // Возвращаем массив идентификаторов ресурсов.
    }
}
