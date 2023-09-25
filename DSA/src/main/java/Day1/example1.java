package Day1;

import java.util.Scanner;

public class example1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên dương n: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Không thể tính giai thừa cho số âm.");
        } else {
            long factorial = calculateFactorial(n);
            System.out.println(n + "! = " + factorial);
        }
    }

    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            long result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }
}

