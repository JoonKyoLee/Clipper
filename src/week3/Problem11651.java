package week3;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem11651 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[][] num = new int[N][2];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            num[i][0] = Integer.parseInt(st.nextToken());
            num[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(num, (e1, e2) -> {
            if(e1[1] == e2[1]){
                return e1[0] - e2[0];
            } else{
                return e1[1] - e2[1];
            }
        });

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++){
            sb.append(num[i][0] + " " + num[i][1]).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
    }
}
