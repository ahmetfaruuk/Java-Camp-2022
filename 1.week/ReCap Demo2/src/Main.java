public class Main {
    public static void main(String[] args) {
        double[] ogrenciler = {1.5, 15.7, 45.62, 11.7, 9.5};
        double max = ogrenciler[0];
        double total = 0;

        for (double ogrenci : ogrenciler) {
            if (max<ogrenci){
                max = ogrenci;
            }
            total += ogrenci;
            System.out.println(ogrenci);
        }
        System.out.println("-------------------------------");
        System.out.println("En büyük sayı: " + max);
        System.out.println("Sayıların toplamı: " + total);
    }
}
