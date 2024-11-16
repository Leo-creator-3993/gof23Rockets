package com.future.rocket.gof23.adapter.impl;

import com.future.rocket.gof23.adapter.iface.AdvancedMediaPlayer;

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Foo play vlc media, fileName: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // do nothing...
    }
}
