import EmployeeClass.*;

import static java.lang.System.*;

public class EmployeeTest
{
    public static void main(String[] args)
    {
        Employee harry = new Employee("Harry, Hacker", 50000, 1989, 10, 1);
        harry.raiseSalary(5);
        out.println("name=" + harry.getName());
    }
}