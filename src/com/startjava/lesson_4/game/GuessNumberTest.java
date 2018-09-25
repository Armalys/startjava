package com.startjava.lesson_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    private static String answer;
    private static Scanner scanner = new Scanner(System.in);
    private static Player playerOne = new Player();
    private static Player playerTwo = new Player();
    private static GuessNumber guessNumber = new GuessNumber(playerOne, playerTwo);

	public static void main(String[] args) {
		do {
		    setPlayerName();
			guessNumber.gameStart();
            repeatGame();
		} while (answer.equals("да"));
	}

	private static void setPlayerName() {
        System.out.print("Введите имя первого игрока: ");
        playerOne.setName(scanner.next());
        System.out.print("Введите имя второго игрока: ");
        playerTwo.setName(scanner.next());
    }

    private static void repeatGame() {
        do {
            System.out.print("Хотите продолжить? [да/нет]: ");
            answer = scanner.next();
        } while (!answer.equals("да") && !answer.equals("нет"));
    }

}