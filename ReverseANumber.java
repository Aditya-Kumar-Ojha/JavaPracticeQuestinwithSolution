//Use a while loop to reverse a number entered by the user.
import java.util.*;
public class ReverseANumber {
    public static void main (String args []){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your number:");
        int number = sc.nextInt();
        int reverse=0;
        int sum=0;
       while(number !=0){
            int digit =number%10;
            reverse=reverse*10+digit;
            number=number/10;
            
        }
    //     while(number!=0){
    //        int digit=number%10;
    //        sum=sum+digit;
    //        number=number/10;
    // }
        System.out.println(reverse);
        System.out.println(sum);

        sc.close();
    }
}
