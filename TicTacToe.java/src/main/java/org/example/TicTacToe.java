package org.example;

import java.util.Random;

public class TicTacToe{

    public static void main(String[] args) {

        char userSymbol;
        char computerSymbol;
        String currentPlayer;

        Random rand = new Random();
        int toss = rand.nextInt(2);

        if (toss == 0) {
            currentPlayer = "User";
            userSymbol = 'X';
            computerSymbol = 'O';
        } else {
            currentPlayer = "Computer";
            userSymbol = 'O';
            computerSymbol = 'X';
        }

        System.out.println("Toss Result:");
        System.out.println(currentPlayer + " will start first!");
        System.out.println("User Symbol: " + userSymbol);
        System.out.println("Computer Symbol: " + computerSymbol);
    }
}