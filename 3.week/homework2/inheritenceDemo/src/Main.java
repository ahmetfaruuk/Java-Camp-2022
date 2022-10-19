import java.security.Key;

public class Main {
    public static void main(String[] args) {
        CreditUI creditUI = new CreditUI();
        creditUI.creditcalculate(new TeacherCreditManager());
    }
}
