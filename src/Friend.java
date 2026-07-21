public class Friend{

	String name;
	static int numOfFriends;
	// static here helps to track all
	// created instances of Friend

	Friend(String name){
		this.name = name;
		numOfFriends++;
	}

	static void showFriends(){
		System.out.printf("You have %d total friends!%n", numOfFriends);
	}
}
