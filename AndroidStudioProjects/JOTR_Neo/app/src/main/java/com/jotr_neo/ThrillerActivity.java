package com.jotr_neo;
/*
 * Copyright 2015 © Johnnie Ruffin
 *
 * Unless required by applicable law or agreed to in writing, software is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageButton;

public class ThrillerActivity extends AppCompatActivity {

    ImageButton nbBtn;
    ImageButton sgBtn;
    ImageButton wsBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thriller);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        nbBtn = findViewById(R.id.nbBtn);
        sgBtn = findViewById(R.id.sgBtn);
        wsBtn = findViewById(R.id.wsBtn);

        nbBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                final Intent i = new Intent(ThrillerActivity.this, SelectActivity.class);
                CurrentArtist.getInstance().setCurrentArtist("Night Beat");
                startActivity(i);
            }
        });

        sgBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                final Intent i = new Intent(ThrillerActivity.this, SelectActivity.class);
                CurrentArtist.getInstance().setCurrentArtist("Speed");
                startActivity(i);
            }
        });

        wsBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                final Intent i = new Intent(ThrillerActivity.this, SelectActivity.class);
                CurrentArtist.getInstance().setCurrentArtist("The Whistler");
                startActivity(i);
            }
        });

    }
    // TODO: Handle hard input button presses or joystick button presses.
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event){
        boolean handled = false;

        switch (keyCode){
            case KeyEvent.KEYCODE_DPAD_CENTER:
            case KeyEvent.KEYCODE_BUTTON_A:
                // ... handle selections
                handled = true;
                break;
            case KeyEvent.KEYCODE_DPAD_LEFT:
                // ... handle left action
                handled = true;
                break;
            case KeyEvent.KEYCODE_DPAD_RIGHT:
                // ... handle right action
                handled = true;
                break;
        }
        return handled || super.onKeyDown(keyCode, event);
    }
}