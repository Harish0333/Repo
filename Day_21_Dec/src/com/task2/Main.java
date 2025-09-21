package com.task2;
/*An abstract class "Cake" is given. Create a subclass called OrderedCake.
And check the working of it.

Meet the following requirements.
Modifiers of the class Cake : abstract, public

Attributes:
Attribute Name : shape Type:String Modifier:private
Attribute Name :flavour Type:String Modifier:private
Attribute Name :qty Type:int Modifier:private
Attribute Name :price Type:float Modifier:private
Constructor:(One only)
Modifier : protected
type : With 3 parameters shape,flavour,qty in the same order.

Methods :
Define setters and getters for all fields with protected Modifiers
Name of the method : showCake
Return Type : void
Modifier : protected.
Task : It must print data as per below format/example.
"A Round Vanilla Cake Of 2 Kg/Kg's Ready @ Rs.800/-"
Create an inherited class "OrderedCake". Inherit this from "Cake"
Define the following for the "OrderedCake" class
Attributes:
Attribute name : private String message;
Type : String
Modifier :private
Constructors:(3 only)
No argument Constructor : Ensure shape is Round, flavour is Vanilla,
qty is 1 kg and price is 400.
Parameterized public Constructor : For shape,flavour,qty
Parameterized public Constructor : For shape,flavour,qty and message.
Price is to be dynamically changed @400 per Kg.
Methods :
Name of Method : showCake() - Override this
Return type : void
Modifier : public
Task :Print the following if message is not null or empty
"A Round Vanilla Cake of 2 Kg/Kg's ready with message Happy Birth Day @ Rs.800/-".

Otherwise display the message from superclass.
Create CakeMain class to test the working of the above*/
public class Main {

	public static void main(String[] args) 
	{
		OrderedCake cake=new OrderedCake();
		cake.showCake();
		
		OrderedCake cake2=new OrderedCake("Heart","Black current",2);
		cake2.showCake();
		
		OrderedCake cake3=new OrderedCake("Round","vanilla",2,"Happy Fathers day");
		cake3.showCake();
	}

}
