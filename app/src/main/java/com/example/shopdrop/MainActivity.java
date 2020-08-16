package com.example.shopdrop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button AddproductButton;
    private ImageView Inputproductimage;
    private EditText Inputproductname,Inputproductdescription,Inputproductprice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AddproductButton= (Button) findViewById(R.id.new_edit);
        Inputproductimage=(ImageView) findViewById(R.id.select_product_image);
        Inputproductname =(EditText) findViewById(R.id.product_name);
        Inputproductdescription =(EditText) findViewById(R.id.description);
        Inputproductprice =(EditText) findViewById(R.id.price);

        AddproductButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent Intent=new Intent(MainActivity.this, product_list.class);
                startActivity(Intent);

            }
        });

    }
}