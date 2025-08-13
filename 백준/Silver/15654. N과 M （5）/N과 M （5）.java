import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    
    public static int N,M;
    public static int[] nums;
    public static int[] result;
    public static boolean[] visited;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // N개의 자연수
        N = Integer.parseInt(st.nextToken());
        // 자연수 M
        M = Integer.parseInt(st.nextToken());

        // N개의 숫자를 저장할 배열 초기화
        nums = new int[N];
        visited = new boolean[N];
        result = new int[M];

        // 두 번째 줄의 숫자들을 읽어옴
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        // 2. 오름차순 정렬
        Arrays.sort(nums);

        // 결과를 저장할 배열 초기화
        result = new int[M];

        dfs(0);

        // 4. 최종 결과 출력
        System.out.println(sb);
    }
    
    public static void dfs(int depth) {
        // Base Case: 수열의 길이가 M에 도달하면
        if (depth == M) {
                // 완성된 수열을 StringBuilder에 추가
                for (int val : result) {
                    sb.append(val).append(' ');
                }
            sb.append('\n');
            return;
        }

        // Recursive Step: 숫자 선택 과정
        // start 인덱스부터 N까지 반복
        for (int i = 0; i < N; i++) {
            // 만약 해당 숫자를 아직 방문하지 않았다면
            if (!visited[i]) {
                visited[i] = true;
                result[depth] = nums[i];
                dfs(depth + 1);
                visited[i] = false;
            }
        }
    }

}