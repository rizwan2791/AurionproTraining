package com.aurionpro.java;

public class Main {

	public static void main(String[] args) {
		IDaoAbstructFactory factory =DaoFactoryProducer.getInstance().produce("Xml");
		IDAO dao=factory.createDao("emp");
		dao.save();

	}

}
