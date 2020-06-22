import java.util.*;

public class ac1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int row = 0;
        int length = 0;
        int wide = 0;
        int code = 0;
        row = input.nextInt(); //总共有几组

        int[][][] rect = new int[row][][];
        for(int index = 0; index < row; index++)
        {
            int num = input.nextInt(); //每一组有多少长方形
            rect[index] = new  int[num][3];
            for(int i = 0; i < num; i++) //输入一组长方形的数据
            {
                code = input.nextInt();
                int a = input.nextInt();
                int b = input.nextInt();
                if(a > b)
                {
                    length = a;
                    wide = b;
                }
                else
                {
                    length = b;
                    wide = a;
                }
                rect[index][i][0] = code;
                rect[index][i][1] = length;
                rect[index][i][2] = wide;


            }
        }

        rectsort(rect);

    }
    public static int[][][] rectsort(int a[][][])
    {
        for(int i  = 0; i < a.length; i++ )
        {
            for(int i1 = 0; i1 < a[i].length; i1++)
            {
                int[][] temp = new int[1][3];
                for(int i2 = i1+1; i2 < a[i].length; i2++)
                {
                    if(a[i][i1][0] > a[i][i2][0])
                    {
                        temp[0] = a[i][i1];
                        a[i][i1] = a[i][i2];
                        a[i][i2] = temp[0];
                    }
                    else if(a[i][i1][0] == a[i][i2][0])
                    {
                        if(a[i][i1][1] > a[i][i2][1])
                        {
                            temp[0] = a[i][i1];
                            a[i][i1] = a[i][i2];
                            a[i][i2] = temp[0];
                        }
                        else if(a[i][i1][1] == a[i][i2][1])
                        {
                            if(a[i][i1][2] > a[i][i2][2])
                            {
                                temp[0] = a[i][i1];
                                a[i][i1] = a[i][i2];
                                a[i][i2] = temp[0];
                            }
                            else if (a[i][i1][2] == a[i][i2][2])
                            {
                                a[i][i1][0] = 0;
                                a[i][i1][1] = 0;
                                a[i][i1][2] = 0;
                            }
                        }
                    }
                }

            }
        }
        for(int i  = 0; i < a.length; i++ )
        {
            for(int i1 = 0; i1 < a[i].length; i1++)
            {
                if(!(a[i][i1][0] == 0))
                {
                    System.out.print(a[i][i1][0] + " ");
                    System.out.print(a[i][i1][1] + " ");
                    System.out.println(a[i][i1][2]);
                }
            }
        }
        return a;
    }


}