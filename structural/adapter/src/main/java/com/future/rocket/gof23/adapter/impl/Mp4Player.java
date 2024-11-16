package com.future.rocket.gof23.adapter.impl;

import com.future.rocket.gof23.adapter.iface.AdvancedMediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        // do nothing...
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Foo play mp4 media, fileName: " + fileName);
    }
}
