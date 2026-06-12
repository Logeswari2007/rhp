import java.util.*;

public class Main{
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    
    int shari[] = new int[n];
    int neta[] = new int[m];
    
    for(int i=0;i<n;i++){
      shari[i] = sc.nextInt();
    }
    
    for(int i=0;i<m;i++){
      neta[i] = sc.nextInt();
    }
    
    Arrays.sort(shari);
    Arrays.sort(neta);
    
    int i=n-1, j=m-1, count=0;
    while(i>=0 && j>=0){
      if(shari[i]*2 >= neta[j]){
        count++;
        i--;
        j--;
      }
      else{
        j--;
      }
    }
    System.out.println(count);
  }
}