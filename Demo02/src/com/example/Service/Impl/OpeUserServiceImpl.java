package com.example.Service.Impl;

import com.example.Service.OpeUserService;
import com.example.Service.OrderService;
import com.example.Tool.Reader;
import com.example.Tool.Writer;
import com.example.domain.User;

import java.util.ArrayList;
import java.util.Scanner;

public class OpeUserServiceImpl implements OpeUserService {
    ArrayList<User> users= Reader.readUser();
    Scanner sc=new Scanner(System.in);
    @Override
    public void regist() {
            System.out.println("输入用户名");
            String username =isexist();
            System.out.println("输入密码");
            String passwrod=sc.next();
            System.out.println("输入姓名");
            String name=sc.next();
            System.out.println("输入年龄");
            int age= sc.nextInt();
            User newuser=new User(username,passwrod,name,age);
            users.add(newuser);
            Writer.WriterUser(users);
            System.out.println("注册成功");
    }

    private String isexist() {
        while (true) {
            String username = sc.next();
            boolean exists = false; // 用于判断账户是否存在

            for (User u : users) {
                if (u.getUsername().equals(username)) {
                    System.out.println("账户已经存在,重新输入");
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                return username; // 如果账户不存在，则返回这个用户名
            }
        }
    }


    @Override
    public User login() {
        System.out.println("输入账号：");
        String username=sc.next();
        User U=getuser(username);
        if (U!=null){
            System.out.println("输入密码");
            int count=0;
            while (true){
                count++;
                String password=sc.next();
                if(U.getPassword().equals(password)&&U.isPermission()==true){
                    System.out.println("登录成功,欢迎您，管理员");
                    return U;
                } else if (U.getPassword().equals(password)&&U.isPermission()==false) {
                    System.out.println("登录成功，欢迎您");
                    return U;
                }else {if (count<5){
                    System.out.println("密码错误，重新输入");
                }else {
                    System.out.println("错误太多次，稍后再试");
                    return null;
                }
                }
            }
        }
        else {
            System.out.println("用户不存在,请注册");
            regist();
        }
        login();
        return null;
    }


    @Override
    public void user() {
        OrderService orderservice=new OrderServiceImpl();
        a:while (true){
            userui();
            System.out.println("选择");
            switch (sc.nextInt()){
                case 1:
                    //购买
                    orderservice.addorder();
                    break;
                case 2:
                    //提交订单
                    orderservice.upload();
                    break;
                case 3:
                    //下载订单
                    orderservice.download();
                    break ;
                case 0:
                    System.out.println("感谢使用");
                    break a;
            }
        }
    }
    private void userui(){
        System.out.println("------------------------");
        System.out.println("-----   1.购买   --------");
        System.out.println("-----   2.上传   --------");
        System.out.println("-----   3.下载   --------");
        System.out.println("-----   0.退出   --------");
        System.out.println("------------------------");
    }
    private User getuser(String id){
        for (User u:users){
            if (id.equals(u.getUsername())){
                return u;
            }
        }
        return null;
    }
}
