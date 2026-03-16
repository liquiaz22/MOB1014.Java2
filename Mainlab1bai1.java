package com.example.lab1;
import java.util.ArrayList;
public class Mainlab1bai1 {
	 public static void main(String[] args) {

	        ArrayList<Product> listProduct = new ArrayList<Product>();

	        Product p1 = new Product("Ao01", "Ao thun", 10);
	        listProduct.add(p1);

	        listProduct.add(new Product("Ao02", "Ao so mi", 12));

	        listProduct.add(new ImportedProduct("Q01", "Quan tay", 15, 0.1, 1));
	        listProduct.add(new ImportedProduct("Q02", "Quan jean", 20, 0.15, 1));
	        listProduct.add(new ImportedProduct("Q03", "Quan dui", 3, 0.15, 1));

	        System.out.println("DANH SACH SAN PHAM");

	        for (Product p : listProduct) {
	            System.out.println(p + " | Final Price = " + p.finalPrice());
	        }

	        Product maxProduct = listProduct.get(0);

	        for (Product p : listProduct) {
	            if (p.finalPrice() > maxProduct.finalPrice()) {
	                maxProduct = p;
	            }
	        }

	        System.out.println("\nSAN PHAM CO GIA CAO NHAT");
	        System.out.println(maxProduct + " | Final Price = " + maxProduct.finalPrice());

	    }
}
