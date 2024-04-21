package shop_management_system;

import java.util.ArrayList;

public class Customer {
	
	ArrayList<Product> purchasedProducts=new ArrayList();
	protected String customerId;
	protected String customerName;
	protected String contactNumber;
	
	
	public Customer( String customerId, String customerName,String contactNumber) {
		super();
		this.purchasedProducts = purchasedProducts;
		this.customerId = customerId;
		this.customerName = customerName;
		this.contactNumber = contactNumber;
	}


	


	public String getCustomerId() {
		return customerId;
	}


	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getContactNumber() {
		return contactNumber;
	}


	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	public void addProduct(Product product) {
        purchasedProducts.add(product);
    }
	
	 public void removeProduct(Product product) {
	        purchasedProducts.remove(product);
	    }
	 
	 public ArrayList<Product> displayProducts() {
	        return purchasedProducts;
	    }





	@Override
	public String toString() {
		return "Customer [purchasedProducts=" + purchasedProducts + ", customerId=" + customerId + ", customerName="
				+ customerName + ", contactNumber=" + contactNumber + "]";
	}
	

	
	
}
