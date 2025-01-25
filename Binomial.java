import java.util.*;

public class Binomial{

    public static int binCoeff(int n, int r){
        int n_fact = fact(n);
        int r_fact = fact(r);
        int n_m_fact = fact(n-r);

        return n_fact/ (r_fact * n_m_fact);
    }

    public static int fact(int n){
        int fact = 1;
            for(int i = 1; i <= n ; i++){
                fact *= i;
            }
        return fact;
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter n :");
            int n = sc.nextInt();
            System.out.print("Enter r :");
            int r = sc.nextInt();

            System.out.println("The Binomial Coefficient is : " + binCoeff(n,r) );
        }
    }
}


