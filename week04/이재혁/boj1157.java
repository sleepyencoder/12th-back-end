package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class boj1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String b = br.readLine();
        String a = b.toUpperCase();

        int[] alpa = new int[26];

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') {
                alpa[a.charAt(i) - 'A'] += 1;
            }
        }

        int max = -1;
        char result = '?';

        for (int i = 0; i < alpa.length; i++) {
            if (alpa[i] > max) {
                max = alpa[i];
                result = (char) (i + 65);
            } else if (alpa[i] == max) {
                result = '?';
            }
        }

        System.out.println(result);

    }


}
