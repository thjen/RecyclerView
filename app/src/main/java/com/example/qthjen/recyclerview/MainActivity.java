package com.example.qthjen.recyclerview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    public void initView() {

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        /** deviderItemDecoration là dấu gạch phân cách giữa các hàng **/
    //    DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, layoutManager.getOrientation());
    //    recyclerView.addItemDecoration(dividerItemDecoration);

        /** custom divider decoration **/
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(), DividerItemDecoration.VERTICAL);
        Drawable drawable = ContextCompat.getDrawable(getApplicationContext(), R.drawable.custom_divider);
        dividerItemDecoration.setDrawable(drawable);
        recyclerView.addItemDecoration(dividerItemDecoration);

        /** event remove item list**/
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        ArrayList<MyData> list = new ArrayList<>();
        list.add(new MyData(R.drawable.ten, "My pet 1"));
        list.add(new MyData(R.drawable.thirteen, "My pet 2"));
        list.add(new MyData(R.drawable.three, "My pet 3"));
        list.add(new MyData(R.drawable.twelve, "My pet 4"));
        list.add(new MyData(R.drawable.two, "My pet 5"));

        DataAdapter dataAdapter = new DataAdapter(MainActivity.this, list, R.layout.row_recycler);
        recyclerView.setAdapter(dataAdapter);

    }

}
