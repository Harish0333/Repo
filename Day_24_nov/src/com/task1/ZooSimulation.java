package com.task1;

public class ZooSimulation 
{
	public static void main(String[] args) 
	{
		Animal a=new Animal("Tiger","panther",8);
		Enclosure org=new Enclosure("Lion",100, a);
		Enclosure copy= new Enclosure(org);
				
			System.out.println("Original Enclosure:");
	        displayEnclosureInfo(org);

	        System.out.println("\nDuplicated Enclosure:");
	        displayEnclosureInfo(copy);

	        copy.getInhabitant().setAge(6);
	        
	        System.out.println("\nOriginal Enclosure after modification:");
	        displayEnclosureInfo(org);

	        System.out.println("\nDuplicated Enclosure after modification:");
	        displayEnclosureInfo(copy);
	}
	 private static void displayEnclosureInfo(Enclosure enclosure) 
	 {
	        System.out.println("Enclosure Name: " + enclosure.getName());
	        System.out.println("Enclosure Size: " + enclosure.getSize() + " sq. meters");
	        System.out.println("Animal Name: " + enclosure.getInhabitant().getName());
	        System.out.println("Animal Species: " + enclosure.getInhabitant().getSpecies());
	        System.out.println("Animal Age: " + enclosure.getInhabitant().getAge() + " years\n");
	 }
}
