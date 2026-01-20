import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int[] arrA = new int[2000001];
        int[] arrB = new int[2000001];
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int current = 1000000;
        int time = 1;
        int totalTime = 0;
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            char dir = st.nextToken().charAt(0);
            int dis = Integer.parseInt(st.nextToken());
            totalTime += dis;
            if(dir == 'R'){
                for(int j = 0; j < dis; j++){
                    current++;
                    arrA[time] = current;  
                    time++;
                }
            } else{
                for(int j = 0; j < dis; j++){
                    current--;
                    arrA[time] = current;  
                    time++;
                }
            }
        }
        time = 1;
        current = 1000000;
        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            char dir = st.nextToken().charAt(0);
            int dis = Integer.parseInt(st.nextToken());
            if(dir == 'R'){
                for(int j = 0; j < dis; j++){
                    current++;
                    arrB[time] = current;  
                    time++;
                }
            } else{
                for(int j = 0; j < dis; j++){
                    current--;
                    arrB[time] = current;  
                    time++;
                }
            }
        }
        
        int answer = -1;

        for(int i = 1 ; i <= totalTime; i++){
            //System.out.print(arrA[i] + " ");
            //System.out.print(arrB[i] + " ");
            //System.out.println();
            if(arrA[i] == arrB[i]){
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }
}