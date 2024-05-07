package com.db.bookdata;

import lombok.*;


@Getter
@Setter
@NoArgsConstructor
public class Book {
    private int id;
    private int stuGrade;
    private String stuDept;
    private String bookName;
    private boolean isMajor;
    private String ganre;


    public Book(int stuGrade, String stuDept, String bookName, boolean isMajor, String ganre) {
        this.stuGrade = stuGrade;
        this.stuDept = stuDept;
        this.bookName = bookName;
        this.isMajor = isMajor;
        this.ganre = ganre;
    }


}
