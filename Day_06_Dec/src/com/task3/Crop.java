package com.task3;

public class Crop 
{
	private String name;
	private String plantingDate;
	private String growthStatus;
	
	public Crop(String name, String plantingDate, String growthStatus) 
	{
		super();
		this.name = name;
		this.plantingDate = plantingDate;
		this.growthStatus = growthStatus;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlantingDate() {
		return plantingDate;
	}

	public void setPlantingDate(String plantingDate) {
		this.plantingDate = plantingDate;
	}

	public String getGrowthStatus() {
		return growthStatus;
	}

	public void setGrowthStatus(String growthStatus) {
		this.growthStatus = growthStatus;
	}

	@Override
	public String toString() {
		return "Crop Name= " + name + ", \nplanting Date=" + plantingDate + ", \ngrowth Status=" + growthStatus;
	}
}
