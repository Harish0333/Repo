package com.task1;
/*Design a Java program to simulate a zoo environment using parameterized constructors and a copy constructor to model 
 the relationship between the Animal and Enclosure classes. Each Enclosure object should house specific animals.

Instructions:
Create a Animal class with private attributes for the animal's name, species, and age. 
Implement a parameterized constructor to set these attributes.

Develop an Enclosure class with private attributes for the enclosure's name, size, 
and an Animal object representing the inhabitant. Implement a parameterized constructor for the Enclosure class.

Implement a copy constructor for the Enclosure class to perform a deep copy of the Animal object 
when duplicating an enclosure. Ensure that modifications to the animals in the copied enclosure 
do not affect the original enclosure and vice versa.

Write a ZooSimulation class with a main method to demonstrate the use of these constructors. 
Create an instance of an Animal, an Enclosure containing that animal, 
and then use the copy constructor to duplicate the enclosure. 
Display information from both the original and duplicated enclosures.

Discuss the importance of deep copying in this scenario, considering the preservation of the 
"Has-A" relationship between the Animal and Enclosure classes.*/
public class Animal 
{
	private String name;
	private String species;
	private int age;
	
	public Animal(String name, String species, int age) 
	{
		super();
		this.name = name;
		this.species = species;
		this.setAge(age);
	}

	public String getName() {
		return name;
	}

	public String getSpecies() {
		return species;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", species=" + species + ", age=" + getAge() + "]";
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
