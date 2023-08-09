package com.example.Controller;


import com.example.Service.BookService;
import com.example.Service.Impl.BookServiceImpl;
import com.example.Service.Impl.OrderServiceImpl;
import com.example.Service.OrderService;
import com.example.Tool.Reader;
import com.example.domain.Book;
import com.example.domain.User;

import java.util.Scanner;

public class BookController {
            public void UI(){
                System.out.println("------------------------");
                System.out.println("-----   1.添加   --------");
                System.out.println("-----   2.删除   --------");
                System.out.println("-----   3.修改   --------");
                System.out.println("-----   4.查询   --------");
                System.out.println("-----   5.加单   --------");
                System.out.println("-----   6.上传   --------");
                System.out.println("-----   7.下载   --------");
                System.out.println("-----   0.退出   --------");
                System.out.println("------------------------");
            }
            BookService bookservice=new BookServiceImpl();
            public void service(){
                Scanner sc=new Scanner(System.in);

                OrderService orderservice=new OrderServiceImpl();
                a:while (true){

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    UI();
                    System.out.println("选择你的操作");
                    int cho=sc.nextInt();
                    switch (cho){
                        case 1:
                            bookservice.add();
                            break;
                        case 2:
                            System.out.println("输入你要删除的id");
                            int delid= sc.nextInt();
                            bookservice.delBYid(delid);
                            break;
                        case 3:
                            System.out.println("输入你要修改的id");
                            int ediid= sc.nextInt();
                            bookservice.edit(ediid);
                            break;
                        case 4:
                            select();
                            break;
                        case 5:
                            //新增订单
                            orderservice.addorder();
                            break;
                        case 6:
                            //上传
                            orderservice.upload();
                            break;
                        case 7:
                            //下载
                            orderservice.download();
                            break;
                        case 0:
                            //退出
                            System.out.println("退出登录");
                            break a;
                    }
                }
            }
            private void select(){
                Scanner sc=new Scanner(System.in);
                a:while (true){
                    System.out.println("查询的内容");
                    System.out.println("1.图书");
                    System.out.println("2.用户");
                    switch (sc.nextInt())
                    {
                        case 1:
                            for (Book b:bookservice.selAll()){
                                System.out.println(b.toString());
                            }
                            break a;
                        case 2:
                            for (User u: Reader.readUser()){
                                System.out.println(u.toString());
                            }
                            break a;
                    }
                    }
                }

            }
