package bean.e02;

public class Mytools {
    public static String change(String str){
        str=str.replace("<","&lt");
        str=str.replace(">","&gt");
        return str;
    }
}
