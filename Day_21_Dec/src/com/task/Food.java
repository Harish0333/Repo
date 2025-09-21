package com.task;

public abstract class Food 
{
	protected double proteins;
	protected double fats;
	protected double carbs;
	protected double tastyScore;

	public Food(double proteins, double fats, double carbs) 
	{
		super();
		this.proteins = proteins;
		this.fats = fats;
		this.carbs = carbs;
	}

	public abstract void getMacroNutrients();
}
