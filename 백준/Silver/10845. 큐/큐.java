import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 명령어의 수
        int N = Integer.parseInt(br.readLine());
        List<Integer> queue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            // 한 줄 전체를 읽음
            String[] input = br.readLine().split(" ");

            queue = madeQueue(input, queue);
        }
    }
    
    static List<Integer> madeQueue(String[] input, List<Integer> queue) {

        String command = input[0];

        switch (command) {
            case "push":
                int k = Integer.parseInt(input[1]);
                queue.add(k);
                break;
            case "pop":
                if (queue.isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(queue.get(0));
                    queue.remove(0);
                }
                break;
            case "size":
                System.out.println(queue.size());
                break;
            case "empty":
                if (queue.isEmpty()) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
                break;
            case "front":
                if (queue.isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(queue.get(0));
                }
                break;
            case "back":
                if (queue.isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(queue.get(queue.size() - 1));
                }
                break;
        }
        return queue;
    }

}