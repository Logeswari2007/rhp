import java.util.*;

public class DSignsofPrefixSums {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int tc=sc.nextInt();
        while(tc--!=0){
            int n=sc.nextInt();
            sc.nextLine();
        String s=sc.next();
        if(s.charAt(0)=='0' || s.contains("00")){
            System.out.println("-1");
            continue;
        }
        int ans=-1;
        if(s.contains("+-") || s.contains("-+")){
            if(s.contains("-++-") || s.contains("+--+")){
            //System.out.println(3);
            ans=3;
            }
            else{
                //System.out.println(2);
                ans=2;
            }
        }else{
            ans=1;
            for(int i=0;i<n;i+=2){
                if(s.charAt(i)=='0'){
                    ans=2;
                    break;
                }
            }
            }
            System.out.println(ans);
        }
        sc.close();
        
    }
}
