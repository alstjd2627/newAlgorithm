import java.util.*;
import java.io.*;

class Node implements Comparable<Node>{
    int num,index;
    public Node(int num, int index){
        this.num = num;
        this.index = index;
    }
    @Override
    public int compareTo(Node node){
        return this.num - node.num;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node[] nodes = new Node[n];
        for(int i = 0; i < n; i++){
            nodes[i] = new Node(sc.nextInt(),i);
        }

        Arrays.sort(nodes);
        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++){
            arr[nodes[i].index] = i+1;
        }
        for(int i = 0 ; i < n; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}