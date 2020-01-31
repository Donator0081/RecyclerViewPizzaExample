package com.example.recyclerviewpizzaexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        ArrayList<ItemForRecyclerView> arrayListForItems = new ArrayList<>();
        arrayListForItems.add(new ItemForRecyclerView(R.drawable.marghuerita, Utils.PIZZA_1_TITLE, Utils.PIZZA_1_DESCRIPRON, Utils.PIZZA_1_RECIPE));
        arrayListForItems.add(new ItemForRecyclerView(R.drawable.pizza2, Utils.PIZZA_2_TITLE, Utils.PIZZA_2_DESCRIPRON, Utils.PIZZA_2_RECIPE));
        arrayListForItems.add(new ItemForRecyclerView(R.drawable.pizza3, Utils.PIZZA_3_TITLE, Utils.PIZZA_3_DESCRIPRON, Utils.PIZZA_3_RECIPE));
        arrayListForItems.add(new ItemForRecyclerView(R.drawable.pizza4, Utils.PIZZA_4_TITLE, Utils.PIZZA_4_DESCRIPRON, Utils.PIZZA_4_RECIPE));
        arrayListForItems.add(new ItemForRecyclerView(R.drawable.pizza5, Utils.PIZZA_5_TITLE, Utils.PIZZA_5_DESCRIPRON, Utils.PIZZA_5_RECIPE));
        adapter = new RecyclerViewAdapter(arrayListForItems,this);
        recyclerView.setAdapter(adapter);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }
}
