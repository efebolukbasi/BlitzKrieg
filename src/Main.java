import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many players: ");
        int numPlayers = in.nextInt();

        Game game = new Game(numPlayers);
        game.play();


        System.out.print("Hello world");

    }
}