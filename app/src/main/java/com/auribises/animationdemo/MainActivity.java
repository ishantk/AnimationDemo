package com.auribises.animationdemo;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button btnSubmit;
    ImageView imageView;

    void initViews(){
        btnSubmit = (Button)findViewById(R.id.button);
        imageView = (ImageView)findViewById(R.id.imageView);

        //Animation animation = AnimationUtils.loadAnimation(this,R.anim.myanim);
        //Animation animation = AnimationUtils.loadAnimation(this,R.anim.youranim);

        //btnSubmit.startAnimation(animation);
        //imageView.startAnimation(animation);

        AnimationDrawable drawable = (AnimationDrawable) imageView.getBackground();
        drawable.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

    }
}
