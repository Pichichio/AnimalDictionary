package com.example.doantruong.animatejava;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MammalDetails extends AppCompatActivity {
    private ImageView imageViewMammal;
    private AnimationDrawable mammalAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mammal_details);
        imageViewMammal = (ImageView) findViewById(R.id.animationMammal);
        if (imageViewMammal == null) throw new AssertionError();
        imageViewMammal.setVisibility(View.VISIBLE);
        imageViewMammal.setBackgroundResource(R.drawable.mammal_animation);
        mammalAnimation = (AnimationDrawable) imageViewMammal.getBackground();
        mammalAnimation.start();
    }
}
