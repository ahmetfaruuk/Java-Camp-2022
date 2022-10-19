public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Customer customer = new Customer();
        employee.firstName = "Ahmet";
        System.out.println(employee.firstName);
        EmployeeManager employeeManager = new EmployeeManager();
        CustomerManager customerManager = new CustomerManager();
        customerManager.customerOfYear();

    }
}
