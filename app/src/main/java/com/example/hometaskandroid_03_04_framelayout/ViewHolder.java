package com.example.hometaskandroid_03_04_framelayout;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    private final TextView textName;
    private final TextView textNumber;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        textName=itemView.findViewById(R.id.textView);
        textNumber=itemView.findViewById(R.id.textView2);
    }

    public void bind(String name, String number){
        textName.setText(name);
        textNumber.setText(number);
    }

}

