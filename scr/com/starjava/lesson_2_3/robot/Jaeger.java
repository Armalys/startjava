package com.startjava.lesson_2_3.robot;

public class Jaeger {
	private String modelName;
	private String mark;
	private String origin;
	private double height;
	private double weight;
	private int speed;
	private int strenght;
	private int armor;

	public Jaeger(String modelName, String mark, String origin, double height, double weight, int speed, int strenght, int armor) {
		this.modelName = modelName;		
		this.mark = mark;
		this.origin = origin;
		this.height = height;
		this.weight = weight;
		this.speed = speed;
		this.strenght = strenght;
		this.armor = armor;

	}

	public String getModelName() {
		return "Model name: " + modelName;
	}
	
	public void setModelName (String modelName) {
		this.modelName = modelName;
	}

	public String getMark() {
		return "Mark: " + mark;
	}

	public void setMark (String mark) {
		this.mark = mark;
	}
	
	public String getOrigin() {
		return "Origin: " + origin;
	}

	public void setOrigin (String origin) {
		this.origin = origin;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight (double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight (double weight) {
		this.weight = weight;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed (int speed) {
		this.speed = speed;
	}

	public int getStrenght() {
		return strenght;
	}

	public void setStrenght (int strenght) {
		this.strenght = strenght;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor (int armor) {
		this.armor = armor;
	}

	public void drift() {
		System.out.println(modelName + " entered the drift mode");
	}

	public void scanKaiju() {
		System.out.println("Kaiju is not found");
	}

	public void move() {
		System.out.println(modelName + " started moving");
	}

	public void speedUp(int speed) {
		System.out.println("Speed up");
		this.speed += speed;
	}
}