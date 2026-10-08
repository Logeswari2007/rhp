import java.util.*;
public class DOutWeight {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    int b[]=new int[n];
    for(int i=0;i<n;i++) a[i]=sc.nextInt();
    for(int i=0;i<n;i++) b[i]=sc.nextInt();
    int amore=0,bmore=0;
    for(int i=0;i<n;i++){
        if(a[i]>b[i]) amore+=(a[i]-b[i]);
        else if(b[i]>a[i]) bmore+=(b[i]-a[i]);
    }
    if(amore==0){
        System.out.println("No");
        return;
    }
    long amoreweight=(bmore/amore)+2;
    long ans[]=new long[n];
    for(int i=0;i<n;i++){
        if(a[i]<=b[i]) ans[i]=1;
        else{
            ans[i]=amoreweight;
        }
    }
    System.out.println("Yes");
    for(long temp:ans){
        System.out.print(temp+" ");
    }
    System.out.println();
    sc.close();

}
    
}
