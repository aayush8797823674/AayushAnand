import java.util.*;

public class Binary_to_decimal {

    public static void bin_dec(int binNum){
        int myNum = binNum;
        int decNum = 0;
        int power = 0;

        int lastDigit;
        while(binNum > 0){
            lastDigit = binNum%10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, power));

            power++;
            binNum /= 10;
        }

        System.out.println("decimal of "+ myNum + " = "+ decNum);
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a number : ");
            int binNum = sc.nextInt();

            bin_dec(binNum);
        }
    }
}
