package com.example.fanfourproject;

import java.util.ArrayList;

public class Pizza {
	
	private ArrayList<String> toppings = new ArrayList<String>();
	private String pizzaSize = "";
	
	public Pizza(String size, ArrayList<String> tops){
		for(String top: tops){
			toppings.add(top);
		}
		this.pizzaSize = size;
	}
	
	public String getPizzaSize(){
		return pizzaSize;
	}
	
	public void setPizzaSize(String size){
		pizzaSize = size;
	}
	
	public ArrayList<String> getPizzaToppings(){
		return toppings;
	}
	
	public void addPizzaToppings(String top){
		toppings.add(top);
	}
	
	public void clearPizzaToppings(){
		toppings = new ArrayList<String>();
	}
	
	public String toString(){
		return "finishMe";
	}
}