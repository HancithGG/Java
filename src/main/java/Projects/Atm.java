package Projects;
import java.util.Scanner;
public class Atm {
    public static void main(String[] args) {

        int incorrect_pin = 3;
        int original_pin = 2828;

        Scanner sc = new Scanner(System.in);
        System.out.println("\tATM");
        System.out.println("-------------------------------");
        System.out.println("Welcome!");
        
        int choice = 0;
        while(incorrect_pin != 0){
            System.out.print("enter your pin to continue: ");
            int pin = sc.nextInt();
        if(original_pin == pin){

            int balance = 1000, amount = 0;
            while(choice < 4){
            System.out.println("\n1. Widthdraw");
            System.out.println("2. Deposite");
            System.out.println("3. check balance");
            System.out.print("4. exit\nenter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:{
                    if(balance > 0){
                        System.out.print("\nenter the amount: ");
                        amount = sc.nextInt();
                        balance -= amount;
                        
                        System.out.println("cash is widthdraw "+amount);
                    }
                    else{
                        System.out.println("\nno cash is available");
                    }
                }   
                    break;
                
                case 2:{
                    System.out.println("\nenter amount to deposite: ");
                    amount = sc.nextInt();
                    balance += amount;
                    System.out.println("\n"+amount+" rs is deposite successfully ");
                }break;

                case 3:{
                    System.out.println("\nBalance: "+balance);
                }break;

                case 4:{
                    System.out.println("Your last transaction is canceled");
                }break;

                default:
                    System.out.println("Your last transaction is canceled");
                    break;
            }
            
        }   
        }
        else{
            
            incorrect_pin -= 1;
            if(incorrect_pin == 2){
            System.out.println("Pin code you incorrect and you have "+incorrect_pin+" attempts left");
            }
            else if(incorrect_pin == 1){
                System.out.println("Pin code you incorrect and you have "+incorrect_pin+" attempts left");
            }
            else{
                System.out.println("Your last transaction is canceled");
            }
           
        }
        if(choice <= 4){
                break;
            }
        }
    }
}
