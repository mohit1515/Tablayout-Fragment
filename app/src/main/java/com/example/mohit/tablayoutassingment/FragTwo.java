package com.example.mohit.tablayoutassingment;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FragTwo extends Fragment {
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<SingleRowStu> arr;
    SingleRowStu singleRowStu;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.activity_frag_two , container , false);

        recyclerView = view.findViewById(R.id.rcycview);

        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        String[] name = {"Teacher1","Teacher2","Teacher3","Teacher4","Teacher5","Teacher6","Teacher7","Teacher8"};
        int[] image= {R.drawable.teacher,R.drawable.teacher,R.drawable.teacher,R.drawable.teacher,R.drawable.teacher,R.drawable.teacher,R.drawable.teacher,R.drawable.teacher};

        arr = new ArrayList<>();
        for(int i=0;i<name.length;i++){
            arr.add(new SingleRowStu(name[i], image[i]));
        }

        StudentAdapter studentAdapter =new StudentAdapter(getActivity(), arr);
        recyclerView.setAdapter(studentAdapter);


    return view;
    }
}
