package com.example.Service.Impl;

import com.example.Service.OrderService;
import com.example.Tool.Reader;
import com.example.Tool.Writer;
import com.example.domain.Order;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderServiceImpl implements OrderService {
    public static Scanner sc=new Scanner(System.in);

    ArrayList<Order> orders=Reader.readOrder();


    public void addorder(){
        for (Order o:orders){
            System.out.println(o.toString());
        }
        Order order=new Order();
        System.out.println("输入要购买的书名");
        order.setBook_name(sc.next());
        System.out.println("输入价格");
        order.setPrice(sc.nextDouble());
        System.out.println("输入数量");
        order.setCount(sc.nextInt());
        int id=orders.get(orders.size()-1).getId();
        order.setId(++id);
        orders.add(order);
    }

    @Override
    public void upload() {
        Writer.Writeorder(orders);
    }

    @Override
    public void download() {
        for (Order o:orders){
            System.out.println(o.toString());
        }
    }
    public static void close(){
        sc.close();
    }
}
