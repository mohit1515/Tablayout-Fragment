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

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.MyViewHolder>{
    Context context;
    ArrayList<SingleRowStu> arrr;

    public StudentAdapter(Context context, ArrayList<SingleRowStu> arrr) {
        this.context = context;
        this.arrr = arrr;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.single_row_stu, viewGroup, false);
        MyViewHolder mvh = new MyViewHolder(view);
        return mvh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        SingleRowStu s= arrr.get(i);
        String name = s.getStuname();
        int image = s.getStuimage();

        myViewHolder.tname.setText(name);
        myViewHolder.imagev.setImageResource(image);
    }

    @Override
    public int getItemCount() {
        return arrr.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tname;
        ImageView imagev;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tname = itemView.findViewById(R.id.stuname);
            imagev = itemView.findViewById(R.id.stuimage);
        }
    }
}
