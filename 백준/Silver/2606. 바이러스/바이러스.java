import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 컴퓨터의 수 (1부터 시작하므로 +1 크기로 배열 생성)
        int comCount  = Integer.parseInt(br.readLine());
        // 연결된 컴퓨터 쌍의 수
        int pairCount  = Integer.parseInt(br.readLine());

        // 인접 리스트로 그래프 표현
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= comCount; i++) {
            adj.add(new ArrayList<>());
        }

        // 연결 정보 입력받아 인접 리스트에 추가

        for (int i = 0; i < pairCount; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            // 양방향 연결
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        int infectedComCount = bfs(1, comCount, adj);

        System.out.println(infectedComCount);
        
    }
    
    public static int bfs(int startNode, int comCount, List<List<Integer>> adj) {

        // 방문 여부를 체크할 배열
        boolean[] visited = new boolean[comCount + 1];
        // 탐색을 위한 큐
        Queue<Integer> queue = new LinkedList<>();

        // 1. 시작 노드를 큐에 추가하고 방문 처리
        queue.add(startNode);
        visited[startNode] = true;

        int infectedTotal = 0;

        // 2. 큐가 빌 때까지 반복
        while (!queue.isEmpty()) {
            int currentNode = queue.poll();

            // 3. 현재 노드와 연결된 다른 노드들을 확인
            for (int neighbor : adj.get(currentNode)) {
                // 4. 아직 방문하지 않은 노드라면
                if (!visited[neighbor]) {
                    visited[neighbor] = true; // 방문 처리
                    queue.add(neighbor);      // 큐에 추가
                    infectedTotal ++;         // 감염 카운트 증가
                }
            }
        }
        return infectedTotal;
    }

}