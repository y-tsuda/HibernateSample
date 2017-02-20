/**
 * BookSaverSample.java * TECHSCORE Java Hibernate 2章
 *
 * Copyright (c) 2005 Four-Dimensional Data, Inc.
 */
package com.techscore.hibernate;
/**
 * Book オブジェクトを永続化するサンプル
 */
public class BookSaverSample {
    public static void main(String args[]) {
        BookDao bookDao = new BookDao();

        Book book = new Book();
        book.setIsbn("ISBN4-7561-4340-7");
        book.setName("ゼロから始めるJava 増補改訂版");
        book.setPrice(1905);
//        bookDao.save(book);
//
//        Book book2 = new Book();
//        book2.setIsbn("ISBN4-7561-4383-0");
//        book2.setName("ゼロから始めるJSP/サーブレット");
//        book2.setPrice(2095);
//        bookDao.save(book2);

        for(Book b: bookDao.selectAll(book)){
        	System.out.println("isbn=" + b.getIsbn() + ",name=" + b.getName() + ",price=" + b.getPrice());
        }

    }
}