
import java.util.Scanner;

public class primeNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num =  sc.nextInt();
        int flag  = 0 ;
        for(int i =2; i< num ;i++){
            if (num%i==0){
                flag=1;
                break;
            }
        }
        if (flag==1){
            System.out.println("not prime");
        } else{
            System.out.println("Prime");
        }
        sc.close();
    }
}
