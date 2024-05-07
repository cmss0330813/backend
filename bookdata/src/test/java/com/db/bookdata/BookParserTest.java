package com.db.bookdata;


import com.db.bookdata.parse.ReadLineContext;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookParserTest {
    @Autowired
    ReadLineContext<Book> bookReadLineContext;

    @Autowired
    BookDAO bookDAO;

    @Autowired
    BookService bookService = new BookService(bookReadLineContext, bookDAO);

    @Test
    public void addAllTest() throws IOException {
        String filename="/Users/cmss0/DATA_모음/2019_after전처리.csv";
        //bookDAO.deleteAll();
        int cnt=bookService.insertBook(filename);
        assertEquals(cnt, bookDAO.getCount());
    }

    @Test
    public void deleteAllTest(){
        bookDAO.deleteAll();
        assertEquals(0, bookDAO.getCount());
    }

}
