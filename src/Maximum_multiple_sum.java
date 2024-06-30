//Solution for exercise B of codeforces round 952

import java.util.Scanner;

public class Maximum_multiple_sum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int times = input.nextInt();
        int number;
        for (int i = 0; i < times; i++) {
            number = input.nextInt();
            solve(number);
        }

        input.close();
    }

    static void solve(int number) {
        if (number != 3) {
            System.out.println("2");
        } else {
            System.out.println("3");

        }
    }
}
