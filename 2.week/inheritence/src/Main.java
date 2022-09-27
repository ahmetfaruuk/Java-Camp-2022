public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Customer customer = new Customer();
        Employee employee = new Employee();

        PersonManager personManager = new PersonManager();
        CustomerManager customerManager = new CustomerManager();
        EmployeeManager employeeManager = new EmployeeManager();
        customerManager.list();
        customerManager.customerOfTheMonth();
    }
}
