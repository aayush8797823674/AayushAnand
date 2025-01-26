import java.util.*;

public class Decimal_to_binary {

    public static void dec_bin(int decNum){
        int myNum = decNum;
        int binNum = 0;
        int power = 0;

        int rem;
        while(decNum > 0){
            rem = decNum%2;
            binNum = binNum + rem * (int)Math.pow(10, power);
            power++;
            decNum /= 2;
        }

        System.out.println("Binary of "+ myNum + " = "+ binNum);
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a number : ");
            int decNum = sc.nextInt();

            dec_bin(decNum);
        }
    }
}

