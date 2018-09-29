package com.startjava.lesson_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private Scanner scanner = new Scanner(System.in);
    private int computerNumber;
    private Player playerOne;
    private Player playerTwo;
    private int numberOfAttempts;
    private int[] numbersOfWinner;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void gameStart() {
        resetToDefault();
        generateComputerNumber();
        displayInfo();
        inputNumber();
        System.out.println("Правильный ответ: " + computerNumber);
        checkWinner();
    }

    private void resetToDefault() {
        numbersOfWinner = new int[10];
        numberOfAttempts = 10;
        playerOne.setAttempt(0);
        playerTwo.setAttempt(0);
        playerOne.setStatus(false);
        playerTwo.setStatus(false);
    }

    private void generateComputerNumber() {
        computerNumber = (int) (Math.random() * 101);
    }

    private void displayInfo() {
        System.out.println("Привет, " + playerOne.getName() + " и " + playerTwo.getName());
        System.out.println("Компьютер загадал число, у вас есть 10 попыток, чтобы его отгадать");
    }

    private void inputNumber() {
        for (int i = 0; i < numberOfAttempts; i++) {
            System.out.println("У вас осталось " + (numberOfAttempts - i) + " попыток");
            playerInput(playerOne, i);
            checkNumber(playerOne, i);
            playerInput(playerTwo, i);
            checkNumber(playerTwo, i);
        }
    }

    private void playerInput(Player player, int i) {
        System.out.print(player.getName() + ", твоя попытка: ");
        player.setNumber(scanner.nextInt(), i);
    }

    private void checkNumber(Player player, int i) {
        if (player.getNumber() == computerNumber) {
            player.setAttempt(i + 1);
            player.setStatus(true);
            rememberNumbers(player, i);
        } else if (player.getNumber() < computerNumber) {
            System.out.println("Введенное число больше того, что загадал компьютер");
        } else if (player.getNumber() > computerNumber) {
            System.out.println("Введенное число меньше, что загадал компьютер");
        }
    }

    private void rememberNumbers(Player player, int i) {
        numbersOfWinner = Arrays.copyOf(player.getNumbers(), i);
    }

    private void checkWinner() {
        if (playerOne.getStatus()) {
            playerWin(playerOne);
        } else if (playerTwo.getStatus()) {
            playerWin(playerTwo);
        } else {
            lose();
        }
    }

    private void playerWin(Player player) {
        System.out.println("Поздравляем, " + player.getName() + ", ты угадал число с " + player.getAttempt() + " попытки");
        showWinnerSelectedNumbers(player);
    }

    private void lose() {
        System.out.println("У " + playerOne.getName() + " и " + playerTwo.getName() + " кончались попытки");
        showAllSelectedNumbers(playerOne);
        showAllSelectedNumbers(playerTwo);
    }

    private void showWinnerSelectedNumbers(Player player) {
        System.out.print(player.getName() + ", твои варианты: ");
        for (int number : numbersOfWinner) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private void showAllSelectedNumbers(Player player) {
        System.out.print(player.getName() + ", твои варианты: ");
        for (int number : player.getNumbers()) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}