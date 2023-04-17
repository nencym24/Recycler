package com.example.recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecylerAdapter extends RecyclerView.Adapter<RecylerAdapter.DataHolder>{

    String[] country;
    public RecylerAdapter(String[] country) {

        this.country = country;
    }

    @NonNull
    @Override
    public RecylerAdapter.DataHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout , parent , false);
        return new DataHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecylerAdapter.DataHolder holder, int position) {

        holder.txt.setText(country[position]);

    }

    @Override
    public int getItemCount() {
        return country.length;
    }

    public class DataHolder extends RecyclerView.ViewHolder {

        TextView txt;
        public DataHolder(@NonNull View itemView) {
            super(itemView);

            txt = itemView.findViewById(R.id.txtData);
        }
    }
}

