package MD5Tool;
import java.security.MessageDigest;
public class md5 {
    public static String getMD5(String url){
        String result="url";
        try {
            MessageDigest md= MessageDigest.getInstance("MD5");
            md.update(url.getBytes());
            byte[] bytes=md.digest();
            StringBuilder sb=new StringBuilder();
            for(byte b:bytes){
                String str=Integer.toHexString(b& 0xFF);
                if(str.length()==1){
                    sb.append("0");
                }
                sb.append(str);
            }
            result=sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
public static void main(String [] args){
        System.err.println(getMD5("666"));
}
}
