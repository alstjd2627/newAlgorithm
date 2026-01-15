import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x1,y1,x2,y2;
        int[][] map = new int[201][201];
        int answer= 0;
        for (int i = 0; i < n; i++) {
            x1 = sc.nextInt()+100;
            y1 = sc.nextInt()+100;
            x2 = sc.nextInt()+100;
            y2 = sc.nextInt()+100;

            for(int j = x1; j < x2; j++){
                for(int k = y1; k < y2; k++){
                    if(map[j][k] == 0){
                        map[j][k] = 1;
                        answer++;
                    }
                }
            }
        }
            System.out.println(answer);
    }
}