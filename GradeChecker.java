import java.util.*;
public class GradeChecker {
public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        char grade;
        do{
            System.out.print("Enter a grade (A, B, C, D, F) or X to exit: ");
            grade = scanner.next().toUpperCase().charAt(0);
            switch(grade){
                case 'A' -> System.out.println("Your grade is A: Excellent!");
                case 'B' -> System.out.println("Your grade is B: Good!");
                case 'C' -> System.out.println("Your grade is C: Average!");
                case 'D' -> System.out.println("Your grade is D: Below Average!");
                case 'F' -> System.out.println("Your grade is F: Fail!");
                case 'X' -> System.out.println("Exiting from program.Goodbye !");
                    
                default -> System.out.println("Invalid grade! please try again");
            }
        }while(grade != 'X' );
    }   
}
}  
