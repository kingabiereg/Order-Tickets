package pl.isa.homeworks.zadanie1;

import java.util.Scanner;

public class GuessNumberApp {
    public static void main(String[] args) {
        GuessNumberGame game = new GuessNumberGame();
        Scanner input = new Scanner(System.in);

        System.out.println(game.getIntro());

        while (game.isRunning()) {
            System.out.println(game.getInstruction());

            int number = input.nextInt();

            System.out.println(game.guessNumber(number));
        }
    }
}
