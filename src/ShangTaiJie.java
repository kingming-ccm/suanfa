/**
 * 走台阶，每次只能走一步或者是2步，上到某个台阶有多少种上法
 */
public class ShangTaiJie {
    public static void main(String[] args) {
        System.out.println(step(5));
    }

    public static int step(int s){
        if (s == 1) return 1;
        if (s == 2) return 2;
        return step(s-1) + step(s-2);
    }
}
