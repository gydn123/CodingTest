import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();

        // 명령어의 수
        int M = Integer.parseInt(br.readLine());

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < M; i++) {
            
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            int x = 0;

            // 숫자 인수가 필요한 명령어인 경우 미리 파싱
            if (st.hasMoreTokens()) {
                x = Integer.parseInt(st.nextToken());
            }

            switch (command) {
                case "add":
                    if (set.contains(x)) {
                        break;
                    }
                    set.add(x);
                    break;
                case "remove":
                    if (set.isEmpty()) {
                        break;
                    } else {
                        set.remove(x);
                    }
                    break;
                case "check":
                    if (set.contains(x)) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;
                case "toggle":
                    if (set.contains(x)) {
                        set.remove(x);
                        break;
                    } else {
                        set.add(x);
                    }
                    break;
                case "all":
                    set.clear();
                    for (int j = 1; j <= 20; j++) {
                        set.add(j);
                    }
                    break;
                case "empty":
                    set.clear();
                    break;
            }
        }
        System.out.println(sb);
    }

}