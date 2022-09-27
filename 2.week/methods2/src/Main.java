public class Main {
    public static void main(String[] args) {
        String abc = myString();
        System.out.println(abc);
        int def = adding(5,6);
        System.out.println(def);

    }
    public static void add(){
        System.out.println("Eklendi.");
    }
    public static void delete(){
        System.out.println("Silindi.");
    }
    public static void update(){
        System.out.print("Güncellendi.");
    }
    public static String myString(){
        return "String methodun içindeki kod bloğu çalışıyor.";
    }
    public static int adding(int sayi1, int sayi2){
       return sayi1+sayi2;
    }
}