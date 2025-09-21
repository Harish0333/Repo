/*Write a Program on OOPs to define Fan class properties and behaviour.

properties :

name    : String
coil    : String
wings	: int

behaviour:

switchOn()  : public void
switchOff() : public void   */
public class Fan {
	String name;
	String coil;
	int wings;
	public void switchOn()
	{
		System.out.println("name is:"+name);
		System.out.println("coil is:"+coil);
		System.out.println("wings is:"+wings);
	}
	public void switchOff() 
	{
		System.out.println("fan is turned off");	
	}
	public static void main(String[] args) 
	{
		Fan bajaj=new Fan();
		bajaj.name="Bajaj electrical";
		bajaj.coil="copper";
		bajaj.wings=4;
		bajaj.switchOn();
		bajaj.switchOff();

	}

}
