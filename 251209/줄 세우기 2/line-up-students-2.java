import java.util.*;
import java.io.*;

class Student implements Comparable<Student>{
    int height, weight, index;
    
    public Student(int height, int weight,int index){
        this.height = height;
        this.weight = weight;
        this.index = index;
    }
    
    @Override
    public int compareTo(Student student){
        if(this.height == student.height){
            return student.weight - this.weight;
        }
        return this.height - student.height;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h,w;
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            h = sc.nextInt();
            w = sc.nextInt();
            students[i] = new Student(h,w,i+1);
        }
        
        Arrays.sort(students);
        for (int i = 0; i < n; i++) {
            System.out.println(students[i].height + " " + students[i].weight  + " " + students[i].index);
        }
    }
}