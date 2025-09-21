package com.examples;
class Main2 {

String language;

Main2() 
{
this.language = "Java";
}

Main2(String language) {
this.language = language;
}

public void getName() {
System.out.println("Programming Langauage: " + this.language);
}

public static void main(String[] args) {

Main2 obj1 = new Main2();

Main2 obj2 = new Main2("Python");

obj1.getName();
obj2.getName();
}
}