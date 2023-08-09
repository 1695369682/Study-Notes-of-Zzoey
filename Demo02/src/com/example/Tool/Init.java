package com.example.Tool;

import com.example.domain.Book;
import com.example.domain.Order;
import com.example.domain.User;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public  class Init {
    public static void init1() throws IOException {
            ArrayList<Book> books=new ArrayList<>();
            books.add(new Book(1,"西游记","吴承恩",88.8));
            books.add(new Book(2,"三国演义","罗贯中",108.8));
            books.add(new Book(3,"水浒传","施耐庵",108));
            books.add(new Book(4,"红楼梦","曹雪芹",70.8));
            books.add(new Book(5,"哈利波特与魔法石","JK.罗琳",112.5));
            books.add(new Book(6,"哈利波特与密室","JK.罗琳",126.3));
            books.add(new Book(7,"哈利波特与阿兹卡班的囚徒","JK.罗琳",136.9));
            books.add(new Book(8,"哈利波特与火焰杯","JK.罗琳",156));
            books.add(new Book(9,"哈利波特与凤凰社","JK.罗琳",188.4));
            books.add(new Book(10,"哈利波特与混血王子","JK.罗琳",206.3));
            books.add(new Book(11,"哈利波特与死亡圣器（全）","JK.罗琳",263.6));
        ObjectOutputStream oos=null;
            try {
               oos =new ObjectOutputStream(new FileOutputStream("book.txt"));
                oos.writeObject(books);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }  finally {
                if (oos!=null)
                oos.close();
            }

            ArrayList<Order> orders=new ArrayList<>();
            orders.add(new Order(5,"哈利波特与魔法石",112.5,10));
            orders.add(new Order(3,"水浒传",108,5));
            ObjectOutputStream oos01=null;
            try {
                oos01 =new ObjectOutputStream(new FileOutputStream("order.txt"));
                oos01.writeObject(orders);
            } catch (IOException e) {
            throw new RuntimeException(e);
             }  finally {
               if (oos01!=null)
                   oos01.close();
         }

            ArrayList<User> users=new ArrayList<>();
            User admin= new User("admin","admin","superadmin",20);
            admin.setPermission(true);
            users.add(admin);
            users.add(new User("zhangsan","666666","张三",18));
            users.add(new User("lisi","000000","李四",25));
        ObjectOutputStream oos02=null;
        try {
            oos02 =new ObjectOutputStream(new FileOutputStream("user.txt"));
            oos02.writeObject(users);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }  finally {
            if (oos02!=null)
                oos02.close();
        }
    }

}
