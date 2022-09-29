package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;


import com.example.gridview.databinding.ActivityMainBinding;



public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



        String[] itemName = {"Bottle","Chair","Earphones","Laptop",
                "Oreo","Pen","Phone","Shoes","Sunglasses","Table"};
        int[] itemImages = {R.drawable.bottle,R.drawable.chair,R.drawable.earphones,R.drawable.laptop,R.drawable.oreo,R.drawable.pen,R.drawable.phone,
                R.drawable.shoes,R.drawable.sunglasses,R.drawable.table};
        String[] itemPrices = {"₹ 200","₹ 800","₹ 2000","₹ 50000","₹ 10","₹ 3","₹ 10000",
                "₹ 2800","₹ 1600","₹ 3000"};

        GridAdapter gridAdapter = new GridAdapter(MainActivity.this,itemName,itemImages,itemPrices);
        binding.gridView.setAdapter(gridAdapter);


        binding.gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {

                String selectedname=itemName[position];
                String selectedprice=itemPrices[position];
                int selectedimage=itemImages[position];

                Log.e("clicked item", "-------->"+itemName[position]+itemImages[position]+itemPrices[position]);


                startActivity(new Intent(MainActivity.this,details.class).putExtra("name",selectedname).putExtra("image",selectedimage).putExtra("price",selectedprice));
            }
        });

    }
}