package Do;
import java.util.Collections;
import java.util.HashMap;

public class Tools {
    static HashMap<String,String> users=new HashMap<String,String>();

  public static boolean register(String name,String pass1,String pass2) {
    if (!users.containsKey(name)&&pass1.equals(pass2)) {
        users.put(name,pass1);
        System.err.println("注册成功");
        return true;
    }
    else{
        System.err.println("注册失败，请重新注册");
        return false;
    }
}
    public static void main(String []args){
        users.put("Tom","123");
        users.put("HHH","1234");
        users.put("admin","666");
        register("Tom","123456","123456");
        register("Cat","123","123");
        update("Tom","123456","123");
        login("Tom","123456");
        login("Tom","123");
        update("Tom","123456","123");
        login("Cat","123");
        deletedate("Cat");
        login("Cat","123");
    }

    public static boolean deletedate(String name) {
        if (users.containsKey(name)){
            users.remove(name,users.get(name));
            System.err.println("删除用户成功");
            return true;
        }
        else {
            System.err.println("该用户不存在");
        }
        return false;
    }

    public static boolean login(String name, String password) {
        if(users.containsKey(name)&&users.get(name).equals(password)){
            System.err.println("登录成功");
            return true;
        }else {
            System.err.println("登录失败，请重新输入");
        }return false;
    }

    public static boolean update(String name, String oldpass, String newpass) {
        if(users.containsKey(name)&&login(name,oldpass)){
             users.put(name,newpass);
             return true;
        }else {
            System.err.println("账户错误，请重新登录");
        }
        return false;
    }


}
