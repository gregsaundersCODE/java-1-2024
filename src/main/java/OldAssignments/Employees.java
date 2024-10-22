package OldAssignments;

/**
 * employees class that has three objects: first name (string), last name (string), salary (double)
 */
public class Employees {
    public String FirstName;
    public String LastName;
    private double Salary;


    /**
     *
     * @param FirstName
     * @param LastName
     * @param Salary
     */
    public Employees(String FirstName, String LastName, double Salary) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        if (Salary > 0) {
            this.Salary = Salary;
        }
    }

    /**
     * getter for first name
     * @return first name
     */
    public String getFirstName() {
        return FirstName;
    }

    /**
     * setter for first name
     * @param firstName
     */
    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    /**
     * getter for last name
     * @return last name
     */
    public String getLastName() {
        return LastName;
    }

    /**
     * setter for last name
     * @param lastName
     */
    public void setLastName(String lastName) {
        LastName = lastName;
    }

    /**
     * getter for salary
     * @return salary
     */
    public double getSalary() {
        return Salary;
    }

    /**
     * setter for salary
     * @param salary
     */
    public void setSalary(double salary) {
        Salary = salary;
    }

    /**
     * function that calculates a raise dividing the percent of the raise by
     * one hundred as long as the percent is more than 0,
     * and then multiplies it by salary then adds the salary.
     * @param percent
     */
    public void giveRaise(double percent) {
        if (percent > 0) {
            Salary += Salary * (percent / 100);
        }
    }
}