/*Program 01
----------
Write a Program on OOPs to define Dog class properties and behaviour.

properties :

name    : String
height  : double
age	: int

behaviour:

getDogInformation() : public void
             bark() : public void    */
public class Dog {
	String name;
	int height;
	int age;
	public void getDogInformation() 
	{
		System.out.println("Dog name is :"+name);
		System.out.println("Dog height is :"+height);
		System.out.println("Dog age is :"+age);
	}
	public void  bark() 
	{
		System.out.println("active");
	}
	public static void main(String[] args) {
		Dog pug=new Dog();
		pug.name="Blake";
		pug.height=1;
		pug.age=2;
		pug.getDogInformation();
		pug.bark();
	}

}
