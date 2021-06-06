package com.example.homework3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.zip.Inflater;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {

    private List<String> list;
    private LayoutInflater inflater;



    public RecyclerAdapter(List<String> list, Context context){
        this.list = list;
        this.inflater = LayoutInflater.from(context);
    }
    @Override
    public RecyclerViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_notes,parent,false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder( RecyclerAdapter.RecyclerViewHolder holder, int position) {
        holder.txtTitle.setText(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder{
        TextView txtTitle,txtDescription;

        public RecyclerViewHolder( View itemView) {
            super(itemView);
            txtTitle = itemView.findViewById(R.id.txt_title);
            txtDescription = itemView.findViewById(R.id.txt_Description);

        }
    }
}
