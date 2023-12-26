package week9.집합;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem11723 {
    private static final String ADD = "add";
    private static final String REMOVE = "remove";
    private static final String CHECK = "check";
    private static final String TOGGLE = "toggle";
    private static final String ALL = "all";
    private static final String EMPTY = "empty";

    private static final String ALL_NUMBER = "11111111111111111111";
    private static final int EMPTY_NUMBER = 0;

    private static int number = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int M = Integer.parseInt(br.readLine());

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            String prefix = st.nextToken();

            switch (prefix) {
                case ALL:
                    number = Integer.parseInt(ALL_NUMBER, 2);
                    break;
                case EMPTY:
                    number = EMPTY_NUMBER;
                    break;
                case ADD:
                    add(Integer.parseInt(st.nextToken()));
                    break;
                case REMOVE:
                    remove(Integer.parseInt(st.nextToken()));
                    break;
                case CHECK:
                    bw.write(check(Integer.parseInt(st.nextToken())) + "\n");
                    break;
                case TOGGLE:
                    toggle(Integer.parseInt(st.nextToken()));
                    break;
            }
        }

        bw.flush();
    }

    private static void add(int move) {
        // OR 연산을 이용하며 (1 | (0 또는 1))의 형태를 보인다. 따라서 항상 1이 된다.
        number = number | (1 << (move - 1));
    }

    private static void remove(int move) {
        // AND 연산을 이용하며 !1이 들어가기 때문에 항상 0이 된다.
        number = number & ~(1 << (move - 1));
    }

    private static char check(int position) {
        String binaryNumber = Integer.toBinaryString(number);

        if (binaryNumber.length() < position) {
            return '0';
        }
        return binaryNumber.charAt(binaryNumber.length() - position);
    }

    private static void toggle(int move) {
        // XOR 연산을 이용해 존재하지 않을 경우에는 1 ^ 0 = 1, 존재할 경우에는 1 ^ 1 = 0이 된다.
        number = number ^ (1 << (move - 1));
    }
}