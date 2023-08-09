package com.example.domain;

import java.io.Serializable;

public class User implements Serializable {
    private String username;
    private String password;
    private String name;
    private int age;
    private String email;
    private boolean permission;
    public User(){}

    public User(String username, String password, String name, int age ) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.age = age;
        permission =false;
        email=username+"@gmailcom";
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", permission=" + permission +
                '}';
    }
    public String getEmail(){
        return email;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isPermission() {
        return permission;
    }

    public void setPermission(boolean permission) {
        this.permission = permission;
    }
}
