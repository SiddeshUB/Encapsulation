package com.Learning.Encapsulation;

public class FanApp {

	public static void main(String[] args) {
		Fan f = new Fan();
		f.setData(3, "Crompton","White" ,2600);
		System.out.println(f.getNo_of_blades());
		System.out.println(f.getBrand());
		System.out.println(f.getColor());
		System.out.println(f.getCost());
	}

}
