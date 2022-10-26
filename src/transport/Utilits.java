package transport;

public class Utilits {
    public static String checkValidStringOrDefault(String str, String defaultStr){
        if (str!=null&&!str.isBlank()&&!str.isEmpty()){
            return str;
        }
    else {
        return defaultStr;}}

}
