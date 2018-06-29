package com.example.dell.assisment16;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "data is entered properly",Toast.LENGTH_SHORT).show();
                 Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.gmail.com"));
                startActivity(intent);

            }


        });
    }
}

