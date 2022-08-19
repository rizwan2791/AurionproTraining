package com.aurionpro.model;

public class ProtoTypeDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		BookShop bs=new BookShop();
		bs.setShopName("Maharashtra");
		bs.loadData();
		System.out.println(bs);
		BookShop bs1=(BookShop)bs.clone();
		
		bs1.setShopName("Novelty");
		System.out.println(bs1);
	}

}
