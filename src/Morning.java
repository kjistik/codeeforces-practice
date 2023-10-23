//solution for exercise A of codeforces round 905

import java.util.Scanner;

public class Morning {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int reps = input.nextInt();
        input.nextLine();
        for (int i = 0; i < reps; i++) {
            solve();
        }
    }

    static void solve() {
        String password = input.nextLine();
        int[] digits = new int[password.length()];
        int seconds = 0;
        int current = 1;
        for (int i = 0; i < digits.length; i++) {
            digits[i] = Integer.parseInt(password.substring(i, (i + 1)));
        }

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == 0) {
                if (current == 0) {
                    seconds++;
                } else {
                    seconds += Math.abs(10 - current) + 1;
                }
            } else {
                seconds += Math.abs(digits[i] - current) + 1;
            }
            if (digits[i] == 0) {
                current = 10;
            } else {
                current = digits[i];
            }
        }
        System.out.println(seconds);
    }
}
