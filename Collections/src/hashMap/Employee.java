package hashMap;

public class Employee {
	int eid;
	String ename;

	Employee(int eid, String ename)
	{
		this.eid = eid;
		this.ename = ename;
	}

    @Override
	public boolean equals(Object obj)  //obj = e2
	{		
		if(obj instanceof Employee)
        {
			Employee e2 = (Employee) obj; //downcasting

			if(this.eid == e2.eid && this.ename.equals(e2.ename))
			{
				return true;
			}
			else
			{
				return false;
			}
	    }
		else
		{
			System.out.println("Comparison is not possible");
			return false;
		}		
	}

	public String toString()
		{
			 return " "+eid+" "+ename;
		}

}
