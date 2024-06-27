package com.example.calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class mul extends AppCompatActivity {
    EditText ed1,ed2;
    AppCompatButton b1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mul);
        ed1=(EditText) findViewById(R.id.one);
        ed2=(EditText) findViewById(R.id.two);
        b1=(AppCompatButton) findViewById(R.id.res);
        b1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View v) {
                try {
                    int a = Integer.parseInt(ed1.getText().toString());
                    int b = Integer.parseInt(ed2.getText().toString());
                    int c = a * b;
                    Toast.makeText(getApplicationContext(), Integer.toString(c), Toast.LENGTH_LONG).show();
                }catch(Exception e){
                    Toast.makeText(getApplicationContext(),e.toString(),Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}