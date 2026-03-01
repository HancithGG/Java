package Projects;
import java.util.*;

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        

        while(true){
            System.out.println("-----------Employee Salary Calculation------------------------");
            System.out.println("Job Type: \n");
            System.out.println("1. Part-time Employee Job");
            System.out.println("2. Full-time Employee Job");
            System.out.println("3. Contract Employee Job");
            System.out.println("4. exit");
            System.out.print("Enter you choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:{
                    System.out.println("--------------------Part time job calculation-----------------------");
                    PartTime oPartTime = new PartTime(null, choice, choice);
                    oPartTime.finalSalary();
                    
                }
                    break;

                case 2:{
                     System.out.println("--------------------Full time or Contract based calculation-----------------------");
                    FullTime oFullTime = new FullTime(null, choice);
                    oFullTime.finalSalary();
                    
                }
                    break;
                case 3:{
                    System.out.println("--------------------Contract based salary calculation-----------------------");
                    Contract oContract = new Contract(null, choice, null);
                    oContract.finalSalary();
                }
                    break;
                case 4:{
                    
                    System.out.println("Thank you!");
                    break;
                }
                
                    
                default:
                    System.out.println("\nerror enter write number\n");
                    break;
            }
            if(choice ==4){
                break;
            }
        }
    }
}
class DefaultJob{
    
    Scanner sc = new Scanner(System.in);

    String EmployeeName;
    double salary;


    DefaultJob(String EmployeeName, double salary){
        
        System.out.print("Enter Employee name: ");
        EmployeeName = sc.nextLine();

        System.out.print("Enter salary: ");
        salary = sc.nextDouble();

        this.EmployeeName = EmployeeName;
        this.salary = salary;
          
    }
}
class PartTime extends DefaultJob{
    int hrsWorked;

    PartTime(String EmployeeName, double salary,  int hrsWorked ){
        super(EmployeeName, salary); // must be first or else throws an error 

        
        

        System.out.print("Enter no of hrs: ");
        hrsWorked = sc.nextInt();

        
        this.hrsWorked = hrsWorked;
        
        
        
    }

    void finalSalary(){
        System.out.println("\nFinal Salary per day: "+(hrsWorked * salary)+"\n");
    }

   
}
class FullTime extends DefaultJob{
    FullTime(String EmployeeName, double salary){
        super(EmployeeName, salary);

       
    }

    void finalSalary(){
        System.out.println("\nFinal Salary per month: "+salary+"\n");
    }
}
class Contract extends DefaultJob{
    String ContractName;

    Contract (String EmployeeName,  double salary, String ContractName){
        
        super(EmployeeName, salary);

        

    
        System.out.print("enter contract name: ");
        sc.nextLine();
        ContractName = sc.nextLine();
        this.ContractName = ContractName;


    }

    void finalSalary(){
        System.out.println("\nFinal Salary per contract "+"'"+ContractName+"' : "+salary+"\n");
    }
}