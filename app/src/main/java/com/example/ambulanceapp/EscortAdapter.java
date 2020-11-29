package com.example.ambulanceapp;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

/**
 * Created by yenusu on 27/11/20.
 */

public class EscortAdapter extends RecyclerView.Adapter<EscortAdapter.ViewHolder> {

    private Context context;
    private List<Escorts> list;

    public EscortAdapter(Context context, List<Escorts> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.single_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Escorts movie = list.get(position);

        holder.textTitle.setText(movie.getTitle());
        holder.textRating.setText(String.valueOf(movie.getRating()));
        holder.textYear.setText(String.valueOf(movie.getYear()));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textTitle, textRating, textYear;

        public ViewHolder(View itemView) {
            super(itemView);

            textTitle = itemView.findViewById(R.id.main_title);
            textRating = itemView.findViewById(R.id.main_rating);
            textYear = itemView.findViewById(R.id.main_year);

            textTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(context,textTitle.getText().toString()+" "+"Booked", Toast.LENGTH_LONG).show();
                }
            });
        }
    }



}