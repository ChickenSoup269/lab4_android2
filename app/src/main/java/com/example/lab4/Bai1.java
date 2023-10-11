package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Bai1 extends AppCompatActivity {
    // Bài1
    FloatingActionButton fab1;
    ImageView img1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1);
        addControls();
    }
    public void addControls(){
        fab1 = (FloatingActionButton) findViewById(R.id.fab1);
        img1 = (ImageView) findViewById(R.id.img1);
        img1.setBackgroundResource(R.drawable.animation);

        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        AnimationDrawable frameAnimation = (AnimationDrawable) img1.getBackground();

       if(hasFocus){
            frameAnimation.start();
        }
        else {
            frameAnimation.stop();
        }
    }
}