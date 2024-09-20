package com.dl.abs;

abstract class Product{
	
	int productPrice;
	int productDiscount;
	
	public void getOffer(int offer) {
		
		productDiscount = productPrice - offer;
		
		System.out.println("After the dicount: " + productDiscount);
	}
	
	public void productCustomer(String cName, String cAddress) {
		System.out.println(cName);
		System.out.println(cAddress);
	}
}

public class ProductImpl extends Product{

	public static void main(String[] args) {
		
		ProductImpl productImpl = new ProductImpl();
		
		productImpl.productPrice = 10000;
		
		productImpl.productCustomer("Sai Kiran", "Hyd");
		
		productImpl.getOffer(1000);
		
	}
}