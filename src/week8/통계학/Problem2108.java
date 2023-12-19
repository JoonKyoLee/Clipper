package week8.통계학;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem2108 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum = 0;
        int mean, median, range;
        int mode = 4001;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        List<Integer> numbers = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());
        int[] count = new int[8001];
        int modeMaxCount = 0;

        for (int i = 0; i < N; i++) {
            int current = Integer.parseInt(br.readLine());
            sum += current;

            if (current > max) {
                max = current;
            }
            if (current < min) {
                min = current;
            }
            numbers.add(current);
            count[current + 4000]++;

            if (modeMaxCount < count[current + 4000]) {
                modeMaxCount = count[current + 4000];
            }
        }

        Collections.sort(numbers);

        mean = Math.round((float) sum / N);
        median = numbers.get(N / 2);
        range = max - min;

        int checkSecond = 0;
        for (int i = min + 4000; i <= max + 4000; i++) {
            if (count[i] == modeMaxCount) {
                checkSecond++;
                mode = i - 4000;

                if (checkSecond == 2) {
                    break;
                }
            }
        }

        bw.write(mean + "\n");
        bw.write(median + "\n");
        bw.write(mode + "\n");
        bw.write(range + "\n");
        bw.flush();
    }
}