package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Bai2 extends AppCompatActivity {
    // Bài2
    FloatingActionButton fab2;
    ImageView img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);
        addControls();

        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {onBackPressed();}
        });
    }

    public void addControls(){
        fab2 = (FloatingActionButton) findViewById(R.id.fab2);
        img2 = (ImageView) findViewById(R.id.img2);
        img2.setBackgroundResource(R.drawable.animation2);

    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        AnimationDrawable frameAnimation2 = (AnimationDrawable) img2.getBackground();

        if(hasFocus){
            frameAnimation2.start();
        }
        else {
            frameAnimation2.stop();
        }
    }

}