package com.task1;
class Device
{
void deviceName()
{
System.out.println("Laptop");

class Model
{
    void modelInfo() 
    {
        System.out.println("Dell Inspiron 14");
    }
}
Model model = new Model();
model.modelInfo();
}
}
public class EnumTest10 
{
	public static void main(String[] args) 
	{
		Device device = new Device();
		device.deviceName();
		}
}
