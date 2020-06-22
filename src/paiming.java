import java.util.Scanner;
class Person{
    public String name;
    public int num;
    public int time;
    public Person(String name,int num,int time){
        this.name=name;
        this.num=num;
        this.time=time;
    }

    public Person(){
    }
}
public class paiming {
    private static void swap(Person[] p, int j, int i) {
        Person temp=new Person();
        temp=p[j];
        p[j]=p[i];
        p[i]=temp;
    }
    private static void sort(Person[] p,int k){
        for(int i=0;i<k-1;i++){
            for(int j=0;j<k-1-i;j++){
                if(p[j].num<p[j+1].num){
                    swap(p,j,j+1);
                }else if(p[j].num==p[j+1].num){
                    if(p[j].time>p[j+1].time){
                        swap(p,j,j+1);
                    }else if(p[j].time==p[j+1].time){
                        if(p[j].name.compareTo(p[j+1].name)>0){
                            swap(p,j,j+1);
                        }
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int m=sc.nextInt();
            Person[] p=new Person[1000];
            int k=0;
            while(sc.hasNext()){//
                String name=sc.next();
                int time=0,num=0;
                for(int i=0;i<n;i++){
                    int timer;
                    int numb=0;
                    String s=sc.next();
                    String[] str=s.split("\\(|\\)");
                    if(str.length==1){
                        timer=Integer.parseInt(s);
                    }else{
                        timer=Integer.parseInt(str[0]);
                        numb=Integer.parseInt(str[1]);
                    }
                    if(timer>0){
                        num++;
                        time+=timer+numb*m;
                    }
                }
                p[k++]=new Person(name,num,time);
                //System.out.println("num="+num+" time="+time);
            }
            sort(p,k);
            for(int i=0;i<k;i++){
                System.out.printf("%-10s %2d %4d",p[i].name,p[i].num,p[i].time);
                System.out.println();
            }
        }
    }
}