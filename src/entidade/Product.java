package entidade;

public class Product {

	public String name;
	public double price;
	public int quantity;

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void rmvProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name
				+ ", $ "
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " units, "
				+"Total: $ "
				+ String.format("%.2f", totalValueInStock())
				; 
		
		
	}
}

// perdeu 3 seguidas 
// ganhou 1
// 



