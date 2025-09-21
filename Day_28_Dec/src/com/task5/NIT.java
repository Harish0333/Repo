package com.task5;

public interface NIT 
{
	 int square(int x);
	 default int add(int a, int b){
	     return a+b;
	 }
	 default int sub(int a, int b){
	     return a-b;
	 }
	 static int multiply(int a, int b){
	     return a*b;
	 }
	 static int divide(int a, int b){
	     return a/b;
	 }
}
