import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Problem1316 {

    public static boolean checkGroup(String str){
        List<String> character = new ArrayList<>();
        character.add(Character.toString(str.charAt(0)));

        if(str.length() == 1){
            return true;
        }

        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) != str.charAt(i - 1)){
                if(character.contains(Character.toString(str.charAt(i)))){
                    return false;
                }
            }
            character.add(Character.toString(str.charAt(i)));
        }
        return true;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i = 0; i < N; i++){
            String word = br.readLine();

            if(checkGroup(word)){
                count++;
            }
        }

        bw.write(count + "\n");
        bw.flush();
    }
}
