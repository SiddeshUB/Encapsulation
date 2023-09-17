package com.Learning.Encapsulation;
public class Fan {
	private int no_of_blades;
	private String brand;
	private String color;
	private int cost;
	
	public void setData(int a,String b,String c ,int d) {
		if(a>0) {
			no_of_blades =a;
		}
		if (b.length()!=0) {
			brand = b;
		}
		if(c.length()!=0){
			color = c;
		}
		if (d>0) {
			cost = d;
		}
	}
	public int getNo_of_blades() {
		return no_of_blades;
	}
	public String getBrand() {
		return brand;
	}
	public String getColor() {
		return color;
	}
	public int getCost() {
		return cost;
	}
}
