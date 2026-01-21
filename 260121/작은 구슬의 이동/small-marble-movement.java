import java.util.Scanner;

public class Main {
    static int[] dc = {1,0,0,-1};
    static int[] dr = {0,1,-1,0};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int R = sc.nextInt();
        int C = sc.nextInt();
        String D = sc.next();
        int nr = 0;
        int nc = 0;
        int dir;
        if(D.charAt(0) == 'U') dir = 1;
        else if(D.charAt(0) =='D') dir = 2;
        else if(D.charAt(0) == 'R') dir =0;
        else dir = 3;
        int cr = R;
        int cc = C;
        for(int i = 0 ; i < T; i++){
            nr = cr + dr[dir];
            nc = cc + dc[dir];
            if(nr < 1 || nc < 1 || nr > N || nc > N){
                dir = 3-dir;
            } else{
                cr = nr;
                cc = nc;
            }
        }
        System.out.println(nr + " " +nc);
    }
}