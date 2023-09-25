package Day1;

public class example2 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 25;
        int num3 = 7;

        // Hàm findLargest được viết trong main
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }

        System.out.println("Số lớn nhất trong " + num1 + ", " + num2 + ", và " + num3 + " là: " + max);
    }
}