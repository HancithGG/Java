//employee salary calculator using hirarechy for dev and manager 
class Employee{
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display(){
        System.out.println("Employee name: "+name);
        System.out.println("Employee id: "+id);
    }
}
class Developer extends Employee{
    double bonus;

    Developer(int id, String name, double salary, double bonus){
        super(id, name, salary);
        this.bonus = bonus;
    }
    void paycheck(){
        System.out.println("final salary: "+(salary + bonus));
    }
}
class Manager extends Developer{
    double extra;

    Manager(int id, String name, double salary, double extra){
        super(id, name, salary, extra);
        this.extra = extra;
    }
    
}


class Main{
    public static void main(String[] args) {
        Developer oDeveloper = new Developer(1, "primeage", 1000, 500);
        oDeveloper.display();
        oDeveloper.paycheck();

        Manager oManager = new Manager(11, "sirish", 10000, 999);
        oManager.display();
        oManager.paycheck();
    }

        
}
