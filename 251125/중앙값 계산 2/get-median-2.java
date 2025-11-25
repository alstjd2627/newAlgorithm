import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

       PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
       PriorityQueue<Integer> minHeap = new PriorityQueue<>();
       for(int i = 1 ; i <= n; i++){
        int num = sc.nextInt();
        if(maxHeap.isEmpty() || num <= maxHeap.peek()){
            maxHeap.add(num);
        } else{
            minHeap.add(num);
        }

        if(maxHeap.size() > minHeap.size() + 1){
            minHeap.add(maxHeap.poll());
        } else if(minHeap.size() > maxHeap.size()){
            maxHeap.add(minHeap.poll());
        }
        if(i%2 == 1){
            System.out.print(maxHeap.peek() + " ");
        }

       }
       
    }
}
