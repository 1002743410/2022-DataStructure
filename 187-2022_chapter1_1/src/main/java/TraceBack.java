import java.util.HashSet;

public class TraceBack {
    HashSet<HashSet<Integer>> hashSet=new HashSet<>();
    int i,j;
    public HashSet<HashSet<Integer>> traceBack(int n, int k) {
//        please enter your code here...
        for(int i=n;i>=k;i--){
            a[r]=i;
            if(r>1)
                f(i-1,r-1);
            else{
                for(int j=a[0];j>=1;j--){
                    System.out.print(a[j]+" ");
                }
                System.out.println();
            }
        }
    }
        if (k == 0) {
            return hashSet;
        }
        i=n;
        for (;i>=k;i--) {
            hashSet.add(new HashSet<Integer>() {{
                add(i);
            }});
        }
        return traceBack(n - 1, k - 1);
    }
}
