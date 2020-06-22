import java.util.*;
public class ac4_2
{
    public static void main (String[] args)
    {
        Scanner cin=new Scanner(System.in);
        Map<Integer,Integer> map=new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        int N=cin.nextInt(),M=cin.nextInt();
        for(int i=0;i<M+N;i++)
        {
            int a=cin.nextInt(),b=cin.nextInt();
            map.put(b,map.containsKey(b)?map.get(b)+a:a);
        }
        //System.out.println(Arrays.toString(new Set[]{map.keySet()}));
        for(Integer m:map.keySet())
        {
            if(map.get(m)!=0)
                System.out.println(map.get(m)+" "+m);
        }
    }
}