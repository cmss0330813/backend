package com.db.bookdata;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
@Slf4j
public class BookDAO {
    private final DataSource dataSource;
    private final JdbcTemplate jdbcTemplate;

    public BookDAO(DataSource dataSource, JdbcTemplate jdbcTemplate) {
        this.dataSource = dataSource;
        this.jdbcTemplate = jdbcTemplate;
    }

    public void add(final Book book) {

        String sql = "insert into book "+"(?, ?, ?, ?, ?, ?)";
        this.jdbcTemplate.update(sql,
                book.getId(),
                book.getStuGrade(),
                book.getStuDept(),
                book.getBookName(),
                book.isMajor(),
                book.getGanre());
    }

    public int deleteAll() {
        return this.jdbcTemplate.update("delete from book");
    }

    public int getCount() {
        return this.jdbcTemplate.queryForObject(
                "select count(*) from book", Integer.class
        );
    }
}
