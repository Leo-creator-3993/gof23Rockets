package com.future.rocket.gof23.adapter.iface;

import com.future.rocket.gof23.adapter.enums.FileType;

public interface MediaPlayer {
    void play(FileType fileType, String fileName);
}
