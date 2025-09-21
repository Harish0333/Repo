 import java.util.Scanner;
public class CylinderSurfaceArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create Scanner object and read Radius and Height from the user
        // Close scanner
        //Calculate surface area of the cylinder using formula
        //print result
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Radius of Cyclinder:");
		int radius=sc.nextInt();  
		System.out.print("Enter the Height of Cyclinder:");
		int Height=sc.nextInt(); 
		sc.close();
		double pie=3.142;  
		double CylinderSurfaceArea=(2*pie*radius*Height)+(2*pie*(radius*radius));  
		System.out.println("Surface area of sphere="+CylinderSurfaceArea); 
    
	}

}
