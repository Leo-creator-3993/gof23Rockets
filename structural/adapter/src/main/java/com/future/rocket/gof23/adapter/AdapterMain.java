package com.future.rocket.gof23.adapter;

import com.future.rocket.gof23.adapter.enums.FileType;
import com.future.rocket.gof23.adapter.iface.MediaPlayer;
import com.future.rocket.gof23.adapter.impl.AudioPlayer;

public class AdapterMain {

    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new AudioPlayer();
        mediaPlayer.play(FileType.MP3, "海阔天空.mp3");
        mediaPlayer.play(FileType.MP4, "Raining.mp4");
        mediaPlayer.play(FileType.VLC, "绿光.vlc");
        mediaPlayer.play(null, "奔跑.avi");
    }
}
