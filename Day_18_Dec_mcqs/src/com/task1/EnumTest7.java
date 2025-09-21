package com.task1;
class Mobile
{
String str = "Samsung";
//private 
class Model
{
String model = "M51";
}
}
public class EnumTest7 {
	public static void main(String[] args) {
		Mobile mobile = new Mobile();
		Mobile.Model model = mobile.new Model();
		System.out.println(mobile.str+" "+model.model);
		}
}
