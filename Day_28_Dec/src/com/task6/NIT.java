package com.task6;
import java.lang.FunctionalInterface;
@FunctionalInterface
public interface NIT 
{
	int square(int x);
	 static int add(int a, int b){
	     return a+b;
	 }
	 static int sub(int a, int b){
	     return a-b;
	 }
	 static int multiply(int a, int b){
	     return a*b;
	 }
	 static int divide(int a, int b){
	     return a/b;
	 }
}
