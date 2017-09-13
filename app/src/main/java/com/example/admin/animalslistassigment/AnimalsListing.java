package com.example.admin.animalslistassigment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class AnimalsListing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals_listing);

        Intent intent = getIntent();
        final String Category = intent.getStringExtra("Category_KEY");
        Toast.makeText(this, Category, Toast.LENGTH_SHORT).show();


        ListView animalsListView = (ListView) findViewById(R.id.AnimalsList);

        ArrayList<Animals> allAnimals;
        allAnimals = getAnimals();

        ArrayList<Animals> animalList= new ArrayList<>();
        for(Animals a : allAnimals)
        {
            if(a.getCategory().equals(Category))
            {
                animalList.add(a);
            }
        }
        CustomAdapter customAdapter = new CustomAdapter(this,R.layout.layout_0,animalList);
        animalsListView.setAdapter(customAdapter);


    }

    private ArrayList<Animals> getAnimals() {
        ArrayList<Animals> animalsList = new ArrayList<>();
        Animals Lion = new Animals("Lion", "Mammals", 12, 0, 420, R.drawable.lino);
        Animals Tiger = new Animals("Tiger", "Mammals", 20, 1, 670, R.drawable.tiger);
        Animals Cheetah = new Animals("Cheetah", "Mammals", 11, 0, 100, R.drawable.cheetah);
        Animals Panda = new Animals("Panda", "Mammals", 20, 2, 220, R.drawable.panda);
        Animals Elephant = new Animals("Elephant", "Mammals", 55, 3, 13000, R.drawable.elephant);
        animalsList.add(Lion);
        animalsList.add(Tiger);
        animalsList.add(Cheetah);
        animalsList.add(Panda);
        animalsList.add(Elephant);

        Animals Chicken = new Animals("Chicken", "Birds", 6, 3, 2, R.drawable.chicken);
        Animals Eagle = new Animals("Eagle", "Birds", 20, 0, 15, R.drawable.eagle);
        Animals Parrot = new Animals("Parrot", "Birds", 50, 1, 3, R.drawable.parrot);
        Animals Toucan = new Animals("Toucan", "Birds", 20, 2, 1, R.drawable.toucan);
        Animals Duck = new Animals("Duck", "Birds", 8, 3, 3, R.drawable.duck);
        animalsList.add(Chicken);
        animalsList.add(Eagle);
        animalsList.add(Parrot);
        animalsList.add(Toucan);
        animalsList.add(Duck);

        Animals Anchovy = new Animals("Anchovy", "Fish", 1, 1, 1, R.drawable.anchovy);
        Animals Albacore = new Animals("Albacore", "Fish", 10, 0, 2, R.drawable.albacore);
        Animals Mackerel = new Animals("Mackerel", "Fish", 5, 2, 3, R.drawable.mackerel);
        Animals Bonito = new Animals("Bonito", "Fish", 3, 1, 2, R.drawable.bonito);
        Animals Sardine = new Animals("Sardine", "Fish", 1, 3, 1, R.drawable.sardine);
        animalsList.add(Anchovy);
        animalsList.add(Albacore);
        animalsList.add(Mackerel);
        animalsList.add(Bonito);
        animalsList.add(Sardine);

        Animals Alligator = new Animals("Alligator", "Reptiles", 40, 0, 500, R.drawable.alligator);
        Animals Snake = new Animals("Snake", "Reptiles", 9, 1, 350, R.drawable.snake);
        Animals Turtle = new Animals("Tutle", "Reptiles", 60, 2, 50, R.drawable.turtle);
        Animals lguana = new Animals("Green Lguana", "Reptiles", 20, 3, 4, R.drawable.lguana);
        Animals leopard = new Animals("Leopard", "Reptiles", 15, 0, 10, R.drawable.leopard);
        animalsList.add(Alligator);
        animalsList.add(Snake);
        animalsList.add(Turtle);
        animalsList.add(lguana);
        animalsList.add(leopard);

        return animalsList;
    }

}
