
public class Game {
    RandomWord randomWord;
    Fields fields;
    boolean isGameFinished = false,
            isWordChanged,
            isWin = false;

    public void init() {
        this.randomWord = new RandomWord();
        this.randomWord.generateRandomWord();
        this.fields = new Fields();
    }

    public void run(){
        // initialise required data
        this.init();

        // start while loop for requesting character
        // isGameFinished store the value for asking for new character to hungman game
        while (!this.isGameFinished) {
            // Firstly we need print what stage of process (hungman process)
            this.fields.printField();
            // We have to print what we have currently
            // for beginning of a game, It must be something like "____" .
            this.randomWord.printFloor();
            System.out.println(this.randomWord.getWord());
            // Word class can ask for new request, which mean you don't have to import everything into game class
            this.isWordChanged = this.randomWord.askForNewLetter();
            if (!this.isWordChanged) {
                this.fields.stage ++;
            }

            this.checkGameFinished();

        }

        if (isWin) {
            System.out.println("Kazandın");
        } else {
            System.out.println("Kaybettin");
        }

    }

    public void checkGameFinished() {

        if (this.randomWord.checkWordIsComplete()) {
            this.isGameFinished = true;
            this.isWin = true;
        }

        if (this.fields.stage == 4) {
            this.isGameFinished = true;
        }

    }

}
