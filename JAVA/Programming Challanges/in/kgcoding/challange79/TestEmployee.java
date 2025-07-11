package in.kgcoding.challange79;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Nishant Kumar",22, 50000.0);
        System.out.println(emp1.getEmployeeDetails());
        emp1.setName("Nishant Kumar Singh");
        System.out.println(emp1.getEmployeeDetails());
    }
}
