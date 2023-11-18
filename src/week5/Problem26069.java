package week5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Problem26069 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        List<String> dancingPeople = new ArrayList<>();
        dancingPeople.add("ChongChong");
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String firstPerson = st.nextToken();
            String secondPerson = st.nextToken();

            if (dancingPeople.contains(firstPerson) && !dancingPeople.contains(secondPerson)) {
                dancingPeople.add(secondPerson);
            }
            if (!dancingPeople.contains(firstPerson) && dancingPeople.contains(secondPerson)) {
                dancingPeople.add(firstPerson);
            }
        }

        bw.write(dancingPeople.size() + "\n");
        bw.flush();
    }
}
