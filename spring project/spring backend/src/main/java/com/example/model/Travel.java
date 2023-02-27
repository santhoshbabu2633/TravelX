package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="travel")
public class Travel {
	@Id
	private int id;
	private String touristplace;
	private float travelexpense;
	private float hotelexpenses;
	private float foodexpenses;
	private float totalexpenses;
	public Travel()
	{
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTouristplace() {
		return touristplace;
	}
	public void setTouristplace(String touristplace) {
		this.touristplace = touristplace;
	}
	public float getTravelexpense() {
		return travelexpense;
	}
	public void setTravelexpense(float travelexpense) {
		this.travelexpense = travelexpense;
	}
	public float getHotelexpenses() {
		return hotelexpenses;
	}
	public void setHotelexpenses(float hotelexpenses) {
		this.hotelexpenses = hotelexpenses;
	}
	public float getFoodexpenses() {
		return foodexpenses;
	}
	public void setFoodexpenses(float foodexpenses) {
		this.foodexpenses = foodexpenses;
	}
	public float getTotalexpenses() {
		return totalexpenses;
	}
	public void setTotalexpenses(float totalexpenses) {
		this.totalexpenses = totalexpenses;
	}
	public Travel(int id, String touristplace, float travelexpense, float hotelexpenses, float foodexpenses,
			float totalexpenses) {
		super();
		this.id = id;
		this.touristplace = touristplace;
		this.travelexpense = travelexpense;
		this.hotelexpenses = hotelexpenses;
		this.foodexpenses = foodexpenses;
		this.totalexpenses = totalexpenses;
	}
	@Override
	public String toString() {
		return "Travel [id=" + id + ", touristplace=" + touristplace + ", travelexpense=" + travelexpense
				+ ", hotelexpenses=" + hotelexpenses + ", foodexpenses=" + foodexpenses + ", totalexpenses="
				+ totalexpenses + "]";
	}
	
	

}
