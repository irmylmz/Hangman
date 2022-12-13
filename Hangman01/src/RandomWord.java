public class RandomWord {
    private String[] words = {"terminatör" , "araba" , "yazılım" , "bilgisayar" , "pilot" , "jet" ,
            "asker" , "klavye" ,"çıkış" , "cehennem" , "koltuk" , "kesik" , "kaza" , "trafik" , "takım" , "çay"
            , "dergi" , "ilaç" , "ölüm" , "beyaz" , "sistem" , "öğrenci" , "ürün" , "başarı" , "doğru" , "yanlış" , "baskı"
            , "teknoloji" , "hava" , "televizyon" , "kahve" , "altın" , "gümüş" , "güven" , "tebessüm" , "bot" , "kristal"
            , "yaprak" , "oyun" , "adam" , "vadi" , "toprak" , "tsunami"};
    private String word;

    public String randomWord(){
        return word = words[(int) (Math.random() * words.length)];
    }
}
