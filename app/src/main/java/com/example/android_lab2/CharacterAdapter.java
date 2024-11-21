package com.example.android_lab2;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

// Адаптер для управления элементами списка RecyclerView.
public class CharacterAdapter extends RecyclerView.Adapter<CharacterViewHolder> {
    private final List<com.example.android_lab2.Character> characters; // Список персонажей
    private final Context context;           // Контекст приложения

    // Конструктор адаптера.
    public CharacterAdapter(Context context, List<com.example.android_lab2.Character> characters) {
        this.characters = characters;
        this.context = context;
    }

    @Override
    public int getItemCount() {
        return characters.size(); // Возвращает количество элементов в списке.
    }

    @NonNull
    @Override
    public CharacterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int ViewType) {
        // Создаёт новый ViewHolder для элемента списка.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        Log.d("Adapter", "OnCreateViewHolder"); // Лог для отладки
        return new CharacterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CharacterViewHolder holder, int position) {
        // Заполняет данные для текущего элемента списка.
        com.example.android_lab2.Character character = characters.get(position);
        holder.nameTextView.setText(character.getName());
        holder.ageTextView.setText(character.getAge());
        holder.avatarImageView.setImageResource(character.getAvatarResId());
        holder.infoButton.setOnClickListener(v ->
                CharacterClickListener.onCharacterClick(context, character.getDescription())
        );
    }
}
