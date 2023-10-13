import java.io.*;
import java.util.StringTokenizer;

public class Problem1546{

    public static void main(String[] args) throws IOException{
        int max = Integer.MIN_VALUE;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] score = new int[N];
        double sum = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());;

        for(int i = 0; i < N; i++){
            score[i] = Integer.parseInt(st.nextToken());
            if(max < score[i]){
                max = score[i];
            }
        }

        for(int i = 0; i < N; i++){
            sum += ((double) score[i] / max * 100);
        }

        bw.write((sum / N) + "\n");
        bw.flush();
    }
}