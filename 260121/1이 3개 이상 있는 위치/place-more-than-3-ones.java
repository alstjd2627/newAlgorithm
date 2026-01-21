import java.util.Scanner;
public class Main {
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nx,ny,cx,cy;
        int count;
        int answer = 0;
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        for(int i = 0 ; i < n; i++){
            for(int j = 0 ; j < n; j++){
                cx = i;
                cy = j;
                count = 0;
                for(int k = 0; k < 4; k++){
                    nx = cx + dx[k];
                    ny = cy + dy[k];
                    if(nx >= 0 && nx < n && ny>= 0 && ny < n){
                        if(arr[nx][ny] == 1) count++;
                    }    
                }
                if(count >=3) answer++;
            }
        }

        System.out.println(answer);
    }
}