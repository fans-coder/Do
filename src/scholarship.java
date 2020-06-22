import java.util.*;
public  class scholarship{

    public static void main(String[] args) {
        Scanner cin =new Scanner(System.in);
        String[] name=new String[200];
        char c1,c2;
        int n,sum=0,max=0,score1,score2,num,a,b,k=0;
        //scanf("%d",&n);
        n=cin.nextInt();
        for (int i=1;i<=n;i++)
        {
            name[i]=cin.next();
            score1=cin.nextInt();
            score2=cin.nextInt();
            c1=cin.next().charAt(0);
            c2=cin.next().charAt(0);
            num=cin.nextInt();
            a=c1=='Y'?1:0;                        //是否是学生干部
            b=c2=='Y'?1:0;                        //是否是西部省份学生
            int tmp=0;
            if ((score1>80)&&(num>0)) tmp+=8000;   //院士奖学金
            if ((score1>85)&&(score2>80)) tmp+=4000; //五四奖学金
            if (score1>90) tmp+=2000;                  //成绩优秀奖
            if (b==1&&(score1>85)) tmp+=1000;         //西部奖学金
            if (a==1&&(score2>80)) tmp+=850;           //班级贡献奖
            sum+=tmp;                                          //奖学金的总数
            if (tmp>max) {max=tmp;k=i;}               //获奖金最高的学生
        }
        System.out.printf("%s\n%d\n%d\n",name[k],max,sum);
    }
}


