package Task1;

import java.util.Scanner;
import java.util.Random;

public class NumberGame {

public static void main(String[] args) {
		//Initialization
		int min=1,max=20,minattempts=0,maxattempts=5;
		//RandomGenerator
		Random random = new Random();
		int rnd = random.nextInt(max-min+1)+min;
		//Scanner
		Scanner input =new Scanner(System.in);
		
	while(minattempts<maxattempts)
	{
		System.out.printf("Guess the Number Between %d and %d, You have %d attempts\n", min, max, maxattempts);
		int guess = input.nextInt();
		
	if(guess==rnd)
		{
		System.out.println("You Won");
		break;
		}
	else if(guess<rnd)
		{
		System.out.println("Too Low, Try again");
		minattempts++;
		}
	else if(guess>rnd)
		{
		System.out.println("Too High, Try again");
		minattempts++;
		}
	}
	//MaxAttempts✔️
	if(minattempts==maxattempts)
		{
		System.out.println("You Lost, Answer="+rnd);
		}
}
}