package com.startjava.lesson_4.game;

import java.util.Scanner;

public class GuessNumber {
    private Scanner scanner = new Scanner(System.in);
    private int computerNumber;
    private Player playerOne;
    private Player playerTwo;
    private int numberOfAttempts;

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
        checkWinner(playerOne);
        checkWinner(playerTwo);
    }

    private void resetToDefault() {
        numberOfAttempts = 10;
        playerOne.setAttempt(10);
        playerTwo.setAttempt(10);
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
        } else if (player.getNumber() < computerNumber) {
            System.out.println("Загаданное число больше");
        } else if (player.getNumber() > computerNumber) {
            System.out.println("Загаданное число меньше");
        }
    }

    private void checkWinner(Player player) {
        if (player.getStatus()) {
            System.out.println("Поздравляем, " + player.getName() + ", ты угадал число с " + player.getAttempt() + " попытки");
            showSelectedNumbers(player);
        } else {
            noGuessedNumber(player);
        }
    }

    private void noGuessedNumber(Player player) {
        System.out.println("У " + player.getName() + " кончались попытки");
        showSelectedNumbers(player);
    }

    private void showSelectedNumbers(Player player) {
        System.out.print(player.getName() + ", твои варианты: ");
        for (int number : player.getNumbers()) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}