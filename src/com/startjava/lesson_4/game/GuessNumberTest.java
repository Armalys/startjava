package com.startjava.lesson_4.game;

import java.util.Scanner;

public class GuessNumberTest {

    private static Scanner scanner = new Scanner(System.in);
    private static String[] playersNames = new String[2];
    private static String answer;

	public static void main(String[] args) {
        entersName();
        GuessNumber guessNumber = initPlayers();
		do {
            initPlayers();
            guessNumber.gameStart();
            repeatGame();
		} while (answer.equals("да"));
	}

	private static void entersName() {
        System.out.print("Введите имя первого игрока: ");
        playersNames[0] = scanner.next();
        System.out.print("Введите имя второго игрока: ");
        playersNames[1] = scanner.next();
    }

    private static GuessNumber initPlayers() {
        Player playerOne = new Player(playersNames[0]);
        Player playerTwo = new Player(playersNames[1]);
        return new GuessNumber(playerOne, playerTwo);
    }

    private static String repeatGame() {
        do {
            System.out.print("Хотите продолжить? [да/нет]: ");
            answer = scanner.next();
        } while (!answer.equals("да") && !answer.equals("нет"));
        return answer;
    }

}