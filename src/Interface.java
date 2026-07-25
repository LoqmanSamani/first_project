public class Interface{
	public static void main(String[] args){
		// interface: a blueprint for a class that specifies a set of 
		// abstract methods that implementing classes must define
		// supports multiple inheritance-like behaviour

		FISH fish = new FISH();
		Hawk hawk = new Hawk();
		RABBIT rabbit = new RABBIT();

		fish.flee();
		fish.hunt();
		hawk.hunt();
		rabbit.flee();
	}
}
