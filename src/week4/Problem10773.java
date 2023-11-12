package week4;

import java.io.*;
import java.util.Stack;

public class Problem10773 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int result = 0;
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> money = new Stack<>();

        for (int i = 0; i < N; i++) {
            int number = Integer.parseInt(br.readLine());

            if (number == 0) {
                money.pop();
            } else {
                money.push(number);
            }
        }

        for (int num : money) {
            result += num;
        }

        bw.write(result + "\n");
        bw.flush();
    }
}
