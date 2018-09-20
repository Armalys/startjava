package com.startjava.lesson_1.game;

public class Game {
	public static void main(String[] args) {
		byte computerNumber = 10;
		byte userNumber = 15;

		while (userNumber != computerNumber) {
			if (userNumber > computerNumber) {
				System.out.println("Введенное вами число больше того, что загадал компьютер");
				userNumber--;
			} else if (userNumber < computerNumber) {
				System.out.println("Введенное вами число меньше того, что загадал компьютер");
				userNumber++;
			}
		}
		System.out.println("Поздравляем, вы угадали!");
	}
}