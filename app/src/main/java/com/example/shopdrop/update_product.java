package com.example.shopdrop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class update_product extends AppCompatActivity {

    private Button update;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_product);
        update=(Button) findViewById(R.id.new_edit);
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent Intent=new Intent(update_product.this, product_view.class);
                startActivity(Intent);

            }
        });
    }
}