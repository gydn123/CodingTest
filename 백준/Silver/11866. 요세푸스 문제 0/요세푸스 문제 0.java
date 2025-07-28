import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 1 ~ N 번 수
        int N = Integer.parseInt(st.nextToken());
        // 삭제될 순서
        int K = Integer.parseInt(st.nextToken());

        // 삭제된 숫자 넣기
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        List<Integer> result  = new ArrayList<>();

        while (!queue.isEmpty()) {
            // K-1명의 사람을 맨 뒤로 보낸다.

            for (int i = 0; i < K - 1; i++) {
                int front = queue.poll();
                queue.offer(front);
            }
            result.add(queue.poll());
        }
        System.out.print("<");
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            if (i != result.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.print(">");
    }

}