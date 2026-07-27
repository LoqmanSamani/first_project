public class Car2{

	private String model;
	// by adding a final we can set a fixed attribute
	// which is not writable
	// private final String model;
	private String color;
	private int price;

	Car2(String model, String color, int price){
		this.model = model;
		this.color = color;
		this.price = price;
	}

	@Override
	public String toString(){
		return "A $" + this.price + " " + this.color + " " + this.model;
	}

	// getters
	String getModel(){
		return this.model;
	}
	String getColor(){
		return this.color;
	}
	String getPrice(){
		return "$" + this.price;
	}

	// setters
	void setModel(String model){
		this.model = model;
	}
	void setColor(String color){
		this.color = color;
	}
	void setPrice(int price){
		if (price < 0){
			System.out.println("price can not be less than zero");
		}else{
			this.price = price;
		}
	}
}
