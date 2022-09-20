public class Main {
    public static void main(String[] args) {
        int number=28;
        int total=0;
        boolean isPerfectNumb = false;
        for (int i= 1; i < number; i++){
            if (number % i==0){
                total +=i;
            }
        }
        if (total == number){
            isPerfectNumb =true;
        }
        if (isPerfectNumb) {
            System.out.println(number + " mükemmel bir sayıdır.");
        }else {
            System.out.println(number + " mükemmel bir sayı değildir.");
        }
    }
}
