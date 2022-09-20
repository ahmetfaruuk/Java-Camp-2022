public class Main {
    public static void main(String[] args) {
        int number = 75;
        int count = 0;
        boolean isPrime=false;

        if (number<0){
            System.out.println("Geçersiz sayı");
            return;
        }
        if (number==1){
            System.out.println("1 asal değildir.");
            return;
        }
        for (int i = 2; i <= number; i++) {
            count = 0;
            for (int a = 1; a <= i; a++) {
                if (i % a == 0) {
                    count++;
                }
            }
        }
        if (count <= 2) {
            isPrime=true;
        }
        if (isPrime){
            System.out.println(number + " asaldır.");
        }else {
            System.out.println(number + " asal değildir.");
        }
    }
}
