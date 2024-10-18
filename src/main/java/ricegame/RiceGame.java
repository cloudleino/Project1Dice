package ricegame;

import java.util.Random;
import java.util.Scanner;

public class RiceGame {

    public static void main(String[] args) {
        Random random = new Random();  // Slumpgenerator för tärningskast
        Scanner scanner = new Scanner(System.in);  // Används för att läsa in spelarnas namn

        // Låt användaren skriva in namn på spelarna
        System.out.print("Skriv in namn för spelare 1: ");
        RicePlayer player1 = new RicePlayer(scanner.nextLine());
        System.out.print("Skriv in namn för spelare 2: ");
        RicePlayer player2 = new RicePlayer(scanner.nextLine());


        // Tärningskast för båda spelarna
        rollDice(player1, random);
        rollDice(player2, random);


        // Skriv ut resultat
        System.out.println(player1.getName() + " fick totalt: " + player1.getScore());
        System.out.println(player2.getName() + " fick totalt: " + player2.getScore());

        // Avgör vem som vann
        if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getName() + " vinner!");
        } else if (player2.getScore() > player1.getScore()) {
            System.out.println(player2.getName() + " vinner!");
        } else {
            System.out.println("Oavgjort!");
        }
    }


    // Här är metoden rollDice
    public static void rollDice(RicePlayer player, Random random) {
        for (int i = 0; i < 2; i++) {
            int roll = random.nextInt(6) + 1;
            player.addScore(roll);  // Korrekt användning av addScore på objektet "player"
            printDice(roll);        // Visa den visuella representationen av tärningen

        }
    }
    public static void printDice(int roll) {
        switch (roll) {
            case 1:
                System.out.println("[     ]");
                System.out.println("[  o  ]");
                System.out.println("[     ]");
                break;
            case 2:
                System.out.println("[o    ]");
                System.out.println("[     ]");
                System.out.println("[    o]");
                break;
            case 3:
                System.out.println("[o    ]");
                System.out.println("[  o  ]");
                System.out.println("[    o]");
                break;
            case 4:
                System.out.println("[o   o]");
                System.out.println("[     ]");
                System.out.println("[o   o]");
                break;
            case 5:
                System.out.println("[o   o]");
                System.out.println("[  o  ]");
                System.out.println("[o   o]");
                break;
            case 6:
                System.out.println("[o   o]");
                System.out.println("[o   o]");
                System.out.println("[o   o]");
                break;
            default:
                break;
        }
    }

}


