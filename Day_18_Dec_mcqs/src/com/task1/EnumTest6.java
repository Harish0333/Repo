package com.task1;

public class EnumTest6 {
	public static void main(String[] args) {
		System.out.println(EnumTest6.getMovie("Sir"));
		}
		public static Movie6 getMovie(String s) {
		return Enum.valueOf(Movie6.class, s.toLowerCase());
		}
		public static Movie6 getMovie(int n){
		return Movie6.values()[n];
		}
}
