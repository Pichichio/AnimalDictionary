package com.example.doantruong.animatejava;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewMonkey;
    private ImageView imageViewFish;
    private ImageView imageViewFrog;
    private ImageView imageViewPenguin;
    private ImageView imageViewCrocodile;
    private ImageView imageViewInsect;
    private AnimationDrawable monkeyAnimation;
    private AnimationDrawable fishAnimation;
    private AnimationDrawable frogAnimation;
    private AnimationDrawable penguinAnimation;
    private AnimationDrawable crocodileAnimation;
    private AnimationDrawable insectAnimation;
    private SoundHelper mSoundHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Monkey
        imageViewMonkey = (ImageView) findViewById(R.id.animationMonkey);
        if (imageViewMonkey == null) throw new AssertionError();
        imageViewMonkey.setVisibility(View.VISIBLE);
        imageViewMonkey.setBackgroundResource(R.drawable.monkey_animation);
//        imageViewMonkey.getLayoutParams().width = 900;
//        imageViewMonkey.getLayoutParams().height = 600;
        monkeyAnimation = (AnimationDrawable) imageViewMonkey.getBackground();
        monkeyAnimation.start();
        // Fish
        imageViewFish = (ImageView) findViewById(R.id.animationFish);
        if (imageViewFish == null) throw new AssertionError();
        imageViewFish.setVisibility(View.VISIBLE);
        imageViewFish.setBackgroundResource(R.drawable.fish_animation);
        fishAnimation = (AnimationDrawable) imageViewFish.getBackground();
        fishAnimation.start();
        // Frog
        imageViewFrog = (ImageView) findViewById(R.id.animationFrog);
        if (imageViewFrog == null) throw new AssertionError();
        imageViewFrog.setVisibility(View.VISIBLE);
        imageViewFrog.setBackgroundResource(R.drawable.frog_animation);
        frogAnimation = (AnimationDrawable) imageViewFrog.getBackground();
        frogAnimation.start();
        // Penguin
        imageViewPenguin = (ImageView) findViewById(R.id.animationPenguin);
        if (imageViewPenguin == null) throw new AssertionError();
        imageViewPenguin.setVisibility(View.VISIBLE);
        imageViewPenguin.setBackgroundResource(R.drawable.bird_animation);
        penguinAnimation = (AnimationDrawable) imageViewPenguin.getBackground();
        penguinAnimation.start();
        // Crocodile
        imageViewCrocodile = (ImageView) findViewById(R.id.animationCrocodile);
        if (imageViewCrocodile == null) throw new AssertionError();
        imageViewCrocodile.setVisibility(View.VISIBLE);
        imageViewCrocodile.setBackgroundResource(R.drawable.crocodile_animation);
        crocodileAnimation = (AnimationDrawable) imageViewCrocodile.getBackground();
        crocodileAnimation.start();
        // Insect
        imageViewInsect = (ImageView) findViewById(R.id.animationInsect);
        if (imageViewInsect == null) throw new AssertionError();
        imageViewInsect.setVisibility(View.VISIBLE);
        imageViewInsect.setBackgroundResource(R.drawable.insect_animation);
        insectAnimation = (AnimationDrawable) imageViewInsect.getBackground();
        insectAnimation.start();

        //SoundHelper
        mSoundHelper = new SoundHelper();
        mSoundHelper.prepareMusicPlayer(this);
        mSoundHelper.playMusic();
    }

    public void nextMammalDetail(View view) {
        Intent intent = new Intent(this, MammalDetails.class);
        startActivity(intent);
        Context context = getApplicationContext();
        CharSequence text = "Move to MammalDetails";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void nextAmphabianDetail(View view) {
        Intent intent = new Intent(this, AmphabianDetails.class);
        startActivity(intent);
        Context context = getApplicationContext();
        CharSequence text = "Move to AmphabianDetails";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void nextFishDetail(View view) {
        Intent intent = new Intent(this, FishDetails.class);
        startActivity(intent);
        Context context = getApplicationContext();
        CharSequence text = "Move to FishDetails";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
