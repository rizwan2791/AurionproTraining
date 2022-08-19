package com.aurionpro.java;

public class DBDaoFactory implements IDaoAbstructFactory {

	@Override
	public IDAO createDao(String str) {
		if (str == "dept")
			return new DBEmpDao();
		else
			return new DBDeptDao();
	}

}
