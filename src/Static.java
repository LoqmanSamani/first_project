public class Static{
	public static void main(){
		// static: makes a variable or method belong to the class
		// rather than to any specific object
		// commently used for utility methods or shared resources.
		Friend friend1 = new Friend("Saman");
		Friend friend2 = new Friend("Salman");
		Friend friend3 = new Friend("Ali");

		Friend[] friends = {friend1, friend2, friend3};

		for (int i = 0; i < 3; i++){

			System.out.println(friends[i].name);
			System.out.println(friends[i].numOfFriends);// this outputs 3 due to static 
			// specifier of numOfFreinds in Freind.java class
		}
		// instead of accessing a static variable through created 
		// instances (e.g., friends[i].numOfFriends), it's better to
		// access them through the class 
		System.out.println(Friend.numOfFriends); // this will output all the created instances
		// of Freind class, in this case 3.

		Friend.showFriends();
	
	}
}
