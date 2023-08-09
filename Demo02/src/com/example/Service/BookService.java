package com.example.Service;

import com.example.domain.Book;

import java.util.ArrayList;
import java.util.List;

public interface BookService {
    void add();
    void delBYid(int id);
    void edit(int id);
    com.example.domain.Book selectOneById(int id);
    List<Book> selAll();
}
