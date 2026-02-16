//employee salary calculator using hirarechy for dev and manager 
class Employee {

    String name;
    double basicSalary;

    Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
    }
}

class Developer extends Employee {

    double bonus;

    Developer(String name, double basicSalary, double bonus) {
        super(name, basicSalary);
        this.bonus = bonus;
    }

    void totalSalary() {
        System.out.println("Total Salary: " + (basicSalary + bonus));
    }
}

class Manager extends Employee {

    double allowance;

    Manager(String name, double basicSalary, double allowance) {
        super(name, basicSalary);
        this.allowance = allowance;
    }

    void totalSalary() {
        System.out.println("Total Salary: " + (basicSalary + allowance));
    }
}

class Main {
    public static void main(String[] args) {
        Developer d = new Developer("Rahul", 50000, 10000);
        d.display();
        d.totalSalary();

        Manager m = new Manager("Anil", 60000, 15000);
        m.display();
        m.totalSalary();
    }
}
