package com.mjc_0206;

public class Member {
    public String id;

    public Member(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member target) {
            if(id.equals(target)) {
                return true;
            }
        }
        return false;
    }
}
