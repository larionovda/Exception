package codingBat;

public class Max1020 {
    public static int max1020(int a, int b){
        if ((a >= 10 && a <= 20) && (b >= 10 && b <= 20)){
            return Math.max(a,b);
        } else if (a >= 10 && a <= 20){
            return a;
        } else if (b >= 10 && b <= 20){
            return b;
        } else {
            return 0;
        }
    }
}
