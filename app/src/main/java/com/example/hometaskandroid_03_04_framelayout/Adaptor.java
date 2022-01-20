package com.example.hometaskandroid_03_04_framelayout;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class Adaptor extends RecyclerView.Adapter<ViewHolder> {

    List<String> names;
    List<String> numbers;


    public Adaptor(List<String> names, List<String> strings) {
        this.names = names;
        this.numbers=strings;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate
                (R.layout.items, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(names.get(position), numbers.get(position));

    }

    @Override
    public int getItemCount() {
        return names.size();
    }
}


