package com.example.mohit.tablayoutassingment;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class FragOne extends Fragment {
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    SingleRowStu singleRowStu;
    ArrayList<SingleRowStu> arr;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_frag_one, container, false);

        recyclerView = view.findViewById(R.id.rcycview);

        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        String[] name = {"Student1","Student2","Student3","Student4","Student5","Student6","Student7","Student8"};
        int[] image= {R.drawable.user,R.drawable.user,R.drawable.user,R.drawable.user,R.drawable.user,R.drawable.user,R.drawable.user,R.drawable.user};

        arr = new ArrayList<>();
        for(int i=0;i<name.length;i++){
            arr.add(new SingleRowStu(name[i], image[i]));
        }

        StudentAdapter fadp = new StudentAdapter(getActivity(), arr);
        recyclerView.setAdapter(fadp);

        return view;
    }
}
