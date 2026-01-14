import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] white = new int[200002];
        int[] black = new int[200002];
        int[] gray = new int[200002];
        int[] last = new int[200002];
        int current = 100000;
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);
            for(int j = 0 ; j < x; j++){
                if(d == 'R'){
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
                    if(white[current] < 2){
                        white[current]++;
                        last[current] = 1;
                    }
                    if(black[current] >= 2 && white[current] >= 2){
                        gray[current] = 1;
                        last[current] = 3;
                    }
                    current--;
                }
            }
            if(d =='R') current--;
            else current++;
            
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