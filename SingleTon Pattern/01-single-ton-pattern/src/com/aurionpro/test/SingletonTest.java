package com.aurionpro.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.aurionpro.model.Singleton;

public class SingletonTest {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream("./lib/test.txt");
		ObjectOutputStream out = new ObjectOutputStream(file);
		out.writeObject(Singleton.getInstance());
		file.close();
		
		

	}

}