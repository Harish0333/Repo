package var.args;

public class Test3 {
	   public void acceptHetro(Object ...obj)
	   {
		   for(Object o : obj)
		   {
			   System.out.println(o);
		   }
	   }

}
