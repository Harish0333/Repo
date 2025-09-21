package com.task1;

public class Enclosure 
{
	private String name;
	private double size; 
	private Animal inhabitant;
	
	public Enclosure(String name, double size, Animal inhabitant) 
	{
		super();
		this.name = name;
		this.size = size;
		this.inhabitant = inhabitant;
	}

	public Enclosure(Enclosure enclosure) 
	{
		this.name = enclosure.getName();
		this.size = enclosure.getSize();
		this.inhabitant = new Animal(enclosure.inhabitant.getName(),
									enclosure.inhabitant.getSpecies(),
									enclosure.inhabitant.getAge());
	}

	public String getName() 
	{
		return name;
	}

	public double getSize() 
	{
		return size;
	}
	
	public Animal getInhabitant() 
	{
		return inhabitant;
	}

	@Override
	public String toString() 
	{
		return "Enclosure [name=" + name + ", size=" + size + ", inhabitant=" + inhabitant + "]";
	}
	
}
