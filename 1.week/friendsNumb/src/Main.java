public class Main {
    public static void main(String[] args) {
        int numb1= 220, numb2 = 284, total1 = 0, total2 = 0;

        for (int i=1; i<numb1; i++){
            if (numb1 % i==0){
                total1+=i;
            }
        }
        for (int a = 1; a <numb2; a++){
            if (numb2 % a ==0){
                total2+= a;
            }
        }
        if (numb1 ==total2 && numb2 == total1) {
            System.out.println(numb1 + " ve " + numb2 + " arkadaş sayılardır.");
        }else {
            System.out.println(numb1 + " ve " + numb2 + " arkadaş sayı değiller.");
        }
    }
}
