package com.task2;

/*enum Course
{
Java, python, Spring, Testing;
private Course() {
System.out.println(25);
}
};
public class EnumTest {
public static void main(String[] args) {
/*for(String nit : Course.values())
{
System.out.println(c);
}
	System.out.println(Course.Java.name());
	System.out.println(Course.Spring.ordinal());
	System.out.println(Course.Spring.name());
	Course nit = Course.Java;
}
}*/
/*
enum Movie
{
Pathaan, Sir,Hit, Geme_over, Lost;
Movie() {
}
}
public class EnumTest
{
public static void main(String[] args) {
Movie movie[] = Movie.values();
for(Movie mov : movie)
{
System.out.println(mov);
}
}
}
public class EnumTest
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
}*/
enum Movie {
Pathaan, sir, Hit, Geme_over, Lost;
}
public class EnumTest {
public static void main(String[] args) {
System.out.println(EnumTest.getMovie("Sir"));
}
public static Movie getMovie(String s) {
return Enum.valueOf(Movie.class, s.toLowerCase());
}
public static Movie getMovie(int n){
return Movie.values()[n];
}
}