package com.mjc0129;

public class Audio2 implements RemoteControl3{
    private int volume;

    @Override
    public void turnOn(){
        System.out.println("Audio를 켭니다.");
    }

    @Override
    public void turnOff(){
        System.out.println("Audio를 끕니다. ");
    }

    @Override
    public void setVolume(int volume) {
        if(volume > RemoteControl3.MAX_VOLUMN){
            this.volume = RemoteControl3.MAX_VOLUMN;
        }else if(volume < RemoteControl3.MIN_VOLUMN) {
            this.volume = RemoteControl3.MIN_VOLUMN;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 Audio 볼륨 : " + this.volume);
    }
}
