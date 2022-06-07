package com.assignment;


	import java.util.ArrayList;

	public class ProductService {

		public static String findNameByCode(int num) {
			for (int i = 0; i < Productrepo.abc.length; i++) {
				if (Productrepo.abc[i].getProductCode() == num) {
					return Productrepo.abc[i].getName();
				}
			}
			return "null";
		}

		public static Product findMaxPriceProduct(String category) {
			double maxPrice = Double.MIN_VALUE;
			int index = -1;
			for (int i = 0; i < Productrepo.abc.length; i++) {
				
				if (Productrepo.abc[i].getCategory().equals(category) && Productrepo.abc[i].getPrice() > maxPrice) {
					
					maxPrice = Productrepo.abc[i].getPrice();
					index = i;
				}
			}
			if (index == -1) {
				return null;
			} else {
				return Productrepo.abc[index];
			}
		}

		public static Product[] getProductsByCategory(String category) {
			ArrayList<Product> list=new ArrayList<Product>();
			
			for(int i=0; i<Productrepo.abc.length; i++) {
				if(Productrepo.abc[i].getCategory().equals(category)) {
					list.add(Productrepo.abc[i]);
				}
			}
			if(list.isEmpty()) {
				return null;
			}
			else {
				Product[] arr=list.toArray(new Product[list.size()]);
				return arr;
			}
			
			
		}

	}

