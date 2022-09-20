public class Main {
    public static void main(String[] args) {
        //for
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("For döngüsü bitti");
        int z = 8;
        while (z > 5) {
            System.out.print(z - 5 + " ");
            z--;
        }
        System.out.println("While döngüsü bitti.");
        int j= 1;
        do {
            System.out.print(j + " ");
            j+=5;
        }while (j<20);
        System.out.print("Do while döngüsü bitti.");
    }
}

