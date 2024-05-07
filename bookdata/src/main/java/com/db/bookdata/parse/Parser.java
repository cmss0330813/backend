package com.db.bookdata.parse;

public interface Parser<T> {
    T parse(String str);
}
