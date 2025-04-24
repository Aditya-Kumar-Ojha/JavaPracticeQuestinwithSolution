// Use this editor to write, compile and run your Java code online
// table of a number 
import java. util.*;
class NumberTable{
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to find ou table:");
        int number =sc.nextInt();
        for(int i=1;i<=10;i++){
            int result=number*i;
            System.out.println(result);
        }
        
    }
}
