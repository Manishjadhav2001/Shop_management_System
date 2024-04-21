package shop_management_system;

import java.util.Scanner;

public class TestDrive {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		Shop shop=new Shop();
		
		int choice;
        do {
            // Display menu
            System.out.println("\nShop management system:");
            System.out.println("1.Add product");
            System.out.println("2.remove product");
            System.out.println("3.Add customer");
            System.out.println("4.remove customer");
            System.out.println("5.search Product By Name");
            
            System.out.println("6.display All Products");
            System.out.println("7.display All Customer");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            
            // Read user choice
            choice = scanner.nextInt();
            
            // Process user choice
            switch (choice) {
            case 1:
            	    addProduct(scanner, shop);
                    break;
            case 2:
            	    removeProduct(scanner,shop);
                    break;
            case 3:
            	    addCustomer(scanner,shop);
                    break;
            case 4:
            	    removeCustomer(scanner,shop);
                    break;
            case 5:
            	    searchProductByName(scanner,shop);
            	    break;
            	    
            case 6:
                     shop.displayAllProducts();
                    break;
            case 7:
            	      shop.displayAllCustomers();
            	      break;
            case 8:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 6.");
        }
    } while (choice != 8);
        
	}
	
	
	
	private static void addProduct(Scanner scanner, Shop shop) {
		System.out.println("Enter product details(id,name,price,quantity");
		String productId=scanner.next();
		String productName=scanner.next();
		double price=scanner.nextDouble();
		int quantityAvailable=scanner.nextInt();
		Product product=new Product(productId, productName, price, quantityAvailable);
		shop.addProduct(product);
		System.out.println("Successfully product is added");
		
	}
	
	private static void removeProduct(Scanner scanner, Shop shop) {
		System.out.println("Enter product details(id)");
		String productId=scanner.next();
		shop.removeProduct(productId);
		System.out.println("remove succesfully");
		
		
	}
	
	private static void addCustomer(Scanner scanner, Shop shop) {
		System.out.println("Enter customer details(id,name,price,quantity");
		String customerId=scanner.next();
		String customerName=scanner.next();
		String contactNumber=scanner.next();
		
		Customer customer=new Customer(customerId, customerName, contactNumber);
		shop.addCustomer(customer);
		System.out.println("Successfully customer is added");
		
	}
	
	private static void removeCustomer(Scanner scanner, Shop shop) {
		System.out.println("Enter customer details(id)");
		String customerId=scanner.next();
		shop.removeProduct(customerId);
		System.out.println("remove customer succesfully");
		
	}


	 private static void searchProductByName(Scanner scanner, Shop shop) {
	        System.out.println("Enter product name:");
	        String productName = scanner.next();
	      
	         Product product = shop.searchProductByName(productName);
	         if (product != null) {
	             System.out.println("Product found: " + product);
	         } else {
	             System.out.println("Product not found.");
	         }
	    }

	
	

	
	

}
