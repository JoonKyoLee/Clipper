package week7.접미사배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem11656 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<String> suffix = new ArrayList<>();
        String word = br.readLine();

        for (int i = 0; i < word.length(); i++) {
            suffix.add(word.substring(i));
        }

        Collections.sort(suffix);

        for (String s : suffix) {
            bw.write(s + "\n");
        }

        bw.flush();
    }
}