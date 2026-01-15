import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ax1 = sc.nextInt()+ 1000;
        int ay1 = sc.nextInt()+ 1000;
        int ax2 = sc.nextInt()+ 1000;
        int ay2 = sc.nextInt()+ 1000;
        int bx1 = sc.nextInt()+ 1000;
        int by1 = sc.nextInt()+ 1000;
        int bx2 = sc.nextInt()+ 1000;
        int by2 = sc.nextInt()+ 1000;
        int cx1 = sc.nextInt()+ 1000;
        int cy1 = sc.nextInt()+ 1000;
        int cx2 = sc.nextInt()+ 1000;
        int cy2 = sc.nextInt()+ 1000;
        int[][] map = new int[2001][2001];
        int answer= 0;
        for(int i = ax1; i < ax2; i++){
            for(int j = ay1; j < ay2; j++){
                map[i][j] = 1;
                answer++;
            }
        }
        for(int i = bx1; i < bx2; i++){
            for(int j = by1; j < by2; j++){
                if(map[i][j] != 1){
                     map[i][j] = 1;
                     answer++;
                }
            }
        }

         for(int i = cx1; i < cx2; i++){
            for(int j = cy1; j < cy2; j++){
                if(map[i][j] == 1){
                     map[i][j] = 0;
                     answer--;
                }
            }
        }
        System.out.println(answer);
    }
}