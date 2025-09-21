package classLoader;

public class Test {

    public static void main(String[] args) 
    {
    	System.out.println("Test.class file is loaded by :"+Test.class.getClassLoader());
    	
    	System.out.println("The super class for Application class loader is  :"+Test.class.getClassLoader().getParent());
    	
    	System.out.println("The super class for Platform class loader is  :"+Test.class.getClassLoader().getParent().getParent()); //null
        
    }

}
