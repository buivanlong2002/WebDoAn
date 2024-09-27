/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nongsan.webmvc.dao.impl;

import java.util.List;

/**
 *
 * @author QUANGBV
 */
public interface GenericDao<T> {

    void insert(T t);

    void edit(T t);

    void delete(int id);

    T get(int id);

    List<T> getAll();
}
