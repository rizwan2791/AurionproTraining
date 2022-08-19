package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{
	private String shopName;
	List<Book> books=new ArrayList<>();
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	public void loadData() {
		for(int i=1;i<=10;i++) {
			Book b=new Book();
			b.setbId(i);
			b.setbName("Book"+i);
			books.add(b);
		}
		
	}
	
	@Override
	protected BookShop clone() throws CloneNotSupportedException {
		BookShop bs =new BookShop();
		for(Book b :this.getBooks()) {
			bs.books.add(b);
		}
		return bs;
	}
	@Override
	public String toString() {
		return "BookShop [shopName=" + shopName + ", books=" + books + "]";
	}
	
	

}
