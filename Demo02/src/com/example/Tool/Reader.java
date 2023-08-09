package com.example.Tool;

import com.example.domain.Book;
import com.example.domain.Order;
import com.example.domain.User;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Reader {
     public static ArrayList<Book> readbook(){
         ObjectInputStream ois= null;
         ArrayList<Book> booklist=new ArrayList<>();
         try {
             ois= new ObjectInputStream(new FileInputStream("book.txt"));
            ArrayList<Book> books= (ArrayList<Book>) ois.readObject();
            for (Book b:books){
                booklist.add(b);
            }
         } catch (IOException e) {
             throw new RuntimeException(e);
         } catch (ClassNotFoundException e) {
             throw new RuntimeException(e);
         } finally {
             try {
                 if (ois!=null){
                     ois.close();
                 }
             } catch (IOException e) {
                 throw new RuntimeException(e);
             }
         }
         return booklist;
     }
     public static ArrayList<Order> readOrder(){
         ObjectInputStream ois1= null;
         ArrayList<Order> orders=new ArrayList<>();
         try {
             ois1= new ObjectInputStream(new FileInputStream("order.txt"));
             ArrayList<Order> orderlist= (ArrayList<Order>) ois1.readObject();
             for (Order o:orderlist){
                 orders.add(o);
             }
         } catch (IOException e) {
             throw new RuntimeException(e);
         } catch (ClassNotFoundException e) {
             throw new RuntimeException(e);
         } finally {
             try {
                 if (ois1!=null){
                     ois1.close();
                 }
             } catch (IOException e) {
                 throw new RuntimeException(e);
             }
         }
         return orders;
     }
    public static ArrayList<User> readUser(){
        ObjectInputStream ois1= null;
        ArrayList<User> users=new ArrayList<>();
        try {
            ois1= new ObjectInputStream(new FileInputStream("user.txt"));
            ArrayList<User> userlist= (ArrayList<User>) ois1.readObject();
            for (User o:userlist){
                users.add(o);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (ois1!=null){
                    ois1.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return users;
    }
}
