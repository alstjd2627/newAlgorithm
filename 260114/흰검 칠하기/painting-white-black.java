import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] white = new int[200001];
        int[] black = new int[200001];
        int[] gray = new int[200001];
        int[] last = new int[200001];
        int current = 100000;
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);
            for(int j = 0 ; j < x; j++){
                if(d == 'R'){
                    if(gray[current] == 1) continue;
                    if(black[current] < 2){
                        black[current]++;
                        last[current] = 2;
                    }
                    if(black[current] >= 2 && white[current] >= 2){
                        gray[current] = 1;
                        last[current] = 3;
                    }
                    current++;
                } else{
                    current--;
                    if(gray[current] == 1) continue;
                    if(white[current] < 2){
                        white[current]++;
                        last[current] = 1;
                    }
                    if(black[current] >= 2 && white[current] >= 2){
                        gray[current] = 1;
                        last[current] = 3;
                    }
                }
            }
        }
        int whiteCount = 0;
        int blackCount = 0;
        int grayCount = 0;
        for(int i = 0; i < last.length; i++){
            if(last[i] == 1) whiteCount++;
            else if(last[i]==2) blackCount++;
            else if(last[i] == 3) grayCount++;
        }
        System.out.println(whiteCount + " " + blackCount + " " + grayCount);

        
    }
}