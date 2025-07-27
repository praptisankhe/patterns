package com.design.pattern.structural.adapter;

public class MediaAdapter implements  MediaPlayer{
    private AdvancedMediaPlayer advancedMediaPlayer;
    @Override
    public void play(String type, String name) {
       if(type.equalsIgnoreCase("Mp4"))
       {
           advancedMediaPlayer.playMp4(name);
        }

    }
        public  MediaAdapter(String type)
        {
            if(type.equalsIgnoreCase("Mp4")) {
                advancedMediaPlayer = new AdvancedMediaPlayer();
            }
    }
}
