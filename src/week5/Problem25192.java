package week5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Problem25192 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Set<String> gomgom = new HashSet<>();
        int gomgomCount = 0;

        for (int i = 0; i < N; i++) {
            String input = br.readLine();

            if (input.equals("ENTER")) {
                gomgom = new HashSet<>();
                continue;
            }

            if (!gomgom.contains(input)) {
                gomgom.add(input);
                gomgomCount++;
            }
        }

        bw.write(gomgomCount + "\n");
        bw.flush();
    }
}
