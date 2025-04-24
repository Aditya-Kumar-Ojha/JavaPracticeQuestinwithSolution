//write a Java function code that returns the sum of up to the given number, for example, the number is 4, so it will sum: 1+2+3+4;

import java.util.*;
class SumOfUptoGivenNumber {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System. out.println("Enter your number:");
       int number =sc.nextInt();
       int sum=0;
        for (int i=1;i<=number;i++){
            sum=sum+i;
           
        }
        System.out.println("sum of a given numver:"+ sum);
    }
}
