import java.util.Scanner;

public class Main {
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int x = 0;
        int y = 0;
        int currentDir = 0;
        for(int i = 0; i < s.length(); i++){
            char dir = s.charAt(i);
            if(dir == 'F'){
                x += dx[currentDir];
                y += dy[currentDir];
            } else if(dir == 'R'){
                currentDir = (currentDir + 1) % 4;
            } else{
                currentDir = (currentDir +3) % 4;
            }
        }
        System.out.print(x + " " + y);
    }
}