package com.example.heyyy.activities;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.heyyy.Domain.trading;
import com.example.heyyy.R;
import com.example.heyyy.adpater.HourlyAdapters;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    RecyclerView recyclerView;
    List<trading> items =new ArrayList<>();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Initialize the adapter and pass the list of items
        HourlyAdapters adapterHourly = new HourlyAdapters((ArrayList<trading>) items);

//        setVarible();

        recyclerView = findViewById(R.id.viewitems);
        recyclerView.setLayoutManager (new LinearLayoutManager( this, LinearLayoutManager. HORIZONTAL, false));
        recyclerView.setAdapter (adapterHourly);
        initRecyclerview();
    }


//    private void setVarible() {
//        TextView next7daysBtn=findViewById(R.id.buttn);
//        next7daysBtn.setOnClickListener(v -> startActivity(new Intent(page));
//    }

    private void initRecyclerview() {

        items.add(new trading("apple","422.23","152.93","+0.67%" , "applogo" ,"graphwave"   ));

        items.add(new trading("apple","422.23","152.93","+0.67%" , "applogo" ,"graphwave"   ));

        items.add(new trading("apple","422.23","152.93","+0.67%" , "applogo" ,"graphwave"   ));

        items.add(new trading("apple","422.23","152.93","+0.67%" , "applogo" ,"graphwave"   ));

        items.add(new trading("apple","422.23","152.93","+0.67%" , "applogo" ,"graphwave"   ));

    }
}
