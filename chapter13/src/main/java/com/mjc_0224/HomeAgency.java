package com.mjc_0224;

public class HomeAgency implements Rentable<Home> {
    @Override
    public Home rent(){
        return new Home();
    }
}
