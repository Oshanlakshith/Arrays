import java.util.HashMap;
import java.util.Scanner;

public class Bowling {
    HashMap<String, Integer> players;

    Bowling() {
        players = new HashMap<String, Integer>();
    }

    public void addPlayer(String name, int p) {
        players.put(name, p);
    }

    //your code goes here
    public void getWinner() {

    }

}

class Program {
    public static void main(String[] args) {
        Bowling game = new Bowling();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter name : ");
            String name = sc.next();

            System.out.print("Enter Values :");
            int points = sc.nextInt();
            game.addPlayer(name, points);
        }
        game.getWinner();
    }
}
