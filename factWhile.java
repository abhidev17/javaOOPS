
import java.util.Scanner;

public class factWhile {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        int fact=1, i=1;
        while(i<=num){
            fact*=i;
            i++;
        } System.out.println(" factorial of " + num + " is          "  + fact);
        scanner.close();
    }
    
}
