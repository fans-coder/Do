import java.util.*;
public class ac6 {
    static class Money implements Comparable<Money>
    {
        String name,student,west;

        int average,grade,total,graduation;
        @Override
        public int compareTo(Money that) {
            if(this.total==that.total){
                return 0;
            }
            return that.total>this.total?1:-1;
        }
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N=cin.nextInt();
        Money []monies=new Money[1005];
        int k=0;
        while(N-->0)
        {
            monies[k]=new Money();
            monies[k].name=cin.next();
            monies[k].average=cin.nextInt();
            monies[k].grade=cin.nextInt();
            monies[k].student = cin.next();

            monies[k].west=cin.next();
            monies[k].graduation=cin.nextInt();
            k++;
        }
        int sum=0;
        for(int i=0;i<k;i++)
        {
            monies[i].total=0;
            if(monies[i].average>80&&monies[i].graduation>0)monies[i].total+=8000;
            if(monies[i].average>85&&monies[i].grade>80)monies[i].total+=4000;
            if(monies[i].average>90)monies[i].total+=2000;
            if(monies[i].average>85&&monies[i].west.equals("Y"))monies[i].total+=1000;
            if(monies[i].grade>80&&monies[i].student.equals("Y"))monies[i].total+=850;
            sum+=monies[i].total;
        }
        Arrays.sort(monies,0,k);
        System.out.print(monies[0].name+"\n"+monies[0].total+"\n"+sum);
        cin.close();
    }
}