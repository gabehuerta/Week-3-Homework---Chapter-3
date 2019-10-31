import java.util.Scanner;

public class ProfaneCatDog
{
	public static void main(String[] args)
	{       

	Scanner keyboard = new Scanner(System.in);
	System.out.println("Please enter a sentence");
	System.out.println("Note: If the sentence contains the words cat, dog, or llama it will be labeled as profane!");

	String sentence = keyboard.nextLine();
	sentence = sentence.toLowerCase();

	boolean animalProfane = false;

	if(sentence.contains("cat") || sentence.contains("dog") || sentence.contains("llama"))  {
		animalProfane = true;
	}
		
	if(animalProfane) {
		System.out.println(" Profane ");
	} else {
		System.out.println(" Not Profane ");
	}

   }

}

