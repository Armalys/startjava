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
        System.out.println("Привет, " + playerOne.getName() + " и " + playerTwo.getName());
        generateComputerNumber();
        System.out.println("Компьютер загадал число, у вас есть 10 попыток, чтобы его отгадать");
        System.out.println("Правильный ответ: " + computerNumber);

        for (int i = 0; i < numberOfAttempts; i++) {
            System.out.println("У вас осталось " + (numberOfAttempts - i) + " попыток");
            playerInput(playerOne, i);
            playerInput(playerTwo, i);
            checkInput(playerOne, i);
            checkInput(playerTwo, i);
        }

        System.out.println("Правильный ответ: " + computerNumber);

        if (playerOne.isStatus()) {
            playerWin(playerOne);
        } else if (playerTwo.isStatus()) {
            playerWin(playerTwo);
        } else {
            noWinner();
        }
    }

    private void resetToDefault() {
        numberOfAttempts = 10;
        playerOne.setAttempt(0);
        playerTwo.setAttempt(0);
        playerOne.setStatus(false);
        playerTwo.setStatus(false);
    }

    private void generateComputerNumber() {
        computerNumber = (int) (Math.random() * 101);
    }

    private void playerInput(Player player, int i) {
        System.out.print(player.getName() + ", твоя попытка: ");
        player.setNumber(scanner.nextInt());
        player.setNumbers(player.getNumber(), i);
    }

    private void checkInput(Player player, int i) {
        if (player.getNumber() == computerNumber) {
            player.setAttempt(i + 1);
            player.setStatus(true);
        }
    }

    private void playerWin(Player player) {
        System.out.println("Поздравляем, " + player.getName() + ", ты угадал число с " + player.getAttempt() + " попытки");
        showSelectedNumbers(player);
    }

    private void noWinner() {
        System.out.println("У " + playerOne.getName() + " и " + playerTwo.getName() + " кончались попытки");
        showSelectedNumbers(playerOne);
        showSelectedNumbers(playerTwo);
    }

    private void showSelectedNumbers(Player player) {
        System.out.print(player.getName() + ", твои варианты: ");
        for (int number : player.getNumbers()) {
            System.out.print(number + " ");
            if (number == computerNumber) {
                break;
            }
        }
        System.out.println();
    }
}