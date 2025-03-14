
//interface
interface Protection  {
    abstract public double getSalary();
    abstract public void setSalary(double newSalary);
}

//abstract class 
abstract class Person {
    public String name;
    public String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void printName() {
        System.out.println("Name: " + name);
    }
}

//Employee class
class Employee extends Person implements Protection {
    private double salary;
    private static int numberEmployees = 0;

        public Employee(String name, String address, double salary) {
            super(name, address);
            this.salary = salary;
            numberEmployees +=1;
        }
    
        @Override
        public double getSalary(){
                return salary;
            }
        @Override
        public void setSalary(double chSalary){
                if (chSalary > (1.2*salary)){
                    salary = chSalary;
                }
                else;
                System.out.println("Cannot Change " + name + "'s salary") ;
            }
        public static int getNumberEmployees() {
                return numberEmployees;
            }

        public void getEmployeeInfo() {
                System.out.printf("%-10s%-10s%-10.2f\n", name, address, salary);
            }
    
}

//main class
public class EmployeeDriver {
    public static void main(String[] args) {
        Employee Mary = new Employee("Mary", "Leesburg,Va", 100000);
        Employee Jerry = new Employee("Jerry", "Sterling,Va", 50000);
        Employee Tom = new Employee("Tom", "Bowie,Md", 75000);

        System.out.println("Number of employees: " + Employee.getNumberEmployees());

        // Output table header
        System.out.printf("%-10s%-10s%-10s%n", "Name", "Address", "Salary");
        Mary.getEmployeeInfo();
        Jerry.getEmployeeInfo();
        Tom.getEmployeeInfo();

        Jerry.setSalary(55000); 
        Tom.setSalary(100000); 
    }
}