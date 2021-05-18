package dotinstall;

import java.util.Random;
import java.util.Scanner;

public class MyApp {
	public static void main(String[] args) {
		int answer = new Random().nextInt(10) + 1;
		int count = 0;

		while(true) {
			System.out.print("Your guess?");
			int guess = new Scanner(System.in).nextInt();
			count++;

			if(answer == guess) {
				System.out.println("Bingo! It Tooks " + count + "guesses");
				break;
			}else if(answer < guess) {
				System.out.println("The answer is lower!");
			}else {
				System.out.println("The answer is higher!");
			}
		}
	}
}
