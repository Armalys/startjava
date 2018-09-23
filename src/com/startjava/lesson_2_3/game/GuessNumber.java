package com.startjava.lesson_2_3.game;

import java.util.Scanner;

public class GuessNumber {
	private Scanner scanner = new Scanner(System.in);
	private int computerNumber;
	private Player playerOne;
	private Player playerTwo;

	public GuessNumber(Player playerOne, Player playerTwo) {
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
	}

	public void gameStart() {
		System.out.println("Привет, " + playerOne.getName() + " и " + playerTwo.getName());
		generateComputerNumber();
		System.out.println("Компьютер загадал число, вам необходимо его отгадать");

		while (true) {
			System.out.print(playerOne.getName() + ", твоя попытка:");
			playerOne.setNumber(scanner.nextInt());
			System.out.print(playerTwo.getName() + ", твоя попытка:");			
			playerTwo.setNumber(scanner.nextInt());

			if (playerOne.getNumber() == computerNumber) {
				System.out.println("Поздравляем, " + playerOne.getName() + ", ты угадал!");
				System.out.println("Это было число: " + computerNumber);
				break;
			} else if (playerTwo.getNumber() == computerNumber) {
				System.out.println("Поздравляем, " + playerTwo.getName() + ", ты угадал!");
				System.out.println("Это было число: " + computerNumber);
				break;
			}
		}
	}

	public void generateComputerNumber() {
		computerNumber = (int) (Math.random() * 101);
	}

}