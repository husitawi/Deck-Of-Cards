package deckOfCards;
import java.util.InputMismatchException;
import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	//Read user input
		DeckOfCards Deck = new DeckOfCards();
		String output = "";
		
		while(true)
		{
			System.out.print("\033[H\033[2J");  
		    System.out.flush(); 
			
		System.out.println("\nPlease select from the following options: ");
		System.out.println("1. Deal one card \n2. Shuffle the deck \n3. Check dealt cards \n4. Check remaining cards \n5. Inspect: \n	1. Next card\n	2. The remaining deck\n	3. The dealt cards\n6. End the program");
		if(output !="")
		{
			System.out.println("\nOutput: " + output);
		}
		System.out.print("Input(Example [3] or [51] ): ");
		int request;
		
		try{
			request = input.nextInt();
		}
		catch(InputMismatchException ex)
		{
			request = 9;
			input.next();
		}
		
		
		switch(request)
		{
		case 1: 
				try {
				output = Deck.dealOneCard().toString();
				}
				catch (NullPointerException ex) {
				output = "All cards have been dealt";	
				}
				break;
				
				
		case 2: Deck.shuffle();output="Deck has been shuffled";break;
		case 3: output = Deck.getRemaining(Deck.DealtCards);break;
		case 4: output = Deck.getRemaining(Deck.Deck);break;
		case 51: output = Deck.inspect(0);break;
		case 52: output = Deck.inspect(Deck.Deck);break;
		case 53: output = Deck.inspect(Deck.DealtCards);break;
		case 6: input.close();return;
		default: output = "Please enter a valid input";break;
		
		}
	
		
		
		}
		
		
	}
}
