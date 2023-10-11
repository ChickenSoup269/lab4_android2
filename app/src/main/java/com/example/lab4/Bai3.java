package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Bai3 extends AppCompatActivity {
    // Bài3
    FloatingActionButton fab3;
    ImageView img3;
    SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);
        addControls();
        addEvents();
    }
    public void addControls(){
        fab3 = (FloatingActionButton) findViewById(R.id.fab3);
        seekBar = (SeekBar) findViewById(R.id.seekBar);
        img3 = (ImageView) findViewById(R.id.img3);
        img3.setBackgroundResource(R.drawable.animation2);
    }
    public void addEvents(){
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                updateAnimationFrame(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });

        fab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {onBackPressed();}
        });
    }
    public void updateAnimationFrame(int progress) {
        // Cập nhật khung hình trên thanh seekBar | tỉ lệ với tổng số khung hình trong drawable
        AnimationDrawable frameAnimation2 = (AnimationDrawable) img3.getBackground();
        int totalFrames = frameAnimation2.getNumberOfFrames();
        int frameIndex = (progress * totalFrames) / seekBar.getMax();
        frameAnimation2.selectDrawable(frameIndex);
    }
}