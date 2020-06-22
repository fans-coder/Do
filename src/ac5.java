import java.util.*;
public class ac5 {
    static void Sum(Map<String ,Integer>map,String[] s,int length)
    {
        int sum=0;
        sum=map.get(s[0]);
        for(int i=1;i<length;i++)
        {
            if(s[i].equals("+"))
            {
                sum+=map.get(s[i+1]);
                i++;
            }
            else if(s[i].equals("-"))
            {
                sum-=map.get(s[i+1]);
                i++;
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Map<String,Integer> map=new TreeMap<>();
        boolean flag=false;
        while(cin.hasNext()) {
            String s=cin.nextLine();
            String[] t = s.trim().split(" ");
            if (t[0].equals("%%%"))
            {
                flag=true;
                continue;
            }
            if(!flag)
            {
                map.put(t[0],Integer.parseInt(t[2]));
            }
            else
            {
                if(s.contains("*"))
                {
                    String m[]=new String[t.length];
                    int j=0; ;
                    for(int i=0;i<t.length;i++)
                    {
                        if(!t[i].equals("*"))
                        {
                            m[j++]=t[i];
                        }
                        else
                        {

                            Integer k=map.get(m[j-1])*map.get(t[i+1]);
                            m[j-1]=String.valueOf(k);
                            map.put(m[j-1],k);
                            i++;
                        }
                    }
                    Sum(map,m,j);
                }
                else
                    Sum(map,t,t.length);
            }
        }
    }
}