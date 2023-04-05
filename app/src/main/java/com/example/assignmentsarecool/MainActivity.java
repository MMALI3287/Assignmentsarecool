package com.example.assignmentsarecool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button lab03;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setBackgroundColor(Color.rgb(241,184,184));
        setContentView(R.layout.activity_main);
        lab03 = (Button) findViewById(R.id.button6);
        lab03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClick(v);
            }
        });

    }
    public void onClick(View v){
        startActivity(new Intent(getApplicationContext(), SQLiteActivity.class));
    }

    public void btnClickMe_Click(View view) {

            Toast.makeText(this, "You have pressed 70 times. Stop Pressing", Toast.LENGTH_SHORT).show();
        }

}