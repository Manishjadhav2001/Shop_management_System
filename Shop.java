package shop_management_system;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class Shop {
	
	    private HashMap<String, Product> products;
	    private HashMap<String, Customer> customers;
	    
	    
	     public Shop() {
	        products = new HashMap<>();
	        customers = new HashMap<>();
	    }
	    
	     public void addProduct(Product product) {
	         products.put(product.getProductId(), product);
	     }
	     
	     public void removeProduct(String productId) {
	         products.remove(productId);
	     }

	    public void addCustomer(Customer customer) {
	    	customers.put(customer.getCustomerId(),customer);
	    	}
	    	
	    public void removeCustomer(String customerId){
	    	customers.remove(customerId);
	    }
	    
	    public Product searchProductByName(String productName) {
	        for (Product product : products.values()) {
	            if (product.getProductName().equalsIgnoreCase(productName)) {
	                return product;
	            }
	        }
	        return null; // Product not found
	    }
	    
	    
	    public ArrayList<Product> searchProductByPriceRange(double minPrice, double maxPrice) {
	        ArrayList<Product> productsInRange = new ArrayList<>();
	        for (Product product : products.values()) {
	            if (product.getPrice() >= minPrice && product.getPrice() <= maxPrice) {
	                productsInRange.add(product);
	            }
	        }
	        return productsInRange;
	    }
	    
	    
	    public void displayAllProducts() {
	        System.out.println("All Products:");
	        for (Product product : products.values()) {
	            System.out.println(product);
	        }
	    }
	    
	    public void displayAllCustomers() {
	        System.out.println("All Customers:");
	        for (Customer customer : customers.values()) {
	            System.out.println(customer);
	        }
	    }
	    
	    }
	    

