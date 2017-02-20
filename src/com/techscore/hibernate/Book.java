/**
 * Book.java * TECHSCORE Java Hibernate 2章
 * Copyright (c) 2005 Four-Dimensional Data, Inc.
 */
package com.techscore.hibernate;

/**
 * 「本」を表す POJO。
 */
public class Book {
    private String isbn = null;

    private String name = null;

    private int price = -1;

    /**
     * @return isbn を戻します。
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @param isbn
     *            isbn を設定。
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * @return name を戻します。
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *            name を設定。
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return price を戻します。
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price
     *            price を設定。
     */
    public void setPrice(int price) {
        this.price = price;
    }
}