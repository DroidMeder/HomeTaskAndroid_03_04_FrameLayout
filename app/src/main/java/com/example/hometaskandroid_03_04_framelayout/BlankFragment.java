package com.example.hometaskandroid_03_04_framelayout;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Arrays;
import java.util.List;

public class BlankFragment extends Fragment {

    private RecyclerView recyclerView;
    private Adaptor adaptor;
    private List<String> names;
    private List<String> numbers;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView=view.findViewById(R.id.recycler_fragment);
        loadData();
        adaptor= new Adaptor(names, numbers);
        recyclerView.setAdapter(adaptor);
    }

    private void loadData() {
        names = Arrays.asList("Евгений Захаров",
                "Михаил Кулаков",
                "Дарья Наумова",
                "Ева Орлова",
                "Софья Ермолова",
                "Никита Артамонов",
                "Артём Архипов",
                "Варвара Фирсова",
                "Егор Козлов",
                "Дарья Лазарева",
                "Михаил Титов",
                "Павел Гаврилов",
                "Вероника Некрасова",
                "Оливия Носкова",
                "Мария Прокофьева",
                "Мирослава Павлова",
                "Константин Абрамов",
                "Николай Макаров",
                "Милана Архипова",
                "Вера Николаева");
                numbers = Arrays.asList("+996 707 587865",
                "+996 707 5797889",
                "+996 770 587865",
                "+996 707 509865",
                "+996 770 587865",
                "+996 700 6657657",
                "+996 710 655466",
                "+996 701 464776",
                "+996 707 5876575",
                "+996 500 768677787",
                "+996 505 7657576576",
                "+996 809 5445664",
                "+996 312 656566", "+996 312 656566", "+996 856 345866",
                "+996 322 534535",
                "+996 312 6565634645",
                "+996 312 6565645656",
                "+998 656 653653634",
                "+996 367 98787897");
    }
}