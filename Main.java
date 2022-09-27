/** Add Class comment and @ tags
* @author Zaid Ansar
* @version 1.0
* date 02/25/2022
* The purpose of this program is to calculate the salary of an hourly or salaried employee.
 */
class Main {
    public static void main(String[] args) {

        Employee DisneyEmployee[] = new Employee[4];
        DisneyEmployee[0] = new HourlyEmployee(1, "Zaid", "Ansar", 60, 45.00);
        DisneyEmployee[1] = new SalariedEmployee(2, "J. Jonah", "Jameson", 2000.00);
        DisneyEmployee[2] = new SalariedEmployee(3, "Miles", "Morales", 1500.00);
        DisneyEmployee[3] = new SalariedEmployee(4, "Norman", "Osborne", 2500.00);


        //Call the toString to Display Details
        for (int i = 0; i < DisneyEmployee.length; i++) {
            System.out.println(DisneyEmployee[i]);
            System.out.println("\n");
        }
    }
}