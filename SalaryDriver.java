public class SalaryDriver
{
    public static void main(String[] args) {
        Salary employee = new Salary();
        employee.setSalary();
        employee.setRating();
        employee.computeRaise();
        employee.printResults();
    }
}
