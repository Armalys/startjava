package com.startjava.lesson_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
	private int computerNumber;
	private Player playerOne;
	private Player playerTwo;
	private int[] playerOneNumbers = new int[10];
	private  int[] playerTwoNumbers = new  int[10];
    private int attempt;

	private Scanner scanner = new Scanner(System.in);

	public GuessNumber(Player playerOne, Player playerTwo) {
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
	}

	public void gameStart() {
		System.out.println("Привет, " + playerOne.getName() + " и " + playerTwo.getName());
		generateComputerNumber();
		System.out.println("Компьютер загадал число, у вас есть 10 попыток, чтобы его отгадать");
        System.out.println(computerNumber);

		while (true) {
			System.out.print(playerOne.getName() + ", твоя попытка:");
            for (int i = 0; i < 10; i++) {
                attempt = 0;
                playerOne.setNumber(scanner.nextInt());
                System.out.println(playerOne.getName() + ", y тебя осталось " + (9 - i) + " попыток");
                playerOneNumbers[i] = playerOne.getNumber();
            }
            playerOne.setNumbers(playerOneNumbers);

            System.out.print(playerTwo.getName() + ", твоя попытка:");
            for (int i = 0; i < 10; i++) {
                attempt = 0;
                playerTwo.setNumber(scanner.nextInt());
                System.out.println(playerTwo.getName() + ", y тебя осталось " + (9 - i) + " попыток");
                playerTwoNumbers[i] = playerTwo.getNumber();
            }
            playerTwo.setNumbers(playerTwoNumbers);

            for (int number : playerOne.getNumbers()) {
                attempt++;
                if (number == computerNumber) {
                    System.out.println("Поздравляем, " + playerOne.getName() + ", вы угдалис с " + attempt + " попытки" );
                    playerOneNumbers = Arrays.copyOf(playerOne.getNumbers(), attempt);
                    System.out.print("Твои варианты: ");
                    for (int i : playerOneNumbers) {
                        System.out.print(i + " ");
                    }
                    System.out.println("");
                    attempt = 0;
                    break;
                }
            }

            for (int number : playerTwo.getNumbers()) {
                attempt++;
                if (number == computerNumber) {
                    System.out.println("Поздравляем, " + playerTwo.getName() + ", вы угдалис с " + attempt + " попытки" );
                    playerTwoNumbers = Arrays.copyOf(playerTwo.getNumbers(), attempt);
                    System.out.print("Твои варианты: ");
                    for (int i : playerTwoNumbers) {
                        System.out.print(i + " ");
                    }
                    System.out.println("");
                    break;
                }
            }
            break;
		}
	}

	public void generateComputerNumber() {
		computerNumber = (int) (Math.random() * 101);
	}

}