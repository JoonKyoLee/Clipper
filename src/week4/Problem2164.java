package week4;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Problem2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> cards = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            cards.offer(i);
        }

        while(cards.size() > 1) {
            cards.poll();
            cards.offer(cards.poll());
        }

        bw.write(cards.poll() + "\n");
        bw.flush();
    }
}
