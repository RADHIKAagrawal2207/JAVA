import java.util.*;
class Pascal_triangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ls=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            ls.add(pas(i));
        }
        return ls;
    }
    public List<Integer> pas(int n){
        int ans=1;
        List<Integer> row=new ArrayList<Integer>();
        row.add(1);
        for(int i=1;i<n;i++){
            ans=ans*(n-i);
            ans=ans/i;
            row.add(ans);
        }
        return row;
    }
}