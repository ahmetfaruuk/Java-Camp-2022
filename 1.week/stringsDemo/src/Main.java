import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel";

        System.out.println("Eleman sayısı: " + mesaj.length());
        System.out.println("Beşinci eleman: " + mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yaşasın!"));
        System.out.println(mesaj.startsWith("B"));
        System.out.println(mesaj.endsWith("x"));
        char[] karakterler = new char[10];
        mesaj.getChars(0, 10, karakterler, 0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("c"));
        System.out.println(mesaj.lastIndexOf("a"));
        System.out.println("---------------------");

        String yeniMesaj = mesaj.replace(" ", "-");
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(6,10));
        for (String kelimeler : mesaj.split(" ")) {
            System.out.println(kelimeler);
        }
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
    }
}
