package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        List<Product> list = new ArrayList<>();

	        list.add(new Product("Tv", 900.00));
	        list.add(new Product("Tablet", 450.00));
	        list.add(new Product("Notebook", 1200.00));

	        
	        Comparator<Product> comp = new Comparator<Product>() {

				@Override
				public int compare(Product p1, Product p2) {
					return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
				}
	        	
	        };
	        
	        list.sort(comp);

	        for(Product p : list ){
	            System.out.println(p);
	        }
	}
}
