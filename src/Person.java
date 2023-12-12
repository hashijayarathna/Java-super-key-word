public class Person {
    int nic;
    String name;
    Person(int nic, String name) {
        this.nic = nic;
        this.name = name;
    }
}
class Employee extends  Person {
    float salary;
    Employee(int nic, String name, float salary) {
        super(nic, name);
        this.salary = salary;
    }
    void output() {
        System.out.println(nic + " " + name + " " + salary);
    }
}
class Test2 {
    public static void main(String[] args) {
        Employee e = new Employee(20005678, "Amali", 10000f);
        e.output();
    }
}
