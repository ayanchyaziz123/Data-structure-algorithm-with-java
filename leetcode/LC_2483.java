import java.util.ArrayList;
public class LC_2483 {

    public static int bestClosingTime(String c) {
        int n = c.length();
        ArrayList<Integer> arr = new ArrayList<Integer>(n);
        // cost of top right index cost
        // if y = max - 1
        // if n = max + 1
        // 
        int cst = 0;
            for(int i =0; i < n; i++)
            {
                if(c.charAt(i) == 'Y')
                {
                    cst++;
                }
                arr.add(cst);
            }
        
        int mx = arr.get(n - 1);
        int ans = mx;
        int ret = 0;
        for(int i = 0; i < n; i++)
        {
            if(c.charAt(i) == 'Y')
            {
                mx = mx - 1;
                if(mx < ans)
                {
                    ans = mx;
                    ret = i + 1;
                    
                }
            }
            else{
                mx = mx + 1;
            }
        }
        return ret;
            
        
    }
    public static void main(String[] args)
    {
        System.out.println(bestClosingTime("YYNY"));
        System.out.println(bestClosingTime("YYYY"));
        System.out.println(bestClosingTime("NNN"));
    }
}