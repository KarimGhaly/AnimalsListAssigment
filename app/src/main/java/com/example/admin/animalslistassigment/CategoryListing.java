package com.example.admin.animalslistassigment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CategoryListing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_listing);
        final List<String> categoryList = new ArrayList<>();
        categoryList.add("Mammals");
        categoryList.add("Birds");
        categoryList.add("Fish");
        categoryList.add("Reptiles");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,categoryList);
        ListView categoryListView = (ListView) findViewById(R.id.CategoryList);
        categoryListView.setAdapter(arrayAdapter);

        categoryListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(CategoryListing.this,AnimalsListing.class);
                intent.putExtra("Category_KEY",categoryList.get(position));
                startActivity(intent);
            }
        });

    }
}
