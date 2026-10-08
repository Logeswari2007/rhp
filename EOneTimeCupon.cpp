import java.util.*;
public class EOneTimeCupon {
    public static void main(Strings[] args){
        Scanner sc=new Scanner(System.out);
        int tc=sc.nextInt();
        while(tc--!=0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            for(int i=0;i<n;i++) a[i]=sc.nextInt();
            for(int i=0;i<n;i++) b[i]=sc.nextInt();
            int diff[]=new int[n];
            for(int i=0;i<n;i++){
                diff[i]=Math.abs(a[i]-b[i]);
            }
            
        }
    }
}
