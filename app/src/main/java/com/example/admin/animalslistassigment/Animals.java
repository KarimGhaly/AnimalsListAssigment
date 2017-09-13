package com.example.admin.animalslistassigment;

/**
 * Created by Admin on 9/12/2017.
 */

public class Animals {
    String Name;
    String Category;
    int Age;
    int ViewType;
    int Weight;
    int ImageID;

    public int getImageID() {
        return ImageID;
    }

    public void setImageID(int imageID) {
        ImageID = imageID;
    }

    public Animals(String name, String category, int age, int viewType, int weight, int imageID) {

        Name = name;
        Category = category;
        Age = age;
        ViewType = viewType;
        Weight = weight;
        ImageID = imageID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getViewType() {
        return ViewType;
    }

    public void setViewType(int viewType) {
        ViewType = viewType;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }

}
