package com.mock;

public class Bike {
	private String model;
	private String brand;
	private String year;
	private Engine engg;// HAS - A(COMPOSITION)

	public Bike(String model, String brand, String year, Engine engg) {
		super();
		this.model = model;
		this.brand = brand;
		this.year = year;
		this.engg = engg;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Engine getEngg() {
		return engg;
	}

	public void setEngg(Engine engg) {
		this.engg = engg;
	}

	@Override
	public String toString() {
		return "Bike [model=" + model + ", brand=" + brand + ", year=" + year + ", engg=" + engg + "]";
	}
}
