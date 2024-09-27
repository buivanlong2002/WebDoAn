/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nongsan.webmvc.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import nongsan.webmvc.configdatabase.ConfigDatabaseOracle;
import org.hibernate.Session;

/**
 *
 * @author QUANGBV
 */
public class GenericDaoImpl<T, ID extends Serializable> extends ConfigDatabaseOracle {

    private Class<T> persistentClass;

    public GenericDaoImpl() {
        this.persistentClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    public void insert(T t) {
        Session session = getSession();
        session.save(t);
        session.close();
    }

    public void edit(T t) {
        Session session = getSession();
        session.update(t);
        session.close();
    }

    public void delete(int id) {
        Session session = getSession();
        session.delete(get(id));
        session.close();
    }

    public T get(int id) {
        Session session = getSession();
        Object user = (Object) session.get(persistentClass, id);
        session.close();
        return (T) user;
    }

    public List<T> getAll() {
        Session session = getSession();
        List<T> user = session.createCriteria(persistentClass).list();
        session.close();
        return user;
    }

    public T get(String name) {
        return null;
    }

}
