public class Main {
    public static void main(String[] args) {
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel! A ile geçtiniz.");
                break;
            case 'B':
                System.out.println("Çok iyi! B ile geçtiniz.");
                break;
            case 'C':
                System.out.println("Tebrikler! C ile geçtiniz.");
                break;
            case 'D':
                System.out.println("D ile geçtiniz!");
                break;
            case 'F':
                System.out.println("Malesef F ile kaldınız.");
                break;
            default:
                System.out.println("Not bilgisi bulunamadı!");
                break;

        }
    }
}
