package com.future.rocket.gof23.adapter.impl;

import com.future.rocket.gof23.adapter.enums.FileType;
import com.future.rocket.gof23.adapter.iface.MediaPlayer;
import com.future.rocket.gof23.adapter.struct.MediaAdapter;

public class AudioPlayer implements MediaPlayer {

    @Override
    public void play(FileType fileType, String fileName) {
        if (FileType.MP3 == fileType) {
            System.out.println("Foo use mp3 media, fileName: " + fileName);
        } else if (FileType.MP4 == fileType || FileType.VLC == fileType) {
            MediaAdapter mediaAdapter = new MediaAdapter(fileType);
            mediaAdapter.play(fileType, fileName);
        } else {
            System.out.println("Invalid fileType: " + fileType + ", fileName: " + fileName);
        }
    }
}
