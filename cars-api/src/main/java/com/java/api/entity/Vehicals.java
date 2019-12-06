package com.java.api.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Vehicals {
     
	 @Id
     int vehicalId;
     String modelName;
     int mileage;
     int price;
     
     //  @ManyToOne
     // @JoinColumn(name = "locationId", nullable = false)
      // private Locations locations;
     
     
  /*   public Locations getLocations() {
		return locations;
	}

	public void setLocations(Locations locations) {
		this.locations = locations;
	} */

	public Vehicals()
     {
      
      }

	

	public int getVehicalId() {
		return vehicalId;
	}



	public void setVehicalId(int vehicalId) {
		this.vehicalId = vehicalId;
	}



	public String getModelName() {
		return modelName;
	}



	public void setModelName(String modelName) {
		this.modelName = modelName;
	}



	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Vehicals(int vehicalId, String modelName, int mileage, int price) {
		super();
		this.vehicalId = vehicalId;
		this.modelName = modelName;
		this.mileage = mileage;
		this.price = price;
	}
	
     
/*	public Vehicals(int vehicalId, String vehicalModel, int fuelCapacity, int length, int breadth, int height,Locations locations) {
		
		super();
		this.vehicalId = vehicalId;
		this.vehicalModel = vehicalModel;
		this.fuelCapacity = fuelCapacity;
		this.length = length;
		this.breadth = breadth;
		this.height = height;
		this.locations = locations;
	}*/

	
     
}
