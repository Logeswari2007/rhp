import java.util.*;

public class AMooLanguageSchool {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc--!=0){
            int n=sc.nextInt();
            int k=sc.nextInt();
             // FIX: Consume the dangling newline character left over by nextInt()
            sc.nextLine();
            String s=sc.nextLine();
            int F=n/k;
            boolean arr[]=new boolean[F];
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='0'){
                    int f=i/k;
                    arr[f]=true;
                }
            }
        
        int c=0;
        for(int i=0;i<F;i++){
            if(!arr[i]) c++;
        }
        System.out.println(c);
        
        }
        sc.close();
    }
}
