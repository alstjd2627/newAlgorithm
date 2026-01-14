import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int SIZE = 400000;        
        int OFFSET = 200000;        

        int[] white = new int[SIZE];
        int[] black = new int[SIZE];
        boolean[] gray = new boolean[SIZE];
        int[] last = new int[SIZE];

        int cur = OFFSET;

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);

            for (int j = 0; j < x; j++) {
                if (!gray[cur]) {
                    if (d == 'R') {
                        if (black[cur] < 2) black[cur]++;
                        if (white[cur] < 2 || black[cur] < 2) last[cur] = 2; 
                    } else {
                        if (white[cur] < 2) white[cur]++;
                        if (white[cur] < 2 || black[cur] < 2) last[cur] = 1;
                    }

                    if (white[cur] >= 2 && black[cur] >= 2) {
                        gray[cur] = true;
                        last[cur] = 3;
                    }
                }

                if (j < x - 1) { 
                    if (d == 'R') cur++;
                    else cur--;
                }
            }
        }

        int w = 0, b = 0, g = 0;
        for (int i = 0; i < SIZE; i++) {
            if (last[i] == 1) w++;
            else if (last[i] == 2) b++;
            else if (last[i] == 3) g++;
        }
        System.out.println(w + " " + b + " " + g);
    }
}
