package nongsan.webmvc.dao.impl;

import java.util.List;
import nongsan.webmvc.model.Product;
import org.hibernate.Session;

public class ProductDaoImpl extends GenericDaoImpl<Product, Integer> {

    public List<Product> getProductById(int id) {
        return null;
    }

    public List<Product> searchByName(String productName) {
        Session session = getSession();
        return session.createQuery("from Product where productName = ?").setParameter(0, productName).list();
    }
}
