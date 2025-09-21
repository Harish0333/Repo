package com.task;

class X
{
public int x;
public X(int x) {
this.x = x;
}

public static void main(String[] args) {
X a = new X(10);
X b = a;
System.out.println(a.x+" "+b.x);
}
}
