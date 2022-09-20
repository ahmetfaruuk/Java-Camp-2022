public class Main {
    public static void main(String[] args) {
        int[] sayilar = new int[]{1, 2, 5, 7, 9};
        int arancak = 9;

        boolean isTrue = false;

        for (int sayi : sayilar) {
            if (sayi == arancak) {
                isTrue = true;
                break;
            }
        }

        if (isTrue) {
            System.out.println(arancak + " sayısı mevcuttur");
        } else {
            System.out.println(arancak + " sayısı mevcut değildir.");
        }


    }
}
