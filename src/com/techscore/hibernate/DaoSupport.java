/**
 * DaoSupport.java * TECHSCORE Java Hibernate 2章
 * Copyright (c) 2005 Four-Dimensional Data, Inc.
 */
package com.techscore.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Dao を補助するクラス
 */
public abstract class DaoSupport {
    protected Session getSession() {
        Configuration config = new Configuration().configure();
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession();
        return session;
    }
}