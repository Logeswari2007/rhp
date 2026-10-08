import java.util.*;

public class BMonocarpAndProjects {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc--!=0){
            long x=sc.nextLong();
            long y=sc.nextLong();
            long k=sc.nextLong();
            long ctr=0,ans=0;
            while(ctr<k){
                long rem=(y+ctr)%(x+ctr);
                if(rem==(y-x)) break;
                ans+=rem;
                ctr++;
            }
            if(k>ctr){
                ans+=(k-ctr)*(y-x);
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
