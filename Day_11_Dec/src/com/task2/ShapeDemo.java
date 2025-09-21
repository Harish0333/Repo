package com.task2;
/*Create a BLC class Named as Shape and it have three sub classes named as Circle, 
 * Triangle and Square for each class have two methods called as draw() and erase()

Main class named as ShapeDemo

For Shape class
Methods: 
public static Shape randshape()
No Argument constructor

randshape(): Using switch ((int)Math.randome()*3) 
case 0: create an object for Circle Object using return
case 1: create an object for Square Object using return
case 2: create an object for Triangle Object using return
default: Print as default message
finally return an object for Shape class

Use this class to test your solution's class and methods in main method
For Shape class

Methods: In draw():void and erase():void and No argument constructor
draw(): print "shape draw" 
erase(): print "Shape erase"

For Circle class sub class of Shape class
Methods: In draw():void and erase():void and No argument constructor
Override:
draw() method print "Circle draw" and erase() method print "Circle erase"

For Triangle class sub class of Shape class
Methods: In draw():void and erase():void and No argument constructor
Override:
draw() method print "Triangle draw" and erase() method print "Triangle erase"

For Square class sub class of Shape class
Methods: In draw():void and erase():void and No argument constructor
Override:
draw() method print "Square draw" and erase() method print "Square erase"*/
public class ShapeDemo 
{
	public static void main(String[] args) 
	{
		Shape shape = Shape.randshape();
        shape.draw();
        shape.erase();
    }
}
