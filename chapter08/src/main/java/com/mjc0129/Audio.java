package com.mjc0129;

public class Audio implements RemoteControl, RemoteControl5{
    @Override
    public void turnOn(){
        System.out.println("Audio를 킵니다");
    }

    @Override
    public void turnOff() {

    }

    @Override
    public void setVolume(int volume) {

    }

    @Override
    public void setMute(boolean mute) {
        RemoteControl5.super.setMute(mute);
    }
}
