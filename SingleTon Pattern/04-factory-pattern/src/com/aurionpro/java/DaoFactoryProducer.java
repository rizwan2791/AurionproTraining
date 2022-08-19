package com.aurionpro.java;
public class DaoFactoryProducer {
	static DaoFactoryProducer instance;

	DaoFactoryProducer() {

	}

	public static DaoFactoryProducer getInstance() {
		if (instance == null) {
			instance = new DaoFactoryProducer();
		}
		return instance;
	}
		
	public IDaoAbstructFactory produce(String factoryType) {
		if (factoryType =="Xml")
			return new XMLDaoFactory();
		else
			return new DBDaoFactory();
		
	
		
	}

}
