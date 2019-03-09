package com.example.group_play;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void send(View view) {
        Toast.makeText(this,"Sending works", Toast.LENGTH_LONG);
    }

    public void receive(View view) {
        Toast.makeText(this,"Recieving works", Toast.LENGTH_LONG);
    }
}
