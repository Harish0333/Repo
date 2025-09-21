package com.task1;

class Devic{
void getDeviceName()
{
System.out.println("Laptop");
}
}
public class EnumTest11
{
// Anonymous Inner classe
static Devic device = new Devic() // here static is used for method call directly in main method
{
void getDeviceName()
{
super.getDeviceName();
System.out.println("Call Super laptop");
}
};

public static void main(String[] args) {
    device.getDeviceName();
}
}
