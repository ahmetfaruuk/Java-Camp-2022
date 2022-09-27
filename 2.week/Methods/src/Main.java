public class Main {
    public static void main(String[] args) {
        myMethod();
    }
    public static void myMethod(){
        int number = 6;
        int[] numbs = new int[]{1,9,5,4,6};

        for (int numb:numbs) {
            if (numb==number){
                message("Aradığınız sayı mevcut: " + number);
            }
        }
    }
    public static void message(String mesaj){
       /* String myMessage = "Aradığınız sayı mevcut: " + number;
        System.out.println(myMessage);
        */
        System.out.println(mesaj);
    }

}