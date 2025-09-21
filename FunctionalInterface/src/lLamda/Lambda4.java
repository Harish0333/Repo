package lLamda;

import java.util.Scanner;

public class Lambda4 {

	public static void main(String[] args) {
		Name n =  str -> str.startsWith("R");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Name :");
		String name = sc.next(); 
		System.out.println("Your name starts with 'R' :"+n.isStartWithR(name));
		sc.close();


	}

}
