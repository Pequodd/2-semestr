package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int num = in.nextInt();
        int num2 = num - 1;
        int num3 = num + 1;
        int num4 = num + num2 + num3;
        int num5 = (int) Math.pow(num4,2);
        System.out.printf("%d %d %d %d\n", num2, num, num3, num5);
        in.close();
    }
}
