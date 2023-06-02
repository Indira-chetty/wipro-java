import java.util.Scanner;

public class Main {
    public static int secondLastDigitOf(int input1) {
        if (input1 < 0) {
            input1 *= -1;
        }
        if (input1 < 10) {
            return -1;
        }
        int count = 2;
        int rem = 0;
        for (int i = 0; count> 0; i++) {
            rem = input1 % 10;
            count--;
            input1 /= 10;
            if (count ==0)
                break;
        }
        return rem;
    }

    public static void main(String args[]) {
        
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            System.out.println(secondLastDigitOf(num));
        
    }
}
