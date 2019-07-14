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

import java.util.ArrayList;

public class FragThree extends Fragment {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<SingleRowCourse> arr;
    SingleRowCourse singleRowCourse;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.activity_frag_three , container , false);

        recyclerView = view.findViewById(R.id.rcycleview);
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        String[] course = {"Course1","Course2","Course3","Course4","Course5","Course6","Course7","Course8"};
        String[] teacher = {"Teacher1","Teacher2","Teacher3","Teacher4","Teacher5","Teacher6","Teacher7","Teacher8"};

        arr = new ArrayList<SingleRowCourse>();
        for(int i=0;i<course.length;i++){
            arr.add(new SingleRowCourse(course[i] ,teacher[i]));
        }

        CourseAdapter cadp = new CourseAdapter(getActivity(), arr);
        recyclerView.setAdapter(cadp);

        return view;
    }
}
