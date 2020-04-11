package com.example.recyclerview.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.R;
import com.example.recyclerview.adapter.DemoRecyclerAdapter;
import com.example.recyclerview.model.DemoModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv_demo;
    ArrayList<DemoModel> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       rv_demo = findViewById(R.id.rv_demo);

        customData();


    }

    private void customData() {
        list = new ArrayList<>();
        DemoModel model = new DemoModel();
        model.setPlayer_name("Virat Kohli");
        model.setPlayer_run("50,000 runs");
        model.setPlayer_avg("65.78 avg");
        model.setPlayer_img(R.drawable.virat);
        list.add(model);

        DemoModel model1 = new DemoModel();
        model1.setPlayer_name("MS Dhoni");
        model1.setPlayer_run("90,000 runs");
        model1.setPlayer_avg("80.78 avg");
        model1.setPlayer_img(R.drawable.msd);
        list.add(model1);

        DemoModel model2 = new DemoModel();
        model2.setPlayer_name("Yuvi ");
        model2.setPlayer_run("20,000 runs");
        model2.setPlayer_avg("45.78 avg");
        model2.setPlayer_img(R.drawable.yuvi);
        list.add(model2);

        DemoModel model3 = new DemoModel();
        model3.setPlayer_name("R. Jadeja");
        model3.setPlayer_run("5,000 runs");
        model3.setPlayer_avg("35");
        model3.setPlayer_img(R.drawable.jadeja);
        list.add(model3);

        DemoRecyclerAdapter mAdapter = new DemoRecyclerAdapter(MainActivity.this, list);
        rv_demo.setAdapter(mAdapter);
        rv_demo.setLayoutManager(new LinearLayoutManager(MainActivity.this));
    }
}
