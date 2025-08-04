import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[][] maze;
    static int[][] distance;

    // 상, 하, 좌, 우 이동을 위한 배열
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // N x M
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        maze = new int[N][M];
        distance = new int[N][M];

        // 미로 정보 받기
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                // char를 int로 변환
                maze[i][j] = line.charAt(j) - '0';
            }
        }

        bfs(0,0);

        System.out.println(distance[N-1][M-1]);
    }

    public static void bfs(int startX, int startY) {
        Queue<int[]> queue = new LinkedList<>();

        // 1. 시작점 큐에 추가
        queue.add(new int[]{startX, startY});
        // 2. 시작점 방문 처리 및 거리 기록
        distance[startX][startY] = 1;

        while (!queue.isEmpty()) {
            // 3. 큐에서 현재 위치 꺼내기
            int[] current = queue.poll();
            int currentX = current[0];
            int currentY = current[1];

            // 4. 상하좌우 인접 칸 탐색
            for (int i = 0; i < 4; i++) {
                int nextX = currentX + dx[i];
                int nextY = currentY + dy[i];

                // 5. 다음 위치가 유효한지 체크
                if (isValid(nextX, nextY)) {
                    // 6. 방문 가능한 곳이면 큐에 추가하고 거리 기록
                    queue.add(new int[]{nextX, nextY});
                    distance[nextX][nextY] = distance[currentX][currentY] + 1;
                }
            }
        }
    }

    private static boolean isValid(int x, int y) {
        // 미로 범위를 벗어나는 경우
        if (x < 0 || x >= N || y < 0 || y >= M) {
            return false;
        }

        // 이미 방문했거나, 이동할 수 없는 칸인경우
        if (distance[x][y] != 0 || maze[x][y] == 0) {
            return false;
        }
        return true;
    }

}