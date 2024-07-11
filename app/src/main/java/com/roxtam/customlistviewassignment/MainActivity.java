package com.roxtam.customlistviewassignment;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private CustomAdapter customAdapter;
    private ArrayList<Model> modelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        modelList = new ArrayList<>();
        modelList.add(new Model("Laptop", "A portable computer for various tasks such as browsing, gaming, and programming"));
        modelList.add(new Model("Smartphone", "A handheld device that combines mobile phone capabilities with internet browsing and app functionalities"));
        modelList.add(new Model("Headphones", "A device worn on the ears that allows you to listen to audio privately"));
        modelList.add(new Model("Camera", "A device used to capture photos and videos"));
        modelList.add(new Model("Smartwatch", "A wearable device that offers smartphone-like functionalities on your wrist"));


        modelList.add(new Model("Apple", "A sweet red fruit"));
        modelList.add(new Model("Banana", "A yellow fruit that monkeys love"));
        modelList.add(new Model("Cherry", "A small, round red fruit"));
        modelList.add(new Model("Date", "A sweet brown fruit often found in deserts"));
        modelList.add(new Model("Elderberry", "A small, dark purple fruit used in jams and jellies"));


        modelList.add(new Model("Lion", "A large carnivorous feline animal, known as the king of the jungle"));
        modelList.add(new Model("Eagle", "A bird of prey with excellent vision and powerful flight"));
        modelList.add(new Model("Shark", "A large marine predator known for its sharp teeth and powerful jaws"));
        modelList.add(new Model("Elephant", "A large herbivorous mammal with a trunk and tusks, known for its intelligence and memory"));
        modelList.add(new Model("Dolphin", "A highly intelligent marine mammal known for its playful behavior and communication skills"));


        // Add more items here

        customAdapter = new CustomAdapter(this, modelList);
        listView.setAdapter(customAdapter);
    }
}