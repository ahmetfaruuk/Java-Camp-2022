public class Main {
    public static void main(String[] args) {
        String[][] sehirler = new String[3][3];

        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Ankara";
        sehirler[0][2] = "İzmir";
        sehirler[1][0] = "Malatya";
        sehirler[1][1] = "Adıyaman";
        sehirler[1][2] = "Mersin";
        sehirler[2][0] = "Isparta";
        sehirler[2][1] = "Samsun";
        sehirler[2][2] = "Zonguldak";

        for (int a = 0; a <= 2; a++) {
            for (int b = 0; b <= 2; b++) {
                System.out.println(sehirler[a][b]);
            }
            if (a < 2) {
                System.out.println("--------------------");
            }
        }
    }
}
