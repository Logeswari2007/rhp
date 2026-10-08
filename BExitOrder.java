import java.util.*;
public class BExitOrder{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int start=1,end=10;
        for(int ctr=1;ctr<n+1;ctr++){
            int curr=sc.nextInt();
            if(!(curr>=start && curr<=end)){
                System.out.println("No");
                return;
            }
            if(ctr%10==0){
                start+=10;
                end+=10;
            }
        }
        System.out.println("Yes");
        sc.close();
    }
}