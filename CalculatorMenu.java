// Online Java Compiler
// Create a simple menu-driven calculator using a do-while loop. Display options

import java.util.*;
public class CalculatorMenu {
    public static void main (String args []){
       Scanner scanner = new Scanner (System.in);
       double num1,num2,result;
       int choice;
    do{
        //display menu
        System.out.println("---Calculator Menu---");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Exit");
        System.out.println("Enter your choice:");
        choice=scanner.nextInt();
        switch(choice){
            case 1:
                System.out.println("Enter two numbers:");
                num1=scanner.nextDouble();
                num2=scanner.nextDouble();
                result=num1+num2;
                System.out.println("result:"+ result);
                break;
            case 2:
                System.out.println("Enter two numbers:");
                num1=scanner.nextDouble();
                num2=scanner.nextDouble();
                result=num1-num2;
                System.out.println("result:"+ result);
                break;
            case 3:
                System.out.println("Enter two numbers:");
                num1=scanner.nextDouble();
                num2=scanner.nextDouble();
                result=num1*num2;
                System.out.println("result:"+ result);
                break;
            case 4:
                System.out.println("Enter two numbers:");
                num1=scanner.nextDouble();
                num2=scanner.nextDouble();
                result=num1/num2;
                System.out.println("result:"+ result);
                break;
            case 5:
                System.out.println("Exiting calculator.Goodbye !");
                break;
            default:
                System.out.println("Invalid choice, please try again.");
        }
    }while(choice != 5);
    scanner.close();
    
    }
}