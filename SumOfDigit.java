
/*Write a program that reads an integer from the user and calculates the sum of its digits using a while loop.*/
import java . util.*;

class SumOfDigit{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int number=sc.nextInt();
        int sum=0;
        number=Math.abs(number); // make the number non negative
        
        while(number!=0){
            int digit=number%10;
            sum=sum+digit;
            number=number/10;
        }
        System.out.println("Sum of digit of it's number:"+ sum);
    }
}