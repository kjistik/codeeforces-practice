//Solution for exercise A of codeforces round 952

import java.util.Scanner;

public class Creating_words {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int times = input.nextInt();
        String aux;
        String aux1;
        input.nextLine();
        String[][] words = new String[times][2];
        for (int i = 0; i < times; i++) {
            for (int j = 0; j < 2; j++) {
                words[i][j] = input.next();
            }
            aux = words[i][1].substring(0, 1);
            aux1 = words[i][0].substring(0, 1);
            words[i][0] = aux.concat(words[i][0].substring(1));
            words[i][1] = aux1.concat(words[i][1].substring(1));
        }
        for (int i = 0; i < times; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(words[i][j]);
                if (j == 0) {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        input.close();
    }

}
