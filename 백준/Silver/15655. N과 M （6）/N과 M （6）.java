import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    
    public static int N,M;
    public static int[] arr;
    public static int[] result;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // N개의 자연수
        N = Integer.parseInt(st.nextToken());
        // 자연수 M
        M = Integer.parseInt(st.nextToken());

        // N개의 숫자를 저장할 배열 초기화
        arr = new int[N];
        // 두 번째 줄의 숫자들을 읽어옴
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 2. 오름차순 정렬
        Arrays.sort(arr);

        // 결과를 저장할 배열 초기화
        result = new int[M];

        dfs(0, 0);

        System.out.println(sb);
    }
    
        public static void dfs(int depth, int start) {
        // Base Case: 수열의 길이가 M에 도달하면
        if (depth == M) {
            // 완성된 수열을 StringBuilder에 추가
            for (int val : result) {
                sb.append(val).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = start; i < N; i++) {
            result[depth] = arr[i];   // 현재 숫자를 결과 배열에 추가
            dfs(depth + 1, i + 1); // 다음 숫자를 찾기 위해 재귀 호출
            // (depth는 1 증가, start는 i+1로 설정하여 다음 숫자는 현재 숫자보다 뒤에 있는 것만 보도록 함)
        }

    }

}