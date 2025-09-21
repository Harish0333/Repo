package method_overload;

public class Sum {
	public int add(int x, int y)
	  {
		  int z = x+y;
		  return z;	  
	  }
	  
	  public String add(String x, String y) //data base
	  {
		  String z = x+y;
		  return z;
	  }

	  public double add(double x, double y)
	  {
		  double z = x+y;
		  return z;
	  }

}
