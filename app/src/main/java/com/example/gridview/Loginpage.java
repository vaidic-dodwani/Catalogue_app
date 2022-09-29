package com.example.gridview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Loginpage extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);

        Button loginb=(Button)findViewById(R.id.loginb);
        loginb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Loginpage.this,"Welcome!! ",Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Loginpage.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
