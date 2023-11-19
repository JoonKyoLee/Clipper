package week1;

import java.io.*;

public class Problem10988 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder str = new StringBuilder(br.readLine());

        if(str.equals(str.reverse().toString())){
            bw.write(1 + "\n");
        }
        else {
            bw.write(0 + "\n");
        }

        bw.flush();
    }
}
