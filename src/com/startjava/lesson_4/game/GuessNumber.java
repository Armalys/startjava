package com.startjava.lesson_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private Scanner scanner = new Scanner(System.in);
    private int computerNumber;
    private Player playerOne;
    private Player playerTwo;
    private String answer;


    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void setPlayerName() {
        System.out.print("Введите имя первого игрока: ");
        playerOne.setName(scanner.next());
        System.out.print("Введите имя второго игрока: ");
        playerTwo.setName(scanner.next());
    }

    public void playerInput(Player player, int i) {
        System.out.print(player.getName() + ", твоя попытка: ");
        player.setNumber(scanner.nextInt());
        player.setNumbers(player.getNumber(), i);
    }

    public void checkInput(int i) {
        if (playerOne.getNumber() == computerNumber) {
            playerOne.setAttempt(i + 1);
            playerOne.setStatus(true);
        } else if (playerTwo.getNumber() == computerNumber) {
            playerTwo.setAttempt(i + 1);
            playerTwo.setStatus(true);
        }
    }

    public void playerWin(Player player) {
        System.out.println("Поздравляем, " + player.getName() + ", ты угадал число с " + player.getAttempt() + " попытки");
        int[] playerOneNumbers = Arrays.copyOf(player.getNumbers(), player.getAttempt());
        System.out.print("Твои варианты: ");
        for (int number : playerOneNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public void noWinner() {
        System.out.println("У " + playerOne.getName() + " и " + playerTwo.getName() + " кончались попытки");
        System.out.print(playerOne.getName() + ", твои варианты: ");
        for (int number : playerOne.getNumbers()) {
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.print(playerTwo.getName() + ", твои варианты: ");
        for (int number : playerTwo.getNumbers()) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public void gameStart() {
        setPlayerName();
        System.out.println("Привет, " + playerOne.getName() + " и " + playerTwo.getName());
        generateComputerNumber();
        System.out.println("Компьютер загадал число, у вас есть 10 попыток, чтобы его отгадать");

        for (int i = 0; i < 10; i++) {
            playerInput(playerOne, i);
            playerInput(playerTwo, i);
            checkInput(i);
            System.out.println("У вас осталось " + (9 - i) + " попыток");
        }

        System.out.println("Правильный ответ: " + computerNumber);

        if (playerOne.isStatus()) {
            playerWin(playerOne);
            playerOne.setStatus(false);
        } else if (playerTwo.isStatus()) {
            playerWin(playerTwo);
            playerTwo.setStatus(false);
        } else {
            noWinner();
        }
    }

    public void generateComputerNumber() {
        computerNumber = (int) (Math.random() * 101);
    }

    public void repeatGame() {
        do {
            System.out.print("Хотите продолжить? [да/нет]: ");
            answer = scanner.next();
        } while (!(answer.equals("да") || answer.equals("нет")));
    }

    public String getAnswer() {
        return answer;
    }
}