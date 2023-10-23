//solution for exercise B of codeforces round 905
//Correct solution. although it throws an exception if the input String is too large
import java.util.ArrayList;
import java.util.Scanner;

public class Chemistry {
    static Scanner input = new Scanner(System.in);
    static ArrayList<String> aux = new ArrayList<String>();

    public static void main(String[] args) {
        int reps = input.nextInt();
        for (int i = 0; i < reps; i++) {
            solve();
        }
    }

    static int test(String test) {
        int num = 0;

        while (aux.contains(test)) {
            aux.remove(test);
            num++;
        }
        return num;
    }

    static void solve() {
        int length = input.nextInt();
        int num = input.nextInt();
        int odd = 0;
        input.nextLine();
        String str = input.nextLine();
        int z = 0;
        do {
            aux.add(Character.toString(str.charAt(z)));
            z++;
        } while (z < length);
        z = 0;
        do {
            if (test(Character.toString(str.charAt(z))) % 2 != 0) {
                odd++;
            }
            z++;
        } while (z < str.length());
        z = 0;
        if ((odd - num) <= 1) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
