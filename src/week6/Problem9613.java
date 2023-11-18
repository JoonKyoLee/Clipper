package week6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Problem9613 {
    private static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return GCD(b, a % b);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        long sum;
        List<Integer> numbers;

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            sum = 0;
            numbers = new ArrayList<>();

            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());

            for (int j = 0; j < n; j++) {
                numbers.add(Integer.parseInt(st.nextToken()));
            }

            for (int j = 0; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    sum += GCD(numbers.get(j), numbers.get(k));
                }
            }

            bw.write(sum + "\n");
        }

        bw.flush();
    }
}