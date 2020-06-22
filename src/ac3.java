import java.util.*;
public class ac3{
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        String str1=cin.next(),str2=cin.next();
        int m=str1.length(),n=str2.length();
        int [][]dp=new  int [m+1][n+1];
        for(int i = 1;i<=m;i++)
            dp[i][0] = i;
        for(int j = 1;j<=n;j++)
            dp[0][j] = j;
        for(int i = 1;i<=m;i++)
            for(int j = 1;j<=n;j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.min(dp[i-1][j-1], Math.min(dp[i][j-1], dp[i-1][j])) + 1;
                }
            }
        System.out.println(dp[m][n]);
        cin.close();
    }
}