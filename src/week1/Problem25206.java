package week1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Problem25206 {

    public static double getGrade(String grade){
        if(grade.equals("A+")){
            return 4.5;
        }
        else if(grade.equals("A0")){
            return 4.0;
        }
        else if(grade.equals("B+")){
            return 3.5;
        }
        else if(grade.equals("B0")){
            return 3.0;
        }
        else if(grade.equals("C+")){
            return 2.5;
        }
        else if(grade.equals("C0")){
            return 2.0;
        }
        else if(grade.equals("D+")){
            return 1.5;
        }
        else if(grade.equals("D0")){
            return 1.0;
        }
        else{
            return 0.0;
        }

    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        List<Double> credit = new ArrayList<>();
        List<String> grade = new ArrayList<>();

        double totalCredit = 0;
        double totalGrade = 0;
        double gradeAvg;

        for(int i = 0; i < 20; i++){
            st = new StringTokenizer(br.readLine());
            st.nextToken();

            credit.add(Double.parseDouble(st.nextToken()));
            grade.add(st.nextToken());

            if(grade.get(i).equals("P")){
                continue;
            }
            totalCredit += credit.get(i);
            double gradeToDouble = getGrade(grade.get(i));

            totalGrade += credit.get(i) * gradeToDouble;
        }

        gradeAvg = totalGrade / totalCredit;

        bw.write(gradeAvg + "\n");
        bw.flush();
    }
}
