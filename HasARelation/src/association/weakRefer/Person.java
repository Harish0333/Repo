package association.weakRefer;

public class Person {
	   private String personName;
	   private String address;
	   private Aadhar aadhar;
	   
		public Person(String personName, String address, Aadhar aadhar) 
		{
			super();
			this.personName = personName;
			this.address = address;
			this.aadhar = aadhar;
		}

		@Override
		public String toString() {
			return "Person [personName=" + personName + ", address=" + address + ", aadhar=" + aadhar + "]";
		}

}
