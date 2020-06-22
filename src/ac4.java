import java.util.*;
public class ac4
{
    static class ans
    {
        int []p=new int[10];
    }
    public static void main (String[] args)
    {
        Scanner cin=new Scanner(System.in);
        int N=cin.nextInt(),M=cin.nextInt();
        ans x1=new ans();
        ans x2=new ans();
        ans x3=new ans();
        int a,b;
        for(int i=0;i<N;i++)
        {
            a=cin.nextInt();
            b=cin.nextInt();
            x1.p[b]=a;
        }
        for(int i=0;i<M;i++)
        {
            a=cin.nextInt();
            b=cin.nextInt();
            x2.p[b]=a;
        }
        if(x1.p.length>x2.p.length)
        {
            for(int i=x1.p.length-1;i>=0;i--)
            {
                x3.p[i]=x1.p[i]+x2.p[i];
                if(x3.p[i]!=0)System.out.println(x3.p[i]+" "+i);
            }
        }else {
            for(int i=x2.p.length-1;i>=0;i--) {
                x3.p[i] = x1.p[i] + x2.p[i];
                if (x3.p[i] != 0) System.out.println(x3.p[i] + " " + i);
            }
        }

    }
}