package com.db.bookdata;

import com.db.bookdata.parse.ReadLineContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
@Configuration
public class BookService {

    private final ReadLineContext<Book> bookReadLineContext;
    private final BookDAO bookDAO;
    public BookService(ReadLineContext<Book> bookReadLineContext, BookDAO bookDAO) {
        this.bookReadLineContext = bookReadLineContext;
        this.bookDAO = bookDAO;
    }

    @Transactional
    public int insertBook(String filename) {
        final List<Book> bookList;
        try {
            bookList = bookReadLineContext.readByLine(filename);
            System.out.println("parsing is over");
            bookList.stream()
                    .parallel()
                    .forEach(book -> {
                        try {
                            this.bookDAO.add(book); //진짜 insert
                        }
                        catch (Exception e) {
                            System.out.printf("id:%d 문제발생 :\n"+book.getId());
                            throw new RuntimeException(e);
                        }
                    });
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        if(!Optional.of(bookList).isEmpty()) {
            return bookList.size();
        }
        else {
            return 0;
        }
    }
}
