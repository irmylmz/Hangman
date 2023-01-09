public class RandomWord {
    private String[] words = {"terminatör" , "araba" , "yazılım" , "bilgisayar" , "pilot" , "jet" ,
            "asker" , "klavye" ,"çıkış" , "cehennem" , "koltuk" , "kesik" , "kaza" , "trafik" , "takım" , "çay"
            , "dergi" , "ilaç" , "ölüm" , "beyaz" , "sistem" , "öğrenci" , "ürün" , "başarı" , "doğru" , "yanlış" , "baskı"
            , "teknoloji" , "hava" , "televizyon" , "kahve" , "altın" , "gümüş" , "güven" , "tebessüm" , "bot" , "kristal"
            , "yaprak" , "oyun" , "adam" , "vadi" , "toprak" , "tsunami"};
    private String word;
    private String floor;

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
        this.floor.replace('_',expected_letter);
    }
    public void printFloor(){
        System.out.println(this.getFloor());
    }

}
