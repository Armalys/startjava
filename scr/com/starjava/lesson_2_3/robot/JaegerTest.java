package com.startjava.lesson_2_3.robot;

public class JaegerTest {
	public static void main(String[] args) {
		Jaeger guardianBravo = new Jaeger("Guardian Bravo", "Mark-6", "USA", 73.2, 1.9, 8, 15, 16);
		Jaeger strikerEureka = new Jaeger("Striker Eureka", "Mark-5", "Australia", 76.2, 1.8, 10, 10, 9);

		System.out.println(guardianBravo.getModelName());
		System.out.println(guardianBravo.getMark());
		System.out.println(guardianBravo.getOrigin());
		System.out.println("Heigt: " + guardianBravo.getHeight());
		System.out.println("Weight: " + guardianBravo.getWeight());
		System.out.println("Speed: " + guardianBravo.getSpeed());
		System.out.println("Strenght: " + guardianBravo.getStrenght());
		System.out.println("Armor: " + guardianBravo.getArmor());
		guardianBravo.scanKaiju();
		guardianBravo.drift();
		guardianBravo.move();
		guardianBravo.speedUp(5);
		System.out.println("Speed: " + guardianBravo.getSpeed());
		System.out.println("");

		System.out.println(strikerEureka.getModelName());
		System.out.println(strikerEureka.getMark());
		System.out.println(strikerEureka.getOrigin());
		System.out.println("Heigt: " + strikerEureka.getHeight());
		System.out.println("Weight: " + strikerEureka.getWeight());
		System.out.println("Speed: " + strikerEureka.getSpeed());
		System.out.println("Strenght: " + strikerEureka.getStrenght());
		System.out.println("Armor: " + strikerEureka.getArmor());
		strikerEureka.drift();
		strikerEureka.scanKaiju();
		strikerEureka.move();
		guardianBravo.speedUp(7);
		System.out.println("Speed: " + guardianBravo.getSpeed());
	}
}