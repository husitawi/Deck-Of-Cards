package deckOfCards;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class DeckOfCards {
	public ArrayList<Card> Deck = new ArrayList<Card>();		//Create the Deck
	public ArrayList<Card> DealtCards = new ArrayList<Card>();	//Create the Dealt Deck
	
	public DeckOfCards()
	{
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=12;j++)
			{
				Deck.add(new Card(i,j));	//Populate the Deck
			}
		}
		shuffle();	//Shuffle the Deck after population to replicate a real deck
	}
	
	
	public Card dealOneCard()
	{
		Random rand = new Random();
		
		try{
			int randomCard = rand.nextInt(Deck.size());
			DealtCards.add( Deck.get(randomCard) );			//Add the selected card from the Deck to the Dealt Deck
			return Deck.remove(randomCard);					//Deal the selected card from the Deck
		}
		catch(IllegalArgumentException ex){
			return null;
		}
	}
	
	public void shuffle()
	{
		Collections.shuffle(Deck);			//Shuffle the Deck
	}
	
	public String getRemaining(ArrayList<Card> T)		//Calculate the remaining cards of every suite in the Deck
	{
		String output;
		String suite;
		int h=0, s=0, c=0, d=0;
		
		for(int k=0;k<T.size();k++)
		{
			suite = T.get(k).getSuite();

			switch(suite)
			{
			case "Hearts": h++;break;
			case "Spades": s++;break;
			case "Clubs": c++;break;
			case "Diamonds": d++;break;
			}
		}
		
		output = "There is " + h + " Hearts, " + s + " Spades, " + c + " Clubs, and " + d + " Diamonds. " + T.size() +" cards in total";
		return output;
	}
	
	public String inspect(int index)
	{
		return Deck.get(0).toString();		//Return the card on top of the Deck
	}
	
	public String inspect(ArrayList<Card> T)		//Return all the cards in the given deck
	{
		String output = "";
		String Hearts = "Hearts (";
		String Spades = "Spades (";
		String Clubs  = "Clubs (";
		String Diamonds = "Diamonds (";
		
		
		for(int i=0;i<T.size();i++)
		{
			switch(T.get(i).getSuite())
			{
			case "Hearts": Hearts+=T.get(i).getFaceValue()+" ";break;
			case "Spades": Spades+=T.get(i).getFaceValue()+" ";break;
			case "Clubs": Clubs+=T.get(i).getFaceValue()+" ";break;
			case "Diamonds": Diamonds+=T.get(i).getFaceValue()+" ";break;
			}
		}
		
		output = "\n"+Hearts +")"+"\n"+Spades+")"+"\n"+Clubs+")"+"\n"+Diamonds+")\n";
		return output;
	}
	
	
}
