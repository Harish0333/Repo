package com.task1;

public class EnumTest3 
{
	enum Mobile
	{
	samsung, motorola, realme, mi, vivo;
	}
	public static void main(String[] args) {
	Mobile samsung = Mobile.samsung;
	samsung = Mobile.realme;
	System.out.println(samsung);
	}
}
