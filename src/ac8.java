import java.util.*;
public class ac8 {
    static class Student implements Comparable<Student>
    {
        int y,m,d;
        String name;
        public int compareTo(Student student) {
            if(this.y!=student.y)
                return this.y-student.y;
            if(this.m!=student.m)
                return this.m-student.m;
            return this.d-student.d;
        }
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        Student[] students=new Student[N];
        for(int i=0;i<N;i++)
        {
            students[i]=new Student();
            students[i].name=cin.next();
            students[i].y=cin.nextInt();
            students[i].m=cin.nextInt();
            students[i].d=cin.nextInt();
        }
        Arrays.sort(students);
        for(int i=0;i<N;i++)
            System.out.println(students[i].name);
    }
}