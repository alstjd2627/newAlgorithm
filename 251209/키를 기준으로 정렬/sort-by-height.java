import java.util.*;
import java.io.*;

class Student implements Comparable<Student>{
    String name;
    int height;
    int age;

    public Student(String name, int height, int age){
        this.name = name;
        this.height = height;
        this.age = age;
    }

    @Override
    public int compareTo(Student student){
        return this.height - student.height;
    }
}
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Student[] students = new Student[n];
        for(int i = 0 ; i < n; i++){
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int height = Integer.parseInt(st.nextToken());
            int age = Integer.parseInt(st.nextToken());
            students[i] = new Student(name, height, age);
        }
        Arrays.sort(students);

        for(int i = 0 ; i < n; i++){
            System.out.println(students[i].name + " " + students[i].height + " " + students[i].age);
        }
    }
}