package ruoob;
import java.util.*;
public class lesslength {
    public static void main(String[] args) {
        //字符串word1和word2分别是要进行对比的两个字符串
        Scanner cin=new Scanner(System.in);
        String word1=cin.nextLine();
        String word2=cin.nextLine();
        //在本类中调用本类的静态方法minimumEditDistance(...)故不需在方法前加类名或创建类对象
        //输出字符串word1和word2互相转换的最小编辑距离
        System.out.println(minimumEditDistance(word1,word2));
    }
    //注意此方法是静态方法，这样在本类的main方法中可直接用本方法名调用本方法，而不需要创建对象再调用此方法
    //本方法的形式参数word1和word2分别是要进行对比的两个字符串，最后返回的是int型的两个字符串互相转换的最小编辑距离
    public static int minimumEditDistance(String word1,String word2){
        //新建一个二维数组，用于存取两字符串的各个子字符串之间的最短编辑距离
        //其中新建的二维数组的行列都+1是因为最短编辑距离的矩阵的子字符串从空串""开始，把空串""考虑进去，因此行列都+1
        int[][] minMatrix=new int[word1.length()+1][word2.length()+1];
        //minMatrix[i][j]表示：字符串word1的第0到第i-1个字符构成的子字符串 与 字符串word2的第0到第j-1个字符构成的子字符串 互相转换的最小编辑距离
        //例如word1="legend"而word2="laland"，那么minMatrix[2][3]的结果是2，其表示 字符串word1的第0到第1个字符构成的子字符串"le" 与 字符串word2的第0到第2个字符构成的子字符串"lal" 互相转换的最小编辑距离为2

        //当word2的子字符串是空串""时，而当word1的子字符串分别是：空串""、第0个字符、第0到第1个字符、第0到第2个字符...第0到第i-1个字符构成的子字符串时，
        //minMatrix[i][0]表示该两个子字符串互相转换的最小编辑距离
        for (int i = 0; i < word1.length(); i++) {
            minMatrix[i][0]=i;
        }
        //当word1的子字符串是空串""时，而当word2的子字符串分别是：空串""、第0个字符、第0到第1个字符、第0到第2个字符...第0到第j-1个字符构成的子字符串时，
        //minMatrix[0][j]表示该两个子字符串互相转换的最小编辑距离
        for (int j = 0; j < word2.length(); j++) {
            minMatrix[0][j]=j;
        }
        //建一个二层循环嵌套，分别比较并计算word1和word2的子字符串都不是空串""时互相转换的最小编辑距离
        for (int i = 1; i < word1.length()+1; i++) {
            for (int j = 1; j < word2.length()+1; j++) {
                //word1.charAt(i-1)方法指字符串word1的第i个字符，而第i个字符的数组下标是i-1
                //若某两个子字符串的最后一个字符相同，那么此时此两个子字符串的最短编辑距离等价于：没有最后一个相同字符的两个子字符串互相转换的最短编辑距离
                //例如"lalan"和"legen"的最后一个字符都是"n"，则 "lalan"和"legen"的最小编辑距离 等于 "lala"和"lege"的最小编辑距离
                if (word1.charAt(i-1)==word2.charAt(j-1)){
                    minMatrix[i][j]=minMatrix[i-1][j-1];
                }
                //若某两个子字符串的最后一个字符不相同，那么此时此两个子字符串的最短编辑距离等价于：minMatrix[i-1][j]和minMatrix[i][j-1]和minMatrix[i-1][j-1]之间的最小值，再+1
                //最后+1是因为最后一个字符不相同。若是minMatrix[i-1][j-1]+1，则是某两个子字符串的最后两个不同字符进行1次替换字符操作，从而让该两字符相同；
                //若是minMatrix[i-1][j]+1或minMatrix[i][j-1]+1，则是某两个子字符串的两个不同字符进行1次插入/删除字符操作；
                else{
                    minMatrix[i][j]=(Math.min((Math.min(minMatrix[i-1][j],minMatrix[i][j-1])),minMatrix[i-1][j-1]))+1;
                }
            }
        }
        //最后返回的是int型的两个字符串互相转换的最小编辑距离，该值是行列分别是word1和word2的长度的二维数组minMatrix的元素值
        return minMatrix[word1.length()][word2.length()];
    }
}
