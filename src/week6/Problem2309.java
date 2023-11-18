package week6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem2309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> height = new ArrayList<>();
        int totalSum = 0;

        for(int i = 0; i < 9; i++) {
            int num = Integer.parseInt(br.readLine());
            totalSum += num;
            height.add(num);
        }

        Collections.sort(height);

        int index1 = -1;
        int index2 = -1;

        for (int i = 0; i < height.size() - 1; i++) {
            for (int j = i + 1; j < height.size(); j++) {
                if (totalSum - height.get(i) - height.get(j) == 100) {
                    index1 = i;
                    index2 = j;
                }
            }
        }

        for (int i = 0; i < height.size(); i++) {
            if (i == index1 || i == index2) {
                continue;
            }
            bw.write(height.get(i) + "\n");
        }

        bw.flush();
    }
}
