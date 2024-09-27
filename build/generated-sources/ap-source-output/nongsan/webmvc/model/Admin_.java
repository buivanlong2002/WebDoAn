package nongsan.webmvc.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Admin.class)
public abstract class Admin_ {

	public static volatile SingularAttribute<Admin, String> password;
	public static volatile SingularAttribute<Admin, String> name;
	public static volatile SingularAttribute<Admin, Integer> id;
	public static volatile SingularAttribute<Admin, String> username;

	public static final String PASSWORD = "password";
	public static final String NAME = "name";
	public static final String ID = "id";
	public static final String USERNAME = "username";

}

