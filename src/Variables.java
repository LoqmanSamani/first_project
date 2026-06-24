public class Variables {
    public static void main (String[] args) {
        // in this section we present
        // the concept of variable in java!

        // steps to create a variable:
        // 1. declaration
        // 2. assignment

        int age;
        int year;
        double distance;
        char my_init;
	boolean is_married;
	String my_name;


        age  = 25;
	year = 2026;
	distance = 26.7;
	my_init  = 'L';
	my_name = "Loqman";
	is_married  = false;
	
	if(is_married){
    		System.out.println("congradulations! you already fucked up :)");
       }else{
		System.out.println("you are the most free man i have ever seen in my live!!!");       
       }

        System.out.println(age);
	System.out.println(year);
	System.out.println(distance);
	System.out.println("the year is " + year);
	System.out.println("and i am " + age + " years old :)");
	System.out.println("my name is " + my_name + " and i am not married!");
	System.out.println(is_married);
	System.out.println(my_init);
    }
}
