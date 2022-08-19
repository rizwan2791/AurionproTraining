package com.aurionpro.java;

public class XMLDaoFactory implements IDaoAbstructFactory {

	@Override
	public IDAO createDao(String str) {
		if (str == "emp")
			return new XMLEmpDao();
		else
			return new XMLDeptDao();
	}

}
