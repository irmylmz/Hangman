import java.util.Scanner;

public class RandomWord {
    private String[] words = {"terminatör" , "araba" , "yazılım" , "bilgisayar" , "pilot" , "jet" ,
            "asker" , "klavye" ,"çıkış" , "cehennem" , "koltuk" , "kesik" , "kaza" , "trafik" , "takım" , "çay"
            , "dergi" , "ilaç" , "ölüm" , "beyaz" , "sistem" , "öğrenci" , "ürün" , "başarı" , "doğru" , "yanlış" , "baskı"
            , "teknoloji" , "hava" , "televizyon" , "kahve" , "altın" , "gümüş" , "güven" , "tebessüm" , "bot" , "kristal"
            , "yaprak" , "oyun" , "adam" , "vadi" , "toprak" , "tsunami"};
    private String word;
    private String floor;
    boolean isWordChanged;

    Scanner scanner = new Scanner(System.in);

    public void generateRandomWord(){
        this.setWord(words[(int) (Math.random() * words.length)]);
        this.setFloor("_".repeat(this.getWord().length()));
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public boolean isContain(Character expected_letter) {
        return this.getWord().contains(String.valueOf(expected_letter));
    }

    public void replaceLetter(Character expected_letter) {

        for (int i=0; i<this.getWord().length(); i++) {
            if (this.getWord().charAt(i) == expected_letter) {
                char characters[] = this.floor.toCharArray();
                characters[i] = expected_letter;
                this.floor = String.valueOf(characters);
            }
        }

    }
    public void printFloor(){
        System.out.println(this.getFloor());
    }

    // I created another function for requesting character input from user
    // This function returns boolean because, we have to determine whether we change something or not
    public boolean askForNewLetter() {
        System.out.print("Enter a character: ");
        Character newLetter = this.scanner.next().charAt(0);

        // Irem's solution
        this.isWordChanged = this.isContain(newLetter);
        if (this.isWordChanged) {
            this.replaceLetter(newLetter);
        }
        return this.isWordChanged;

    }

    public boolean checkWordIsComplete() {
        return !this.getFloor().contains("_");
    }

}
