package com.example.recyclerviewpizzaexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class RecipeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);
        TextView title = findViewById(R.id.textViewTitle);
        TextView recipe = findViewById(R.id.textViewRecipe);
        ImageView imageView = findViewById(R.id.imageViewPizzaRecipe);
        Intent intent = getIntent();
        if (intent!=null){
            title.setText(intent.getStringExtra("title"));
            recipe.setText(intent.getStringExtra("recipe"));
            imageView.setImageResource(intent.getIntExtra("imagePizza",0));
        }

    }
}
