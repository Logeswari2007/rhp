import java.util.*;
public class AMonocrapContest{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc--!=0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            int onecount=0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                onecount+=arr[i];
            }
            int zerocount=n-onecount;
            if(zerocount<2){
                System.out.println("-1");
                continue;
            }
            int ans=0;
            if(arr[0]!=0) ans++;
            if(arr[n-1]!=0) ans++;
            System.out.println(ans); 
            sc.close();
    }
}}
