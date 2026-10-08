import java.util.*;
public class c101 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc--!=0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++) arr[i]=sc.nextInt();
            int lt=0,rt=n-1;
            while(lt<n && arr[lt]==0) lt++; //to find the left 1 or -1
            while(rt>=0 && arr[rt]==0) rt--; // to find right side 1 or -1
            if(lt<=rt){
                for(int i=lt+1;i<rt;i++){
                    if(arr[i]==-1) arr[i]=0; //making the in between -1 into 0
                    
                }
                arr[lt]=arr[rt]=1; // if lt and rt -1 or 1 change into 1;
            }
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();

        }
        sc.close();
    }
}
