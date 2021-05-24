package com.example.testdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity14 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MyTwoAdapter myTwoAdapter = new MyTwoAdapter(R.layout.item_edittext);
        recyclerView.setAdapter( myTwoAdapter);
        List<TextBean> list=new ArrayList<>();
        for (int i=0;i<40;i++){
            list.add(new TextBean());
        }
        myTwoAdapter.setNewInstance(list);
        //recyclerView.setAdapter( new MyAdapter());
    }
}