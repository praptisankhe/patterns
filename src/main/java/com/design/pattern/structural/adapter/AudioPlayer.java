package com.design.pattern.structural.adapter;


public class AudioPlayer implements MediaPlayer{

    private MediaAdapter mediaAdapter;
    @Override
    public void play(String type, String name) {

        if(type.equalsIgnoreCase("mp3"))
        {
            System.out.println("Playing the mp3 broh "+name);
        }
        else if(type.equalsIgnoreCase("mp4"))
        {
            mediaAdapter = new MediaAdapter(type);
            mediaAdapter.play(type,name);
        }
        else {
            System.out.println("Invalid format !:( ");
        }
    }
}
