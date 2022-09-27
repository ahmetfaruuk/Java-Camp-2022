public class Main {
    public static void main(String[] args) {
        BasicMathOperations basicMathOperations = new BasicMathOperations();
        int a = basicMathOperations.add(1, 2);
        int b = basicMathOperations.cikarma(3, 4);
        int c = basicMathOperations.carpma(5, 5);
        int d = basicMathOperations.bolme(40, 2);

        int[] values = new int[]{a, b, c, d};

        for (int val : values) {
            System.out.println(val);
        }
    }
}
