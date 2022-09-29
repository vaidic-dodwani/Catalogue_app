package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;



public class details extends AppCompatActivity {

    ImageView imageview;
    TextView nameview;
    TextView priceview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details);

        imageview=findViewById(R.id.detailimage);
        nameview=findViewById(R.id.detailname);
        priceview=findViewById(R.id.detailprice);

        Intent intent=getIntent();
        if(intent.getExtras() != null){
            String selectedname= intent.getStringExtra("name");
            int selectedimage=intent.getIntExtra("image",0);
            String selectedprice=intent.getStringExtra("price");

            nameview.setText(selectedname);
            imageview.setImageResource(selectedimage);
            priceview.setText(selectedprice+" and some details here");



        }




    }
}