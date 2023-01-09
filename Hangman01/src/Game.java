import java.util.Scanner;

public class Game {
    RandomWord randomWord = new RandomWord();
    Scanner scanner = new Scanner(System.in);
    private int wrongNumber = 0;

    public void init() {
        randomWord.generateRandomWord();
    }

    public void run(){
        this.init();
        Fields fields = new Fields();
        // Lets assume scanner object gets value
        // scanner.next().charAt(0);
        // println
        fields.printField(wrongNumber);
        randomWord.printFloor();
        Character letter = scanner.next().charAt(0);
        if (randomWord.isContain(letter)) {
            randomWord.replaceLetter(letter);
        } else {
            this.incrementWrongNumber();
        }
        fields.printField(wrongNumber);
        randomWord.printFloor();
        Character letter1 = scanner.next().charAt(0);
        fields.isGameContinue(wrongNumber);
        
    }

    public void incrementWrongNumber() {
        this.wrongNumber++;
    }
}
