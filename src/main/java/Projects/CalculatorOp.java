package Projects;

import java.util.Scanner;

public class CalculatorOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
       

       
        int  num1 = sc.nextInt();
        int result = num1;
        
        while( true){
        
        char operator = sc.next().charAt(0);
       
        int num2 = sc.nextInt();
        
        
        
            switch (operator) {
                case '+':
                    
                    result += num2;
                    System.out.println("= "+result);
                    break;
                case '-':
                     result -= num2;
                    System.out.println( "= "+result);
                    break;
                case '*':
                     result *= num2;
                    System.out.println( "= "+result);
                    break;
                case '/':
                     result /= num2;
                    System.out.println("= "+ result);
                    break;
                case '%':
                     result %= num2;
                    System.out.println("= "+result);
                    break; 
                default:
                    
                    return;
            
      
              }
           
         }   
    }
}

