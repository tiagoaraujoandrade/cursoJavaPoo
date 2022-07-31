package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Price: ");
		double price = sc.nextDouble();
		System.out.println("Quantity in stock: ");
		int quantity = sc.nextInt();
		Product product = new Product(name, price, quantity);

		product.setName("Computer");
		System.out.println("Updated product: "+product.getName());
		product.setPrice(1300);
		System.out.println("Updated price: "+product.getPrice());
		
		
		System.out.println();
		System.out.println("Product data: "+product);
				
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data:"+product);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed in stock: ");
		quantity = sc.nextInt();
		product.rmvProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data:"+product);
		
		sc.close();
	}

}