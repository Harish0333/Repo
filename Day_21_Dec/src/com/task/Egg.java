package com.task;

public class Egg extends Food 
{
	int tastyScore = 7;
	String type = "non-vegetarian";
	public Egg(double proteins, double fats, double carbs) 
	{
		super(proteins, fats, carbs);
	}

	@Override
	public void getMacroNutrients() 
	{
		System.out.println("An egg has "+this.proteins+" gms of protein, "+this.fats+" gms of fats and "+this.carbs+" gms of carbohydrates.");
		
	}
	
}
