package com.example.Controller;

import com.example.Service.Impl.BookServiceImpl;
import com.example.Service.Impl.OpeUserServiceImpl;
import com.example.Service.Impl.OrderServiceImpl;
import com.example.Service.OpeUserService;
import com.example.Service.OrderService;
import com.example.domain.User;

import java.util.Scanner;

public class UserController {
    private static Scanner sc=new Scanner(System.in);
    private void UI(){
        System.out.println("---------*****---------");
        System.out.println("-------  1.登录  -------");
        System.out.println("-------  2.注册  -------");
        System.out.println("-------  3.退出  -------");
        System.out.println("---------*****---------");
    }
    public void home(){
        BookController con=new BookController();
        OpeUserService use=new OpeUserServiceImpl();

        a:while (true){
            UI();
            System.out.println("选择");
            switch (sc.nextInt()){
                case 1:
                    //登录
                    User u=use.login();
                    if (u.isPermission()){
                        con.service();
                    }else if (u.isPermission()==false){
                        //普通用户业务
                        use.user();
                    }else {
                        System.out.println("登录失败");
                        break a;
                    }
                    break;
                case 2:
                    //注册
                    use.regist();
                    break;
                case 3:
                    System.out.println("感谢使用");
                    sc.close();
                    break a;
            }
            if (iskeep())
            {
                System.out.println("主程序退出，再见");
                break;
            }
        }
    }

    private boolean iskeep(){
        System.out.println("返回主页面？Y/N");
        while (true){
            String cho= sc.next();
            if ("Y".equals(check(cho))){
                return false;
            }else if ("N".equals(check(cho))){
                return true;
                //退出
            }
            else {
                System.out.println("错误的选项");
            }
        }
    }
    private String check(String str){
        if (str.equals("Y")||str.equals("y")){
            return "Y";
        } else if (str.equals("N")||str.equals("n")) {
            return "N";
        }
        return "";
    }
}
