package com.example.Test;


import com.example.Controller.UserController;
import com.example.Tool.Init;

import java.io.IOException;


public class Test {
    public static void main(String[] args) {
        try {
            Init.init1();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        UserController u=new UserController();
        u.home();
    }
}
