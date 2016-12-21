package com.example.doantruong.animatejava;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FishDetails extends AppCompatActivity {
    private ImageView imageViewFish;
    private AnimationDrawable fishAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fish_details);
        imageViewFish = (ImageView) findViewById(R.id.animationFish);
        if (imageViewFish == null) throw new AssertionError();
        imageViewFish.setVisibility(View.VISIBLE);
        imageViewFish.setBackgroundResource(R.drawable.fishdetail_animation);
        fishAnimation = (AnimationDrawable) imageViewFish.getBackground();
        fishAnimation.start();
    }
}
