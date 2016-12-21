package com.example.doantruong.animatejava;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AmphabianDetails extends AppCompatActivity {
    private ImageView imageViewAmphabian;
    private AnimationDrawable amphabianAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amphabian_details);
        imageViewAmphabian = (ImageView) findViewById(R.id.animationAmphabian);
        if (imageViewAmphabian == null) throw new AssertionError();
        imageViewAmphabian.setVisibility(View.VISIBLE);
        imageViewAmphabian.setBackgroundResource(R.drawable.amphabian_animation);
        amphabianAnimation = (AnimationDrawable) imageViewAmphabian.getBackground();
        amphabianAnimation.start();
    }
}
