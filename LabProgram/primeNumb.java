public class primeNumb {
    public static void main(String[] args) {

        
       
        System.out.println("prime numbers from 1 - 100");

        for (int i = 2; i <= 100; i++) {

              boolean isPrime = true ;

              for(int j = 2; j < i ;j++){

                  if (i % j == 0){
                    
                     isPrime = false ; //not prime
                

                     break;
             }

         }

        if (isPrime){
            System.out.print(i + " ");
        }
     }
    
    }
}

