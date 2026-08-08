public class Product<T, U>{
	T item;
	U price;
	Product(T item, U price){
		this.item = item;
		this.price = price;
	}
	public void updateItem(T item){
		this.item = item;
	}
	public void updatePrice(U price){
		this.price = price;
	}
	public T getItem(){
		return this.item;
	}
	public U getPrice(){
		return this.price;
	}
}
