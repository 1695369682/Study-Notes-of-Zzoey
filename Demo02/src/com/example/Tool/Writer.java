package com.example.Tool;

import com.example.domain.Book;
import com.example.domain.Order;
import com.example.domain.User;

import java.io.*;
import java.util.ArrayList;

public class Writer {

    public static void WriteBook(ArrayList<Book> newbooks){
        ObjectOutputStream oos=null;
        try {
            oos=new ObjectOutputStream(new FileOutputStream("book.txt"));
            oos.writeObject(newbooks);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if (oos!=null){
                    oos.close();}
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        }
        public static void Writeorder(ArrayList<Order> orders){
            ObjectOutputStream oos=null;
            try {
                oos=new ObjectOutputStream(new FileOutputStream("order.txt"));
                oos.writeObject(orders);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }finally {
                try {
                    if (oos!=null){
                        oos.close();}
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        public static void WriterUser(ArrayList<User> users){
            ObjectOutputStream oos=null;
            try {
                oos=new ObjectOutputStream(new FileOutputStream("user.txt"));
                oos.writeObject(users);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }finally {
                try {
                    if (oos!=null){
                        oos.close();}
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
