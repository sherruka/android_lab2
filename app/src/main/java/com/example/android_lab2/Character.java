package com.example.android_lab2;

// Класс Character хранит информацию о персонаже для использования в RecyclerView.
public class Character {
    private final String name;         // Имя персонажа
    private final String age;          // Возраст персонажа
    private final int avatarResId;     // Идентификатор ресурса аватара
    private final String description;  // Краткое описание персонажа

    // Конструктор для создания объекта Character.
    public Character(String name, String age, int avatarResId, String description) {
        this.name = name;
        this.age = age;
        this.avatarResId = avatarResId;
        this.description = description;
    }

    // Геттеры для доступа к полям.
    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public int getAvatarResId() {
        return avatarResId;
    }

    public String getDescription() {
        return description;
    }
}
