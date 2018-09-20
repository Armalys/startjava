package com.startjava.lesson_2_3.game;

import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		String answer;
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.print("Введите имя первого игрока: ");
			Player playerOne = new Player(scanner.next());
			System.out.print("Введите имя второго игрока: ");
			Player playerTwo = new Player(scanner.next());
			GuessNumber guessNumber = new GuessNumber(playerOne, playerTwo);
			guessNumber.gameStart();
			do {
				System.out.print("Хотите продолжить? [да/нет]: ");
				answer = scanner.next();
			} while (!(answer.equals("да") || answer.equals("нет")));
		} while (answer.equals("да"));
	}
}