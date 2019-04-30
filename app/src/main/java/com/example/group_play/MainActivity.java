package com.example.group_play;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void send(View view) {
        Intent intent = new Intent(this, WifiP2p.class);
        intent.putExtra("flag","1");
        startActivity(intent);
    }

    public void receive(View view) {

        Intent intent = new Intent(this, WifiP2p.class);
        intent.putExtra("flag","0");
        startActivity(intent);
    }
}
