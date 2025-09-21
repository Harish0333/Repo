package com.task;

public class Bread extends Food 
{
	protected int tastyScore = 8;
	protected String type = "vegetarian";
	public Bread(double proteins, double fats, double carbs) 
	{
		super(proteins, fats, carbs);
	}

	@Override
	public void getMacroNutrients() 
	{
		System.out.println(" A slice of bread has"+this.proteins+" gms of protein,"+this.fats+" gms of fats and "+this.carbs+" gms of carbohydrates.");
		
	}

}
