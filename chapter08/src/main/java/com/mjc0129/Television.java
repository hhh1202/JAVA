package com.mjc0129;

public class Television implements RemoteControl, RemoteControl4, RemoteControl5{
    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }
    @Override
    public void turnOff(){

    }

    @Override
    public void setVolume(int volume) {

    }

    @Override
    public void setMute(boolean mute) {
        RemoteControl4.super.setMute(mute);
    }
}
