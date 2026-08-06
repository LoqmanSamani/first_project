public class AUTO{
	String model;
	int year;
	Engine engine;
	AUTO(String model, int year, String engineType){
		this.model = model;
		this.year = year;
		this.engine = new Engine(engineType);
	}
	void start(){
		this.engine.start();
		System.out.printf("The %d %s is running.%n", this.year, this.model);
	}
	
}
