package com.aurionpro.model;

import java.util.List;

public class HatTest {

	public static void main(String[] args) {
		Hat h = new Hat("Small", "hat", 200, 0.01);
		HatAdapter hatadpt = new HatAdapter(h);
		Biscuit bis = new Biscuit("ParleG", 10);
		Pepsi pip = new Pepsi("Pepsi", 100);
		ShoppingCart cart = new ShoppingCart();
		cart.addItemToCart(bis);
		cart.addItemToCart(pip);
		cart.addItemToCart(hatadpt);

		displayCartItems(cart);
		System.out.println("Cart Price : " + cart.getTotalPrice());

	}

	private static void displayCartItems(ShoppingCart cart) {
		List<IItem> cartList = cart.getItems();
		for (IItem i : cartList) {
			System.out.println("Item Name : " + i.getName());
			System.out.println("Item Price : " + i.getPrice());
		}

	}

}
