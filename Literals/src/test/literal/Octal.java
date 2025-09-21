package test.literal;

public class Octal 
{
	public static void main(String[] args) 
	{
		int one = 01; 
		int six = 06;
		int seven = 07;
		int eight = 010;
		int nine = 011;
		int x=0111;//8*1+8*1+8*2
        System.out.println("Octal 01  = "+one);//1
        System.out.println("Octal 06  = "+six);//6
		System.out.println("Octal 07  = "+seven);//7
		System.out.println("Octal 010 = "+eight);//8
		System.out.println("Octal 011 = "+nine);//9
		System.out.println("X= "+x);//73
		System.out.println(Integer.toOctalString(15)); //17
	}
}
