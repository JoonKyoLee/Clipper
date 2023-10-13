import java.io.*;

public class Problem10798 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[][] character = new char[5][15];

        int maxLength = 0;

        for(int i = 0; i < 5; i++){
            String word = br.readLine();
            character[i] = word.toCharArray();
            maxLength = Math.max(maxLength, word.length());
        }

        for(int i = 0; i < maxLength; i++){

            for(int j = 0; j < 5; j++){
                if(character[j].length <= i){
                    continue;
                }
                bw.write(character[j][i]);
            }
        }
        bw.flush();
    }
}
