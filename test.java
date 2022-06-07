package com.assignment;

public class test {
public static void main(String[] args) {
	ProductService obj = new ProductService();
	System.out.println(obj.findMaxPriceProduct("cloths"));
	System.out.println(obj.getProductsByCategory(null));
	System.out.println(obj.findNameByCode(1));
	System.out.println(obj.getProductsByCategory("maggie"));
	System.out.println(obj.getProductsByCategory("cloths"));
}
}
