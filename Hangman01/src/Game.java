import java.util.Scanner;

public class Game {
    static int wrongNumber = 0;
    Fields field;
    RandomWord randomWord;
    boolean isGameContinue = true, isWordComplete = false;

    public void init() {
        this.field = new Fields();
        this.randomWord = new RandomWord();
        randomWord.generateRandomWord();
    }

    public void run(){
        this.init();
        this.field.printField(wrongNumber);
        this.randomWord.printFloor();
        while(this.isGameContinue){
            this.randomWord.setLetter();
            this.openLetter();
        }
        this.isGameWin();
    }

    public void openLetter(){
        if(this.randomWord.isContain(this.randomWord.letter)){
            this.field.printField(wrongNumber);
            this.randomWord.replaceLetter(this.randomWord.letter);
            this.randomWord.printFloor();
            this.isGameContinue();
            this.isWordComplete();
        }else{
            this.incrementWrongNumber();
            this.field.printField(wrongNumber);
            this.randomWord.printFloor();
            this.isGameContinue();
        }
    }
    public void incrementWrongNumber() {
        this.wrongNumber++;
    }
    public boolean isGameContinue() {
        if(wrongNumber == 4){  // isWordComplete with '||' was added but, it does not work. After, it was removed.
            isGameContinue = false;
        }
        return this.isGameContinue;
    }

    public void isGameWin(){
        if(this.isWordComplete()){
            System.out.println("YOU WON!");
        }else{
            System.out.println("YOU DID NOT WIN!");
            System.out.println("The word that you could not know: " + this.randomWord.getWord());
        }
    }
    public boolean isWordComplete(){
        if (this.randomWord.getWord().equals(this.randomWord.getFloor())){
            this.isWordComplete = true;
            this.isGameContinue = false;
        }
        return this.isWordComplete;
    }

}
