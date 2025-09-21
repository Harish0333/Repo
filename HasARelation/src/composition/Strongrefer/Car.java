package composition.Strongrefer;

public class Car {
	private String carName;
	   private double carPrice;
	   private Engine engine;   //HAS-A Relation
	   
		public Car(String carName, double carPrice) 
		{
			super();		
			this.carName = carName;
			this.carPrice = carPrice;
			this.engine = new Engine("Battery", 1400); //Compostion
			
		}

		@Override
		public String toString() {
			return "Car [carName=" + carName + ", carPrice=" + carPrice + ", engine=" + engine + "]";
		}
}


