import java.util.*;

public class Palindrome {

    public static void checkPd(int pdNum){
        if(isPalindrome(pdNum)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }

    public static boolean isPalindrome(int pdNum){
        int originalNum = pdNum;
        int reverseNum = 0 ;

        while(pdNum > 0){
            int ld = pdNum %10;
            reverseNum = reverseNum*10 + ld;
            pdNum /= 10;
        }
        return  originalNum == reverseNum;
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a number : ");
            int pdNum = sc.nextInt();

            checkPd(pdNum);
        }
    }
}
