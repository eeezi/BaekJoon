import java.io.*;
import java.util.*;

public class Main {
    public static HashMap<Integer, String> pokemonName;
    public static HashMap<String, Integer> pokemonIndex;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        pokemonName = new HashMap<>(n);
        pokemonIndex = new HashMap<>(n);
        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            pokemonName.put(i + 1, name);
            pokemonIndex.put(name, i + 1);
        }

        for (int i = 0; i < m; i++) solution(br.readLine());
        br.close();
        System.out.print(sb);
    }

    public static void solution(String str) {
        try {
            sb.append(pokemonName.get(Integer.parseInt(str))).append("\n");
        } catch (NumberFormatException e){
            sb.append(pokemonIndex.get(str)).append('\n');
        }
    }
}
