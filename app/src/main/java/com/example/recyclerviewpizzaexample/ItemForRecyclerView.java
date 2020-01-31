package com.example.recyclerviewpizzaexample;

public class ItemForRecyclerView {
    private int imageViewPizza;
    private String textViewName;
    private String textViewDesc;
    private String recipe;

    public ItemForRecyclerView(int imageViewPizza, String textViewName, String textViewDesc,String recipe) {

        this.imageViewPizza = imageViewPizza;
        this.textViewName = textViewName;
        this.textViewDesc = textViewDesc;
        this.recipe = recipe;
    }

    public int getImageViewPizza() {
        return imageViewPizza;
    }

    public String getTextViewName() {
        return textViewName;
    }

    public String getTextViewDesc() {
        return textViewDesc;
    }

    public String getRecipe() {
        return recipe;
    }
}
