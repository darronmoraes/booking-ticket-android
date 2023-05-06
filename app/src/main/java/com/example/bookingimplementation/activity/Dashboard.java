package com.example.bookingimplementation.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.bookingimplementation.R;

public class Dashboard extends AppCompatActivity {

    SearchView searchViewDestination;
    RecyclerView recyclerViewDestination;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        configRecyclerView();
    }

    // Init views
    public void initViews() {
        searchViewDestination = findViewById(R.id.searchView_destination);
        recyclerViewDestination = findViewById(R.id.recyclerView_search_destination);
    }

    public void configRecyclerView() {
        recyclerViewDestination.setHasFixedSize(true);
        recyclerViewDestination.setLayoutManager(new LinearLayoutManager(this));
    }


}