package fileScanner;

public class Product {

	private String name;
	private double price;
	private Integer qnt;
	
	public Product(String name, double price, int qnt) {
		this.name = name;
		this.price = price;
		this.qnt = qnt;
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrince() {
		return price;
	}
	public void setPrince(double price) {
		this.price = price;
	}
	public int getQnt() {
		return qnt;
	}
	public void setQnt(int qnt) {
		this.qnt = qnt;
	}
	
	public double Total() {
		return price * qnt;
	}
	
	
}
