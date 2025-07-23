import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 사람 수
        int k = Integer.parseInt(br.readLine());
        List<Map<String, Integer>> list = new ArrayList<>();

        // 몸무게, 키 받기
        for (int i = 0; i < k; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

                Map<String, Integer> map = new HashMap<>();
                map.put("x", x);
                map.put("y", y);
                list.add(map);
        }
        for (int i = 0; i < list.size(); i++) {
            int rank = 1;
            for (int j = 0; j < list.size(); j++) {

                if (i == j) {
                    continue;
                }
                Map<String, Integer> standardPerson = list.get(i);
                int standardX = standardPerson.get("x");
                int standardY = standardPerson.get("y");

                Map<String, Integer> comparisonPerson = list.get(j);
                int comparisonX = comparisonPerson.get("x");
                int comparisonY = comparisonPerson.get("y");

                if (standardX < comparisonX && standardY < comparisonY) {
                    rank++;
                }

            }

            System.out.print(rank + " ");
        }
    }

}