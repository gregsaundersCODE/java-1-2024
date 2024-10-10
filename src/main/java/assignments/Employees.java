package assignments;

public class Employees {
    public String FirstName;
    public String LastName;
    private double Salary;

    public Employees(String FirstName, String LastName, double Salary) {
        this.FirstName=FirstName;
        this.LastName=LastName;
        if (Salary > 0) {
            this.Salary=Salary;
        }
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public double getSalary() {
        return Salary;
    }


    public void setSalary(double salary) {
        Salary = salary;
    }

    public void giveRaise(double percent) {
        if (percent > 0) {
            Salary += Salary * (percent/100);
        }
    }
}