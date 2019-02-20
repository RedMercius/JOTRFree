package com.jotr_neo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button comedyButton;
    Button scifiButton;
    Button thrillerButton;
    Button westernButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        comedyButton = findViewById(R.id.comedyButton);
        scifiButton = findViewById(R.id.scifiButton);
        thrillerButton = findViewById(R.id.thrillerButton);
        westernButton = findViewById(R.id.westernButton);

        comedyButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                final Intent i = new Intent(MainActivity.this, ComedyActivity.class);
                startActivity(i);
            }
        });

        scifiButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                final Intent i = new Intent(MainActivity.this, SciFiActivity.class);
                startActivity(i);
            }
        });

        thrillerButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                final Intent i = new Intent(MainActivity.this, ThrillerActivity.class);
                startActivity(i);
            }
        });

        westernButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                final Intent i = new Intent(MainActivity.this, WesternActivity.class);
                startActivity(i);
            }
        });

        comedyButton.requestFocus();

        CurrentArtist.getInstance().init(this);
        AdapterState.getInstance().init(this);
    }
}
