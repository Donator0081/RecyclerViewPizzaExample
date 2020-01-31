package com.example.recyclerviewpizzaexample;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder> {

    private ArrayList<ItemForRecyclerView> arrayList;
    Context context;

    class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public ImageView imageViewPizza;
        public TextView textViewName;
        public TextView textViewDesc;

        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            imageViewPizza = itemView.findViewById(R.id.imageViewPizza);
            textViewName = itemView.findViewById(R.id.textViewName);
            textViewDesc = itemView.findViewById(R.id.textViewDesc);

        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            ItemForRecyclerView itemForRecyclerView = arrayList.get(position);
            Intent intent = new Intent(context,RecipeActivity.class);
            intent.putExtra("imagePizza",itemForRecyclerView.getImageViewPizza());
            intent.putExtra("title",itemForRecyclerView.getTextViewName());
            intent.putExtra("description",itemForRecyclerView.getTextViewDesc());
            intent.putExtra("recipe",itemForRecyclerView.getRecipe());

            context.startActivity(intent);
        }
    }

    public RecyclerViewAdapter(ArrayList<ItemForRecyclerView> arrayList,Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_for_recycler_view, parent, false);
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        ItemForRecyclerView itemForRecyclerView = arrayList.get(position);

        holder.imageViewPizza.setImageResource(itemForRecyclerView.getImageViewPizza());
        holder.textViewName.setText(itemForRecyclerView.getTextViewName());
        holder.textViewDesc.setText(itemForRecyclerView.getTextViewDesc());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
