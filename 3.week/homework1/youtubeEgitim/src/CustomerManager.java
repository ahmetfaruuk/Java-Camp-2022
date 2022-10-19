public class CustomerManager {
    private Customer _customer;
    private Person _person;
    private Company _company;

    private ICreditManager _creditManager;
    public CustomerManager(Customer customer, ICreditManager creditManager)/* Person person,Company company*/{
        _customer = customer;
        /*_person = person;
        _company = company;*/
        _creditManager = creditManager;

    }
    /*public CustomerManager(Person person){
        _person= person;
    }*/
    public void save(){
        System.out.println("Customer saved successfully! " );
    }
    public void delete(){
        System.out.println("Customer deleted successfully! ");
    }

    public void giveCredit(){
        _creditManager.calculate();
        System.out.println("Kredi  verildi.");
    }



}
