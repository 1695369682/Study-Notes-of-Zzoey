package com.example.Service.Impl;

import com.example.Service.BookService;
import com.example.Tool.Reader;
import com.example.Tool.Writer;
import com.example.domain.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookServiceImpl implements BookService {
    private static Scanner sc=new Scanner(System.in);
    ArrayList<Book> books= Reader.readbook();
    @Override
    public void add() {
        Book book=new Book();
        System.out.println("输入书名：");
        book.setBook_name(sc.next());
        System.out.println("输入作者");
        book.setAuthor(sc.next());
        System.out.println("输入单价");
        book.setPrice(sc.nextDouble());
        int id= getlastID();
        book.setId(++id);
        books.add(book);
        Writer.WriteBook(books);
    }
    //获取最后一本书的id
    public int getlastID(){
        return books.get(books.size()-1).getId();
    }
    @Override
    public void delBYid(int id) {
        if (id>0){
            boolean flag=false;
            for (Book b:books){
                if (b.getId()==id){
                    books.remove(b);
                    System.out.println("删除成功");
                    break;
                }
            }
        }
        else if (id<0){
            System.out.println("id不合法");
        }else {
            System.out.println("删除失败");
        }
    }

    @Override
    public void edit(int id) {
       Book book=selectOneById(id);
       if (book!=null){
           System.out.println("修改前"+book.toString());
           System.out.println("输入书名：");
           book.setBook_name(sc.next());
           System.out.println("输入作者");
           book.setAuthor(sc.next());
           System.out.println("输入单价");
           book.setPrice(sc.nextDouble());
           System.out.println("修改后"+book.toString());
       }else {
           System.out.println("图书不存在");
       }
    }

    @Override
    public Book selectOneById(int id) {
        if (id>0){
            for (Book b:books){
                if (id==b.getId()){
                    return b;
                }
            }
        }else {
            System.out.println("id不合法");
            return null;
        }
        return null;
    }

    @Override
    public List<Book> selAll() {
        return books;
    }
    public static void close(){
        sc.close();
    }
}
