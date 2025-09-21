package com.task1;
class Value
{
int a = 25;
class ReturnValue
{
public int getValue()
{
return a;
}
}
}
public class EnumTest9 {
	public static void main(String[] args) {
		Value v = new Value();
		Value.ReturnValue rvalue = v.new ReturnValue();
		System.out.println(rvalue.getValue());
		}
}
