public class HourlyEmployee extends Employee {

    private double hoursWorked;
    private double hourlyRate;

    // Default Constructor
    public HourlyEmployee() {
        super();
    }

    /**
     * Parameter constructor to instantiate HourlyEmployee 
     * objects (hoursWorked and hourlyRate)
     *
     * @param employeeId
     * @param firstName
     * @param lastName
     * @param hoursWorked
     * @param hourlyRate
     */


    // Overloaded Constructor
    public HourlyEmployee(int employeeId, String firstName, String lastName, double hoursWorked, double hourlyRate) {
        super(employeeId, firstName, lastName);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    // Getter Methods for local variables of this class (hoursWorked and hourlyRate)
    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    // Setter Methods 
    public void setHoursWorked(double hours) {
        this.hoursWorked = hours;
    }

    public void setHourlyRate(double rate) {
        this.hourlyRate = rate;
    }

    // Abstract method
    /**
     * 
     * Function to calculate the salary of an employee, all child
     * classes must override this function.
     * 
     * @return salary
     */
  
    public double calculateSalary() {
        double salary = 0;
        double overtime = 0;

        if (hoursWorked > 40) {
            double hours = hoursWorked - 40;
            hoursWorked = 40;
            overtime = hours * (hourlyRate * 1.25);
        }

        salary = hoursWorked * hourlyRate;
        salary += overtime;

        return salary;
    }

    @Override
    public String toString() {
        return super.toString() +
            String.format("%-20s %.2f%n", "Salary:", calculateSalary());
    }









}