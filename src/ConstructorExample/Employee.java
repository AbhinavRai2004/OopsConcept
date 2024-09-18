package ConstructorExample;

public class Employee {
    String name;
    int empId;

    Employee(String name,int empId){
        this.name = name;
        this.empId = empId;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Abhinav", 101);
        Employee e2 = new Employee("Deepak", 102);

        System.out.println("Employee1 : " + e1.name + " " + e1.empId);
        System.out.println("Employee2 : " + e2.name + " " + e2.empId);
    }
}
