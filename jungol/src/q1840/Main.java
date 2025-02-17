package q1840;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    // BFS로 외부 공기를 설정
    public static void setOuterAir(int[][] cheese, int row, int col) {
        boolean[][] visited = new boolean[row][col];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0}); // (0, 0)은 항상 외부 공기
        visited[0][0] = true;
        cheese[0][0] = -1; // 외부 공기로 표시

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0], y = current[1];

            for (int[] dir : directions) {
                int nx = x + dir[0];
                int ny = y + dir[1];
                if (nx >= 0 && nx < row && ny >= 0 && ny < col && !visited[nx][ny]) {
                    if (cheese[nx][ny] <= 0) { // 공기 영역만 탐색
                        visited[nx][ny] = true;
                        cheese[nx][ny] = -1; // 외부 공기로 변경
                        queue.add(new int[]{nx, ny});
                    }
                }
            }
        }
    }

    public static int meltCheese(int[][] cheese, int row, int col) {
        boolean[][] toMelt = new boolean[row][col];
        int cheeseCount = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (cheese[i][j] == 1) {
                    cheeseCount++;
                    int airCount = 0;
                    for (int[] dir : directions) {
                        int nx = i + dir[0];
                        int ny = j + dir[1];
                        if (nx >= 0 && nx < row && ny >= 0 && ny < col && cheese[nx][ny] == -1) { // 외부 공기와 접촉한 경우
                            airCount++;
                        }
                    }
                    if (airCount >= 1) { // 공기와 한 면만 접촉해도 녹음
                        toMelt[i][j] = true;
                    }
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (toMelt[i][j]) {
                    cheese[i][j] = -1; // 녹은 치즈는 외부 공기로 변경
                }
            }
        }

        return cheeseCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt(), col = sc.nextInt();
        int[][] cheese = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                cheese[i][j] = sc.nextInt();
            }
        }
        sc.close();

        int cycle = 0;
        int lastCheeseCount = 0;

        while (true) {
            setOuterAir(cheese, row, col); // 외부 공기 설정
            int remainCheese = meltCheese(cheese, row, col); // 치즈 녹이기

            if (remainCheese == 0) break; // 치즈가 모두 녹았으면 종료
            lastCheeseCount = remainCheese;
            cycle++;
        }

        System.out.println(cycle);
        System.out.println(lastCheeseCount);
    }
}
