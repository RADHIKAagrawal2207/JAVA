import java.util.*;
public class AssignCookies{
    class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int c = s.length - 1;
        int i = g.length - 1;
        int result = 0;
        while(c >= 0 && i >= 0){
            if(g[i] <= s[c]){
                result++;
                c--;
            }
            i--;
        }
        return result;
    }
}
}


// input - g=[1,2,3] , s=[1,1]
// output=1