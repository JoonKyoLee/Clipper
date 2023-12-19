package week8.N과M_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem15649 {
    private static int[] numbers;
    private static boolean[] visited;
    private static StringBuilder sb = new StringBuilder();

    private static void dfs(int N, int M, int depth) {
        // M개를 만족했다면 출력
        if (depth == M) {
            for (int number : numbers) {
                sb.append(number).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                numbers[depth] = i + 1; // 출력을 위한 값 저장
                dfs(N, M, depth + 1); // 자식 노드 탐색

                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        numbers = new int[M];
        visited = new boolean[N];

        dfs(N, M, 0);
        bw.write(sb.toString());
        bw.flush();
    }
}