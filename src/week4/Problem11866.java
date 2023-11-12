package week4;

import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Problem11866 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        sb.append('<');

        LinkedList<Integer> people = new LinkedList<>();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for(int i = 1; i <= N; i++){
            people.add(i);
        }

        int index = 0;

        while(N > 1) {
            index = (index + (K - 1)) % N;

            sb.append(people.remove(index)).append(", ");
            N--;
        }

        sb.append(people.remove()).append('>');
        bw.write(sb.toString());
        bw.flush();
    }
}
