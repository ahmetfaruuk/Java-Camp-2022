import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /* int sayi1=10;
         int sayi2=20;
         sayi1 =  sayi2;
         sayi2 = 100;

        System.out.println(sayi1);

        int[] sayilar1 = new int[] {1,2,3};
        int[] sayilar2 = new int[] {10,20,30};

        sayilar1 = sayilar2 ;
        sayilar2[0] = 10000;
        System.out.println(sayilar2[0]);*/

        CreditManager creditManager = new CreditManager();
        creditManager.save();

        Customer customer = new Customer();
        customer.Id = 7;
       /* Person person = new Person();
        person.FirstName = "Ahmet";
        person.LastName = "Dönmez";
        Company company = new Company();
        company.CompanyName = "Arcelik";


        CustomerManager customerManager = new CustomerManager(customer,);
        customerManager.delete();
        customerManager.save();*/
        //IoC Container !
        CustomerManager customerManager = new CustomerManager(new Customer(),new MilitaryCreditManager());
        customerManager.giveCredit();

    }
}
