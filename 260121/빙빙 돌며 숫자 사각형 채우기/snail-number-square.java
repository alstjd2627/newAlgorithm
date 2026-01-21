import java.util.Scanner;
public class Main {
    static int[] dc = {1,0,-1,0};
    static int[] dr = {0,1,0,-1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] map = new int[N][M];
        int cc = 0;
        int cr = 0;
        map[cc][cr] =1;
        int count = 1;
        int nc = 0; int nr = 0;
        int dir = 0;
        for(int i = 1 ; i < N*M; i++){
            count++;
            nc = cc + dc[dir];
            nr = cr + dr[dir];
            if(nc < 0 || nr < 0|| nc >= M || nr >= N || map[nr][nc] != 0){
                dir = (dir+1) % 4;
                nc = cc + dc[dir];
                nr = cr + dr[dir];
            }
            cc =nc;
            cr =nr;
            map[cr][cc] = count;
        }
        for(int i = 0 ; i < N; i++){
            for(int j = 0 ; j < M; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}