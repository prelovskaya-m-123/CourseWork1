import java.util.Objects;

public class Employee {
    private int id;
    private String fullName;
    private int departmentNumber;
    private int salary;

    private static int idGenerator = 1;

    public Employee(FullName fullName, int departmentNumber, int salary) {
        id = idGenerator++;
        this.fullName = fullName.toString();
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    public String getFullName() {
        return this.fullName;
    }

    public int getDepartmentNumber() {
        return this.departmentNumber;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getId() {
        return this.id;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object otherEmployee) {
        if (otherEmployee == null || getClass() != otherEmployee.getClass()) return false;
        Employee employee = (Employee) otherEmployee;
        return id == employee.id && departmentNumber == employee.departmentNumber && salary == employee.salary && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullName, departmentNumber, salary);
    }

    @Override
    public String toString() {
        return id + " " + "ФИО-" + fullName + ",отдел=" + departmentNumber + ", зарплата=" + salary;
    }

}

