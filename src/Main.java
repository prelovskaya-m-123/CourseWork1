public class Main {
    public static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        FullName fullName1 = new FullName("Иванов", "Иван", "Иванович");
        FullName fullName2 = new FullName("Сергеев", "Сергей", "Сергеевич");
        FullName fullName3 = new FullName("Петров", "Петр", "Петрович");
        FullName fullName4 = new FullName("Алексеев", "Алексей", "Алексеевич");
        FullName fullName5 = new FullName("Семенов", "Семен", "Семенович");
        FullName fullName6 = new FullName("Олегов", "Олег", "Олегович");
        FullName fullName7 = new FullName("Александров", "Александр", "Александрович");
        FullName fullName8 = new FullName("Данилов", "Данил", "Данилович");
        FullName fullName9 = new FullName("Максимов", "Максим", "Максимович");
        employees[0] = new Employee(fullName1, 1, 85000);
        employees[1] = new Employee(fullName2, 2, 76000);
        employees[2] = new Employee(fullName3, 3, 115000);
        employees[3] = new Employee(fullName4, 4, 105000);
        employees[4] = new Employee(fullName5, 5, 95000);
        employees[5] = new Employee(fullName6, 1, 80000);
        employees[6] = new Employee(fullName7, 2, 94000);
        employees[7] = new Employee(fullName8, 3, 92000);
        employees[8] = new Employee(fullName9, 4, 100000);
        employees[9] = new Employee(fullName1, 5, 88000);
        System.out.println("Сравниваем двух сотрудников: " + employees[0].equals(employees[1]));
        System.out.println("Сравниваем двух сотрудников: " + employees[0].equals(employees[9]));
        printAllEmployee();
        System.out.println();
        System.out.println("Сумма затрат на ЗП в месяц: " + calculateSumOfSalary());
        System.out.println("Сотрудник с минимальной ЗП: №" + findEmployeeWithMinSalary());
        System.out.println("Сотрудник с максимальной ЗП: №" + findEmployeeWithMaxSalary());
        System.out.println("Среднее значение зарплат: " + calculateAverageSalary());
        System.out.println();
        System.out.println("ФИО всех сотрудников:");
        printFullNameAllEmployee();
        System.out.println();


    }

    public static void printAllEmployee() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    public static int calculateSumOfSalary() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employees [i] == null) {
                continue;
            }
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee findEmployeeWithMinSalary() {
        Employee employeeWithMinSalary = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                employeeWithMinSalary = employees[i];
                break;
            }
        }
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employees[i] != null && employee.getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = employee;
            }
        }
        return employeeWithMinSalary;
    }

    public static Employee findEmployeeWithMaxSalary() {
        Employee employeeWithMaxSalary = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                employeeWithMaxSalary = employees[i];
                break;
            }
        }
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employees[i] != null && employee.getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = employee;
            }
        }
            return employeeWithMaxSalary;
    }

    public static double calculateAverageSalary() {
        int nonNullCount = 0;
        int sum = calculateSumOfSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                nonNullCount++;
            }
        }
        return (double) sum / nonNullCount;
    }



    public static void printFullNameAllEmployee() {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employees[i] == null) {
                continue;
            }
            System.out.println(employees[i].getFullName());
            }
        }
    }














