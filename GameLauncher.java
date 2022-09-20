package JavaProjects;

public class GameLauncher {
    public static void main(String[] arg) {
        GuessGame game = new GuessGame();
        game.startGame();
    }
}

public class player {
    int number;

    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("I'm guessing number: " + number);
    }
}
public class GuessGame {
    player p1;
    player p2;
    player p3;

    public void startGame() {
        p1 = new player();
        p2 = new player();
        p3 = new player();

        while (true) {
            // Generate target number
            int targetNum = (int) (Math.random() * 10);

            // Call players to guess
            p1.guess();
            p2.guess();
            p3.guess();



            System.out.println("The target number is " + targetNum);


        }

    }
}

