package beackjoon;

import java.util.Scanner;

public class kimdayeon_10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(S.indexOf(c) + " ");
        }
    }
}