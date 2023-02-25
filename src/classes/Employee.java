package classes;

enum Gender{
    MALE,
    FEMALE
}

public class Employee {
    int id;
    String name;
    String department;
    int age;
    Gender gender;

    public Employee(int id, String name, String department, int age, Gender gender) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
        this.gender = gender;
    }

    /**
     * Outputs all information about Employee
     * */
    public void printEmployee(){
        System.out.println(this.id + '\t' + this.name + '\t' + this.department + '\t' + this.age + '\t' + this.gender);
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Hovsep", "Roof", 55, Gender.MALE);
        Employee employee2 = new Employee(1, "Narek", "Kitchen", 33, Gender.MALE);
        Employee employee3 = new Employee(1, "Ani", "Kitchen", 33, Gender.FEMALE);
    }
}
