package com.example.doantruong.animatejava;

import android.content.Context;
import android.media.MediaPlayer;

/**
 * Created by DOANTRUONG on 12/14/2016.
 */

public class SoundHelper {
    private MediaPlayer mMusicPlayer;

    public SoundHelper() {
    }

    public void prepareMusicPlayer(Context context) {
        mMusicPlayer = MediaPlayer.create(context.getApplicationContext(),
                R.raw.song);
        mMusicPlayer.setVolume(.5f, .5f);
        mMusicPlayer.setLooping(true);
    }

    public void playMusic() {
        if (mMusicPlayer != null) {
            mMusicPlayer.start();
        }
    }
}
