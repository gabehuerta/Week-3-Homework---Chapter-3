import java.util.Scanner;

public class BMRprogram
{
	public static void main(String[] args)
	{       
	
	Scanner keyboard = new Scanner(System.in);
	int age;
	int weight;
	int height;
	
	System.out.println("This program will calculate the number of 230 calorie candy bars to consume to maintain your weight");
	System.out.println("What is your age in years?");
	age = keyboard.nextInt();
	System.out.print("What is your weight in pounds?");
	weight = keyboard.nextInt();
	System.out.println("What is your total height in inches?");
	height = keyboard.nextInt();

	double caloriesMale, caloriesFemale;

	System.out.println("Enter M for male or W for female : ");
	String sex = keyboard.next();
	
	boolean maleSex = false;
	boolean femaleSex = false;

	if(sex.equals("M")) {
		maleSex = true;
	}
		else if(sex.equals("W")) {
			femaleSex = true;
	}
	if(maleSex) {
		caloriesMale = 655 + (4.3*weight) + (4.7*height) - (4.7*age);
		System.out.println("A male with those measurements should eat " +
			(caloriesMale / 230) +
			" candy bars per day to maintain her weight.");
	}
		else if(femaleSex) { 
			caloriesFemale = 66 + (6.3*weight) + (12.9*height) - (6.8*age);
			System.out.println("A female with those measurements should eat " +
				(caloriesFemale / 230) +
				" candy bars per day to maintain her weight.");
		} else {
			System.out.println("That is an invalid entry");
	}
	
   }

}




