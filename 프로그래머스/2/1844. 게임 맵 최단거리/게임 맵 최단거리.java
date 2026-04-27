import java.util.*;

class Solution {
    static class Node {
        int y, x, cnt;
        Node(int y, int x, int cnt) {
            this.y = y;
            this.x = x;
            this.cnt = cnt;
        }
    }

    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;

        boolean[][] visit = new boolean[n][m];
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(0, 0, 1));
        visit[0][0] = true;

        int[] dy = {-1, 0, 1, 0};
        int[] dx = {0, -1, 0, 1};

        while (!q.isEmpty()) {
            Node cur = q.poll();
            int y = cur.y, x = cur.x, cnt = cur.cnt;

            if (y == n - 1 && x == m - 1) {
                return cnt;
            }

            for (int i = 0; i < 4; i++) {
                int ny = y + dy[i];
                int nx = x + dx[i];

                if (0 <= ny && ny < n && 0 <= nx && nx < m
                        && maps[ny][nx] == 1 && !visit[ny][nx]) {
                    visit[ny][nx] = true;
                    q.add(new Node(ny, nx, cnt + 1));
                }
            }
        }

        return -1;
    }
}
