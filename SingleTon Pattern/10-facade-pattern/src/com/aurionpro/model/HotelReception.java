package com.aurionpro.model;

public class HotelReception {
	public void getIndianMenu() {
		IHotel indHotel=new IndianHotel();
		IMenu indMenu=indHotel.getMenu();
		indMenu.ShowMEnu();
	}
	public void getChineseMenu() {
		IHotel chiHotel=new ChineseHotel();
		IMenu chiMenu=chiHotel.getMenu();
		chiMenu.ShowMEnu();
	}
	public void getItalianMenu() {
		IHotel itHotel=new ItalianHotel();
		IMenu itMenu=itHotel.getMenu();
		itMenu.ShowMEnu();
	}

}
