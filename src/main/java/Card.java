package deckOfCards;

public class Card {
	private int suite, value;	//Represent the indexes of the Suite and Face value of the card
	private static String[] suites = {"Hearts","Spades","Clubs","Diamonds"};
	private static String[] faceValue = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
	
	public Card(int a, int b)	//Assign a Suite and Value to the card
	{
		this.suite = a;
		this.value = b;
	}
	
	public String getSuite() 	//Return the Suite of the card
	{
		return suites[suite];
	}
	
	public int getValue()		//Return the index of the card's Face Value
	{
		return value;
	}
	
	public String getFaceValue()	//Return the Face value of the card
	{
		return faceValue[value];
	}
	
	@Override
	public String toString()		//Return a string representation of the card
	{
		String output = getFaceValue() + " of " + getSuite();
		return output;
	}

}
