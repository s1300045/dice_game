import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? \n> ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.println("Rolling dice...");
        int die1 = rollDice(random);
        int die2 = rollDice(random);

        System.out.println("Die 1: " + die1);
        System.out.println("Die 2: " + die2);
        System.out.println("Total value: " + (die1 + die2));
    }

    if (die1 + die2 > 7) {
        System.out.println(name + " won!");
    } else {
        System.out.println(name + " lost.");
    }
    

    private static int rollDice(Random random) {
        return random.nextInt(6) + 1;
    }
}
