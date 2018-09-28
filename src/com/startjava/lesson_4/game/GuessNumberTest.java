package com.startjava.lesson_4.game;

import java.util.Scanner;

public class GuessNumberTest {

    private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
        String[] playersNames = new String[2];
        enterNames(playersNames);
        GuessNumber guessNumber = initPlayers(playersNames);
        do {
            initPlayers(playersNames);
            guessNumber.gameStart();
		} while (repeatGame().equals("да"));
	}

	private static void enterNames( String[] playersNames) {
        System.out.print("Введите имя первого игрока: ");
        playersNames[0] = scanner.nextLine();
        System.out.print("Введите имя второго игрока: ");
        playersNames[1] = scanner.nextLine();
    }

    private static GuessNumber initPlayers(String[] playersNames) {
        Player playerOne = new Player(playersNames[0]);
        Player playerTwo = new Player(playersNames[1]);
        return new GuessNumber(playerOne, playerTwo);
    }

    private static String repeatGame() {
        String answer;
        do {
            System.out.print("Хотите продолжить? [да/нет]: ");
            answer = scanner.next();
        } while (!answer.equals("да") && !answer.equals("нет"));
        return answer;
    }

}