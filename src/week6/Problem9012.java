package week6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem9012 {
    private static final char LEFT = '(';
    private static final char RIGHT = ')';

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int parenthesisDetermine;

        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {
            parenthesisDetermine = 0;
            String input = br.readLine();
            if (input.charAt(0) == RIGHT || input.charAt(input.length() - 1) == LEFT) {
                bw.write("NO\n");
                continue;
            }

            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == LEFT) {
                    parenthesisDetermine++;
                }
                if (input.charAt(j) == RIGHT) {
                    parenthesisDetermine--;
                }
                if (parenthesisDetermine < 0) {
                    break;
                }
            }

            if (parenthesisDetermine == 0) {
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }
        }

        bw.flush();
    }
}
