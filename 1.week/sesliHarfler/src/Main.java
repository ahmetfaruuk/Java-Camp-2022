public class Main {
    public static void main(String[] args) {
        char harf = 'A';
        boolean kalinHarf=false;
        boolean inceHarf=false;

        if (harf == 'A' || harf == 'I'||harf == 'O'||harf == 'U' ){
            kalinHarf = true;
            inceHarf=false;
        }else if (harf == 'E' || harf == 'İ'||harf == 'Ö'||harf == 'Ü'){
            inceHarf = true;
            kalinHarf=false;
        }
        if (kalinHarf){
            System.out.println(harf + " kalın bir harftir.");
        }else if (inceHarf){
            System.out.println(harf + " ince bir harftir.");
        }else {
            System.out.println( harf + " ince veya kalın bir harf değildir.");
        }
    }
}
