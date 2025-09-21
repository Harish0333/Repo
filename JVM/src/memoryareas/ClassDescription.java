package memoryareas;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassDescription {
	public static void main(String[] args) throws Exception 
	{
		@SuppressWarnings("rawtypes")
		Class cls = Class.forName(args[0]);
		System.out.println("class Name is :"+cls.getName());
		System.out.println("Package Name is :"+cls.getPackageName());
		
		Field[] fields = cls.getDeclaredFields();
		System.out.println("Fields Are :");
		for(Field field : fields)
		{
			System.out.println(field.getName());
		}
		System.out.println("Methods Are :");
		 int methodCount = 0;
		 Method[] methods = cls.getDeclaredMethods();
		 for(Method method : methods)
		 {
			 methodCount++;
			 System.out.println(method.getName());
		 }
		 System.out.println("Total Methods are :"+methodCount);
	}

}
