package com.db.bookdata.parse;

import com.db.bookdata.Book;

public class BookParser implements Parser<Book>{
    @Override
    public Book parse(String str) {
        String[] splitted = str.split("\",\"");
        Book book = new Book();
        book.setId(Integer.parseInt(splitted[0].replace("\"","")));
        book.setStuGrade(Integer.parseInt(splitted[1]));
        book.setStuDept(splitted[2]);
        book.setBookName(splitted[3]);
        book.setMajor(Boolean.parseBoolean(splitted[7]));
        book.setGanre(splitted[8]);
        return book;
    }
    
}
