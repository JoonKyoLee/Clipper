package week9.다음순열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem10972 {
    private static int N;
    private static int[] numbers;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        if (nextPermutation()) {
            for (int i = 0; i < N; i++) {
                bw.write(numbers[i] + " ");
            }
            bw.write("\n");
        }
        else {
            bw.write("-1\n");
        }

        bw.flush();
    }

    private static boolean nextPermutation() {
        int index = N - 1;

        while (index > 0 && numbers[index - 1] > numbers[index]) {
            // 배열의 가장 뒤 부터 확인해서 증가하는 수열 확인(끝에서부터 증가하는 수열 확인)
            // ex) 1 3 2 4의 경우에는 4이며, 1 3 4 2의 경우에는 2 4가 증가하는 수열이 된다
            index--;
        }

        // ex) 5 4 3 2 1의 형태(가장 마지막의 형태)
        if (index <= 0) {
            return false;
        }

        // numbers[index - 1]보다 작은 수 찾기
        int j = N - 1;
        while (numbers[j] < numbers[index - 1]) {
            j--;
        }
        swap(index - 1, j);

        j = N - 1;
        while (index < j) {
            swap(index, j);
            index++;
            j--;
        }
        return true;
    }

    private static void swap(int index1, int index2) {
        int temp = numbers[index1];
        numbers[index1] = numbers[index2];
        numbers[index2] = temp;
    }
}