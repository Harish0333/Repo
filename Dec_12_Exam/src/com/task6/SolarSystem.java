package com.task6;
/*Questions 6
-------------
devlop a program on model celestial bodies in the solar system, specifically stars and planets. 

Star Class:
------------
properties:
 String name: (private)
Methods:
 shine():void:public: 
 generateLight(): void :Private :
create a Planet Class which is subclass of star class  
Attributes:
 diameter: double :private
 atmosphere: String :private
 numberOfMoons: int:private 
Methods:
 All having public as acesssible modifier and returntype is void
 rotate(): 
 rotate(int speed): 
 rotate(String direction): 
SolarSystemExample Class:
In the main method:
Create an instance of the Planet class named earth with the following attributes:
Access and print the attributes of the earth planet using appropriate getters.
Call the overridden rotate method of the earth planet.
Call the overloaded rotate methods of the earth planet with different parameters.
Call the shine method of the earth planet, which print the generateLight method details.
Output:
Planet: Earth
Diameter: 12742.0 km
Atmosphere: Nitrogen, Oxygen
Number of Moons: 1
Earth is rotating.
Earth is rotating at a speed of 5 units.
Earth is rotating in the counterclockwise direction.
Generating light...
Earth is shining brightly.
*/
public class SolarSystem 
{
	public static void main(String[] args) 
	{
	Planet p1=new Planet("Earth",12742.0, "Nitrogen, Oxygen", 1);
	System.out.println(p1);
	p1.rotate();
	p1.rotate(5);
	p1.rotate("counterclockwise");
	p1.generateLight();
	p1.shine();
	}
}
