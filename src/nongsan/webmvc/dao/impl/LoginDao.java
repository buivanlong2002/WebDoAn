package nongsan.webmvc.dao.impl;

import java.util.List;
import nongsan.webmvc.configdatabase.ConfigDatabaseOracle;

import nongsan.webmvc.model.User;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class LoginDao {

    public User checkLogin(String username, String password) {
        try {
            ConfigDatabaseOracle cf = new ConfigDatabaseOracle();
            Session session = cf.getSession();
            String hql = "FROM User where username=:username and password =:password";
            Query query = session.createQuery(hql);
            query.setParameter("username", username);
            query.setParameter("password", password);
            List<User> lst = query.list();
            session.close();
            if (lst.size() > 0) {
                return lst.get(0);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
