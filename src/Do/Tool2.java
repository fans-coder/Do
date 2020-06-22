package Do;
import java.sql.*;
import static MD5Tool.md5.getMD5;

public class Tool2 {
    final static String url="jdbc:mysql://localhost:3306/db";
    static Connection con=null;
    static Statement stmt=null;
    private static final String user="root";
    private static final String pw="xb18365594667";

    static {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,user,pw);
            stmt=con.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        System.err.println(login("li","666"));
        //System.err.println(login("qian","123"));
        //System.err.println(login("fu","123"));
        //updatePassword("li","666","789");
        System.err.println(login("li","789"));
        register("ming","000");
        System.err.println(login("ming","000"));
        //System.err.println(login("fu","123"));
        //System.err.println(login("fu","222"));
        //("li","666");
    }
    private static boolean updatePassword(String name,String pass1,String pass2){
        if(!login(name,pass1)){
            System.err.println("初始密码错误");
            return false;
        }
        String sql=String.format("update users set users_pw='%s' where users_name='%s'",getMD5(pass2),name);
        System.err.println(sql);
        boolean result=executeUpdate(sql);
        if(result){
            System.err.println("修改密码成功");
        }else {
            System.err.println("修改密码失败");
        }
        return result;
    }

    public static boolean login(String name, String pass){
        String sql=String.format("select 1 from users where users_name='%s' and users_pw='%s'",name, getMD5(pass));
        System.err.println(sql);
        boolean result=executeQuery(sql);
        if(result){
            System.err.println("登录成功，user="+name+",pass="+pass);
        }else {
            System.err.println("登录失败，user="+name+",pass="+pass);
        }
              return result;
    }
    private static boolean register(String name ,String pass){
        String sql=String.format("select 1 from users where users_name='%s'",name);
        System.err.println(sql);
        if(executeQuery(sql)){
            System.out.println("该用户已经存在 name="+name);
            return false;
        }
        sql="INSERT INTO users(users_name,users_pw) value('"+name+"','"+getMD5(pass)+"')";
        System.err.println(sql);
        boolean result=executeUpdate(sql);
        if(result){
            System.err.println("注册成功，user="+name+",pass="+pass);
        }else {
            System.err.println("注册失败，user="+name+",pass="+pass);
        }
        return result;
    }

    private static boolean executeQuery(String sql) {
        try{
            ResultSet rs=stmt.executeQuery(sql);
            if(rs.next()){
                return true;
            }return false;
        }catch (SQLException e){
            return false;
        }
    }

    private static boolean executeUpdate(String sql) {
    try {
        int rs=stmt.executeUpdate(sql);
        if (rs>=1){
            return true;
        }return false;
    }catch (SQLException e){
        return false;
    }
    }

}
