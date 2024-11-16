package com.future.rocket.gof23.adapter.struct;

import com.future.rocket.gof23.adapter.enums.FileType;
import com.future.rocket.gof23.adapter.iface.AdvancedMediaPlayer;
import com.future.rocket.gof23.adapter.iface.MediaPlayer;
import com.future.rocket.gof23.adapter.impl.Mp4Player;
import com.future.rocket.gof23.adapter.impl.VlcPlayer;

public class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(FileType fileType) {
        if(FileType.MP4 == fileType) {
            advancedMediaPlayer = new Mp4Player();
        } else if (FileType.VLC == fileType) {
            advancedMediaPlayer = new VlcPlayer();
        } else {
            throw new UnsupportedOperationException("未支持的操作类型:" + fileType);
        }
    }

    @Override
    public void play(FileType fileType, String fileName) {
        if(FileType.MP4 == fileType) {
            advancedMediaPlayer.playMp4(fileName);
        } else if (FileType.VLC == fileType) {
            advancedMediaPlayer.playVlc(fileName);
        } else {
            System.out.println(String.format("Unsupported fileType: %s, fileName: %s", fileType, fileName));
        }
    }
}