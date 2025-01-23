import java.util.*;
public class Income_tax_calculator {
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter Income:");
            int income = sc.nextInt();

            if(income < 500000){
                System.out.println("0% tax");
            }
            else if(income >= 500000  && income < 1000000){
                System.out.println("20% tax");
            }
            else{
                System.out.println("30% tax");
            }
        }
    }
}
