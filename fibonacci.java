import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args){
     
       Scanner sc = new Scanner(System.in); 

       System.out.println("Enter the limit:");

       int limit = sc.nextInt();

       int  a = 0 , b = 1 ;
       int next = 0 ;

        System.out.print("fibonacci series:"  + a +" "+ b );
         
         next=a+b;

         while  ( next <= limit ) {
            System.out.print(" "+next);
            a=b;
            b=next;
            next=a+b;
         }

      }

    }
