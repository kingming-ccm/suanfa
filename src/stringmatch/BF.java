package stringmatch;

/**
 * Brute Force 暴力匹配
 */
public class BF {
    public static void main(String[] args) {
        String org = "I love you so much ting ting ting";
        String match = "ting";
        System.out.println(bfMatch(org,match));
    }

    public static int bfMatch(String org,String match){
        int count = 0;
        char[] orgChars = org.toCharArray();
        char[] matchChars = match.toCharArray();
        //长度为n的主串和长度为n的模式串可以分成 n-m+1个子串,然后分别去校验每个字段是否满足
        for(int i = 0; i < orgChars.length - matchChars.length + 1; i++){
           boolean isMatch = true;
           for(int j = 0; j < matchChars.length; j++){
               if(orgChars[i+j] != matchChars[j]){
                   isMatch = false;
                   break;
               }
           }
           if (isMatch)
               count++;
        }
        return count;
    }
}
