import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            sb.append(check(br.readLine())).append("\n");
        }
        br.close();
        System.out.print(sb);
    }

    public static int check(String quiz) {
        int count = 1;
        int score = 0;

        for (int i = 0; i < quiz.length(); i++){
            if (quiz.charAt(i) == 'O') {
                score += count;
                count++;
            }
            else count = 1;
        }
        return score;
    }
}
