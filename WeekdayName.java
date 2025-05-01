
//Write a Java program that takes a number (1-7) from the user and prints the corresponding day of the week
import java.util.*;
public class WeekdayName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weekday number:");
        int weeknumber;
        do { 
            weeknumber=scanner.nextInt();
            switch(weeknumber){    
                case 1:
                     System.out.println("Monday");
                     break;
                case 2:
                     System.out.println("Teusday");
                     break;
                case 3:
                     System.out.println("wednesday");
                     break;
                case 4:
                     System.out.println("Thrusday");
                     break;
                case 5:
                     System.out.println("Friday");
                     break;
                case 6:
                     System.out.println("Saturday");
                     break;
                case 7:
                     System.out.println("Sunday");
                     break;
                case 8:
                    System.out.println("Exiting from program.Goodbye !");
                    break;
    
                default:
                     System.out.println("Invalid weeknumber! please try again");
            
            } 
        }  while (weeknumber != 8 );
        scanner.close();
    
    }
}