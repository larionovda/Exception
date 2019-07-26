package codingBat;

public class DelDel {
    public static String delDel(String str) {
        String res = "";
        if ("del".regionMatches(0,str,1,3)) {
            res += str.charAt(0) + str.substring(4, str.length());
        } else {
            return str;
        }
        return res;
    }
}
