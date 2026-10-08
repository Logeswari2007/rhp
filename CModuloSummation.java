import java.util.*;
public class CModuloSummation{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
            int curr=sc.nextInt();
            sum+=(curr-1);
        }
        System.out.println(sum);
        sc.close();
    }
}