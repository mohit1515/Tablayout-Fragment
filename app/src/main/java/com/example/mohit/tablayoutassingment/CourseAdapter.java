package com.example.mohit.tablayoutassingment;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.MyViewHolder>{
    Context context;
    ArrayList<SingleRowCourse> arrr;

    public CourseAdapter(Context context, ArrayList<SingleRowCourse> arrr) {
        this.context = context;
        this.arrr = arrr;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.single_row_course, viewGroup, false);
        CourseAdapter.MyViewHolder mvh = new CourseAdapter.MyViewHolder(view);
        return mvh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        SingleRowCourse s= arrr.get(i);
        String courname = s.getName();
        String teacher = s.getTeacher();

        myViewHolder.tcname.setText(courname);
        myViewHolder.tteacher.setText(teacher);
    }

    @Override
    public int getItemCount() {
        return arrr.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tcname , tteacher;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tcname = itemView.findViewById(R.id.textView);
            tteacher = itemView.findViewById(R.id.textView2);
        }
    }
}

