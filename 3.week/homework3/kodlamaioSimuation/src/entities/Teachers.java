package entities;

public class Teachers {

    String firstName;
    String lastName;
    double age;
    String email;
    String description;

    public Teachers(String firstName,String lastName,double age,String email,String description){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.description = description;
    }
    public String getFirstName(String firstName) {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
