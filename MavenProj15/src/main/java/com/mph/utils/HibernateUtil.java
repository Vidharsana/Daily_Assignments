package com.mph.utils;



import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory sessionFactory = buildSessionFactory();

	public static final SessionFactory buildSessionFactory() {
		try {

			Properties props=new Properties();
			props.load(HibernateUtil.class.getClassLoader().getResourceAsStream("application.properties"));
			Configuration cfg=new Configuration();
			cfg.setProperties(props);
			cfg.addAnnotatedClass(com.mph.entities.Product.class);
			cfg.addAnnotatedClass(com.mph.entities.Laptop.class);
			cfg.addAnnotatedClass(com.mph.entities.Bottle.class);
			cfg.addAnnotatedClass(com.mph.entities.Vehicle.class);
			cfg.addAnnotatedClass(com.mph.entities.Car.class);
			cfg.addAnnotatedClass(com.mph.entities.Bike.class);
			cfg.addAnnotatedClass(com.mph.entities.Food.class);
			cfg.addAnnotatedClass(com.mph.entities.ContinentalFood.class);
			cfg.addAnnotatedClass(com.mph.entities.IndianFood.class);

			StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
					.applySettings(cfg.getProperties());
			return cfg.buildSessionFactory(builder.build());
		} catch (Exception e) {
			throw new ExceptionInInitializerError();
		}

	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
