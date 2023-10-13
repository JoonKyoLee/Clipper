import java.io.*;
import java.util.StringTokenizer;

public class Problem2563 {
    private static final int FIRST_INDEX = 0;
    private static final int ARRAY_SIZE = 100;
    private static final int PAPER_LENGTH = 10;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        boolean[][] paper = new boolean[ARRAY_SIZE][ARRAY_SIZE];
        int area = 0;

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());

            int firstPoint = Integer.parseInt(st.nextToken());
            int secondPoint = Integer.parseInt(st.nextToken());

            for(int j = firstPoint; j < firstPoint + PAPER_LENGTH; j++){
                for(int k = secondPoint; k < secondPoint + PAPER_LENGTH; k++){
                    paper[j][k] = true;
                }
            }
        }

        for(int i = FIRST_INDEX; i < ARRAY_SIZE; i++){
            for(int j = FIRST_INDEX; j < ARRAY_SIZE; j++){
                if(paper[i][j]){
                    area++;
                }
            }
        }

        bw.write(area + "\n");
        bw.flush();
    }
}
