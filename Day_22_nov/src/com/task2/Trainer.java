package com.task2;
/*Class Trainer
Fields: id: int, name : String, basicSalary : double, HRAPer : double,DAPer : double, batchCount: int, perkPerBatch: double
Public Method: calculateGrossSalary() - returns a double
Calculate the gross salary as : basicSalary +HRAPer +DAPer +(batchCount * perkPerBatch)
*/
public class Trainer 
{
	int id;
	String name;
	double basicSalary;
	double HRAPer;
	double DAPer;
	int batchCount;
	double perkPerBatch;
	
	public Trainer(int id, String name, double basicSalary, double hRAPer, double dAPer, int batchCount,
			double perkPerBatch) {
		super();
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
		HRAPer = hRAPer;
		DAPer = dAPer;
		this.batchCount = batchCount;
		this.perkPerBatch = perkPerBatch;
	}

	public double calculateGrossSalary()
	{
		return basicSalary +HRAPer +DAPer +(batchCount * perkPerBatch);
	}
}
