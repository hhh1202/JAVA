package com.mjc_02;

public class User {
    private String id;
    private String role;

    public User(String id, String role) {
        this.id = id;
        this.role = role;
    }

    // 꺼내보기만 가능(Getter)
    public String getId() {
        return id;
    }

    // 꺼내보기만 가능(Getter)
    public String getRole() {
        return role;
    }
}
