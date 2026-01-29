package com.mjc0129;

public interface RemoteControl3 {
    int MAX_VOLUMN = 10;
    int MIN_VOLUMN = 0;

    void turnOn();
    void turnOff();
    void setVolume(int volume);
}
