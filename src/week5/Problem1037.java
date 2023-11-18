package week5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem1037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int numberOfCommonDivisor = Integer.parseInt(br.readLine());

        int[] commonDivisor = new int[numberOfCommonDivisor];
        int middle = numberOfCommonDivisor / 2;
        int realNumber;

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < numberOfCommonDivisor; i++) {
            commonDivisor[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(commonDivisor);

        if (numberOfCommonDivisor % 2 == 0) {
            realNumber = commonDivisor[middle - 1] * commonDivisor[middle];
        } else {
            realNumber = commonDivisor[middle] * commonDivisor[middle];
        }

        bw.write(realNumber + "\n");
        bw.flush();
    }
}