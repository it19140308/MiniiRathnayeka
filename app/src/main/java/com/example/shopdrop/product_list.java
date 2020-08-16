package com.example.shopdrop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class product_list extends AppCompatActivity {

    private Button EditButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);
        EditButton=(Button) findViewById(R.id.edit);
        EditButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent Intent=new Intent(product_list.this, update_product.class);
                startActivity(Intent);

            }
        });


    }
}