package JavaProjects;

public class GameLauncher {
    public static void main(String[] arg) {
        GuessGame game = new GuessGame();
        game.startGame();
    }
}

class Player {
    int number;

    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("I'm guessing number: " + number);
    }
}
class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        while (true) {
            // Generate target number
            int targetNum = (int) (Math.random() * 10);
            System.out.println("I'm thinking of a number between 0 and 9...");

            // Call players to guess
            p1.guess();
            p2.guess();
            p3.guess();

            int guessp1 = p1.number;
            int guessp2 = p2.number;
            int guessp3 = p3.number;

            // Declare variables to hold booleans based on player's guesses
            boolean p1Right = false;
            boolean p2Right = false;
            boolean p3Right = false;

            if (guessp1 == targetNum) {
                p1Right = true;
            }
            if (guessp2 == targetNum) {
                p2Right = true;
            }
            if (guessp3 == targetNum) {
                p3Right = true;
            }

            System.out.println("Player 1 guessed " + guessp1);
            System.out.println("Player 2 guessed " + guessp2);
            System.out.println("Player 3 guessed " + guessp3);

            System.out.println("The number is " + targetNum);

            if (p1Right || p2Right || p3Right) {
                System.out.println("We have a winner:");
                if (p1Right) {
                    System.out.println("Player p1 wins!");
                }
                if (p2Right) {
                    System.out.println("Player p2 wins!");
                }
                if (p3Right) {
                    System.out.println("Player p3 wins!");
                }
                System.out.println("\n");
                break;
            }
            else {
                System.out.println("Players will have to try again.\n");
            }
        }
    }
}

