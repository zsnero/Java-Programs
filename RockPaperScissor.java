import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {
	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		int i = 0;

		while(i==0) {

		String choice;
		String hand[] = {"rock","paper","scissor"};
		Random rand = new Random();
		choice = hand[rand.nextInt(hand.length)];

		System.out.println("rock, paper, scissor or quit? ");
		String uchoice = scanner.nextLine();

		if(uchoice.equals(choice)) {

			System.out.println(choice);
			System.out.println("Draw");
		}
		else if(uchoice.equals("paper") && choice.equals("rock")) {
			System.out.println(choice);
			System.out.println("You Win");
		}
		else if(uchoice.equals("rock") && choice.equals("paper")) {
			System.out.println(choice);
			System.out.println("Loser!");
		}
		else if(uchoice.equals("paper") && choice.equals("scissor")) {
			System.out.println(choice);
			System.out.println("Loser!");
	    }
		else if(uchoice.equals("scissor") && choice.equals("paper")) {
			System.out.println(choice);
			System.out.println("You Win");
	    }
		else if(uchoice.equals("rock") && choice.equals("scissor")) {
			System.out.println(choice);
			System.out.println("You Win");
	    }
		else if(uchoice.equals("scissor") && choice.equals("rock")) {
			System.out.println(choice);
			System.out.println("Loser");
	    }
	    else if(uchoice.equals("quit")) {
	    	i++;
	    }

	    else {
	    	System.out.println("Invalid input, choose between 'rock', 'paper', 'scissor' and 'quit' ");
	    }

	   }
	}    
}
