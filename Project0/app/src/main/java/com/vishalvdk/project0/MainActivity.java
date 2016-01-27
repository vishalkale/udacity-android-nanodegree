package com.vishalvdk.project0;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        findViewById(R.id.btn_streamer).setOnClickListener(this);
        findViewById(R.id.btn_score).setOnClickListener(this);
        findViewById(R.id.btn_library).setOnClickListener(this);
        findViewById(R.id.btn_bigger).setOnClickListener(this);
        findViewById(R.id.btn_reader).setOnClickListener(this);
        findViewById(R.id.btn_capstone).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id){
            case R.id.btn_streamer:
                Toast.makeText(getApplicationContext(),"This button will launch Spotify Streamer app.",Toast.LENGTH_LONG).show();
                break;

            case R.id.btn_score:
                Toast.makeText(getApplicationContext(),"This button will launch Scores app.",Toast.LENGTH_LONG).show();
                break;

            case R.id.btn_library:
                Toast.makeText(getApplicationContext(),"This button will launch Library app.",Toast.LENGTH_LONG).show();
                break;

            case R.id.btn_bigger:
                Toast.makeText(getApplicationContext(),"This button will launch Build it Bigger app.",Toast.LENGTH_LONG).show();
                break;

            case R.id.btn_reader:
                Toast.makeText(getApplicationContext(),"This button will launch XYZ Reader app.",Toast.LENGTH_LONG).show();
                break;

            case R.id.btn_capstone:
                Toast.makeText(getApplicationContext(),"This button will launch My Capstone app.",Toast.LENGTH_LONG).show();
                break;
        }
    }
}
