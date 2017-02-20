/**
 * BookDao.java * TECHSCORE Java Hibernate 2章
 * Copyright (c) 2005 Four-Dimensional Data, Inc.
 */
package com.techscore.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Book を扱う Dao
 */
public class BookDao extends DaoSupport {
    public void save(Book book) {
        Session session = getSession();
        Transaction transaction = session.beginTransaction();

        session.save(book);
        transaction.commit();
        session.close();
    }

    @SuppressWarnings("unchecked")
	public List<Book> selectAll(Book book){

    	Session session = getSession();
    	Query q = session.createQuery("from Book as b where b.ISBN = ?1");
    	q.setParameter(0, book.getIsbn());
    	System.out.println(q.getQueryString());
    	return session.createCriteria(Book.class).list();
    }


}