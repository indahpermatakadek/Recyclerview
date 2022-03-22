package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterRV extends RecyclerView.Adapter<AdapterRV.ViewHolder> {

    ArrayList<ItemModel> dataitem;

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textjudul;
        TextView texttahun;
        ImageView film;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textjudul = itemView.findViewById(R.id.text_judul);
            texttahun = itemView.findViewById(R.id.text_tahun);
            film = itemView.findViewById(R.id.image_poster);
        }
    }

    AdapterRV(ArrayList<ItemModel>data){
        this.dataitem = data;
    }
    @NonNull
    @Override
    public AdapterRV.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_layout,parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterRV.ViewHolder holder, int position) {
        
        TextView text_judul = holder.textjudul;
        TextView text_tahun = holder.texttahun;
        ImageView image_poster = holder.film;

        text_judul.setText(dataitem.get(position).getName());
        text_tahun.setText(dataitem.get(position).getYear());
        image_poster.setImageResource(dataitem.get(position).getFilm());

    }

    @Override
    public int getItemCount() {

        return dataitem.size();
    }


}
