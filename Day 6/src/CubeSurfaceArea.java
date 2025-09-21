import java.util.Scanner;
public class CubeSurfaceArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create Scanner object and read length of a cube from the user
        //Close scanner
        //calculate curved surface area of the cube
        //display results
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length of one side of the cube:");
		float a=sc.nextFloat();
		sc.close();
		float cube=6*(a*a);
		System.out.println("Area of the cube :"+cube);
	}

}
