package com.startjava.lesson_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private Scanner scanner = new Scanner(System.in);
    private int computerNumber;
    private Player playerOne;
    private Player playerTwo;
    private int[] playerOneNumbers;
    private int[] playerTwoNumbers = new int[10];
    private int attempt;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void gameStart() {
        System.out.println("Привет, " + playerOne.getName() + " и " + playerTwo.getName());
        generateComputerNumber();
        System.out.println("Компьютер загадал число, у вас есть 10 попыток, чтобы его отгадать");

        for (int i = 0; i < 10; i++) {
            System.out.print(playerOne.getName() + ", твоя попытка: ");
            playerOne.setNumber(scanner.nextInt());
            playerOne.setNumbers(playerOne.getNumber(), i);

            System.out.print(playerTwo.getName() + ", твоя попытка: ");
            playerTwo.setNumber(scanner.nextInt());
            playerTwo.setNumbers(playerTwo.getNumber(), i);

            if (playerOne.getNumber() == computerNumber) {
                playerOne.setAttempt(i + 1);
                playerOne.setStatus(true);
            } else if (playerTwo.getNumber() == computerNumber) {
                playerTwo.setAttempt(i + 1);
                playerTwo.setStatus(true);
            }

            System.out.println("У вас осталось " + (9 - i) + " попыток");
        }

        if (playerOne.isStatus()) {
            System.out.println("Поздравляем, " + playerOne.getName() + ", ты угадал число с " + playerOne.getAttempt() + " попытки");
            playerOneNumbers = Arrays.copyOf(playerOne.getNumbers(), playerOne.getAttempt());
            System.out.print("Твои варианты: ");
            for (int number : playerOneNumbers) {
                System.out.print(number + " ");
            }
            System.out.println("");

        } else if (playerTwo.isStatus()) {
            System.out.println("Поздравляем, " + playerTwo.getName() + ", ты угадал число с " + playerTwo.getAttempt() + " попытки");
            playerTwoNumbers = Arrays.copyOf(playerTwo.getNumbers(), playerTwo.getAttempt());
            System.out.print("Твои варианты: ");
            for (int number : playerTwoNumbers) {
                System.out.print(number + " ");
            }
            System.out.println("");

        } else {
            System.out.println("У " + playerOne.getName() + " и " + playerTwo.getName() + " кончались попытки");
            System.out.print(playerOne.getName() + ", твои варианты: ");
            for (int number : playerOne.getNumbers()) {
                System.out.print(number + " ");
            }
            System.out.println("");

            System.out.print(playerTwo.getName() + ", твои варианты: ");
            for (int number : playerTwo.getNumbers()) {
                System.out.print(number + " ");
            }
            System.out.println("");
        }
    }

    public void generateComputerNumber() {
        computerNumber = (int) (Math.random() * 101);
    }

}