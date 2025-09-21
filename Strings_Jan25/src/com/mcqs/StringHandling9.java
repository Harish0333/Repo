package com.mcqs;

public class StringHandling9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "NareshIT";
		String str1 = new String("NareshIT").intern();
		System.out.println(str == str1);
		System.out.println(str.equals(str1));
	}

}
