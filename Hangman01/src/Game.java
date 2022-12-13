import java.util.Scanner;

public class Game {
    RandomWord randomWord = new RandomWord();
    Scanner scanner = new Scanner(System.in);
    String word = randomWord.randomWord();
    String floor = "_".repeat(word.length());
    static int wrongNumber = 0;


    public void run(){
        Fields fields = new Fields(wrongNumber);
    }
}
