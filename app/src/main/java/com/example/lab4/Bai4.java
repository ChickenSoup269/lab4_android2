package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Bai4 extends AppCompatActivity {
    // Bài4
    FloatingActionButton fab4;
    ImageView img4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai4);
        addControls();

        fab4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {onBackPressed();}
        });
    }
    public void addControls(){
        fab4 =  (FloatingActionButton) findViewById(R.id.fab4);
        img4 = (ImageView) findViewById(R.id.img4);
        img4.setBackgroundResource(R.drawable.animation3);
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        AnimationDrawable frameAnimation2 = (AnimationDrawable) img4.getBackground();

        if(hasFocus){
            frameAnimation2.start();
        }
        else {
            frameAnimation2.stop();
        }
    }

}