package singlelevel.Supermethod;

class Shape
{
	protected int x; //x = 10
	
	public Shape(int x) //x = 10
	{
	  this.x= x;
	  System.out.println("x value is :"+this.x);
	}	
}
class Square extends Shape
{
	public Square(int side)  //side = 10
	{
		super(side);
	}
	
	public void getSquareArea()
	{
		System.out.println("Area of Square :"+(x*x));
	}	
}

public class SuperDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square ss = new Square(10);
	       ss.getSquareArea();

	}

}
