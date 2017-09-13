package com.example.admin.animalslistassigment;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 9/13/2017.
 */

public class CustomAdapter extends ArrayAdapter<Animals> {
    Context context;
    int resource;
    ArrayList<Animals> animalsList;

    public CustomAdapter(Context context1, int resource1, ArrayList<Animals> animalsList) {
        super(context1, resource1, animalsList);
        this.context = context1;
        this.resource = resource1;
        this.animalsList = animalsList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        if(view == null)
        {
            switch (getItemViewType(position))
            {
                case 0:
                    view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_0,null);
                    break;
                case 1:
                    view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_1,null);
                    break;
                case 2:
                    view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_2,null);
                    break;
                case 3:
                    view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_3,null);
                    break;
            }

        }
        TextView txtName = (TextView) view.findViewById(R.id.txtName);
        TextView txtAge = (TextView) view.findViewById(R.id.txtAge);
        TextView txtCategory = (TextView) view.findViewById(R.id.txtCategory);
        TextView txtWeight = (TextView) view.findViewById(R.id.txtWeight);
        ImageView imgView = (ImageView) view.findViewById(R.id.IMGView);

        Animals a = getItem(position);
        if(a!= null)
        {
            txtName.setText("Name: "+a.getName());
            txtAge.setText("Average Age: "+a.getAge()+" Years");
            txtCategory.setText("Category: "+a.getCategory());
            txtWeight.setText("Weight: "+a.getWeight()+" lbs");
            imgView.setImageResource(a.getImageID());
        }
                return view;
    }

    @Override
    public int getViewTypeCount() {
        return 4;
    }

    @Override
    public int getItemViewType(int position) {
        Animals a =  animalsList.get(position);
        return a.getViewType();
    }
}
