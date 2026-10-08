import java.util.*;

public class BMinusTwo {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc--!=0){
            int n=sc.nextInt();
           int odd=0,evenodd=0,eveneven=0;
            for(int i=0;i<n;i++){
                int curr=sc.nextInt();
              
                if((curr%2)!=0) odd++;
                else{
                    int q=curr/2;
                    if((q & 1)!=0) evenodd++;
                    else eveneven++;
                }

                
            }
            System.out.println(Math.max(odd,Math.max(eveneven,evenodd)));
        }
        sc.close();
    }
}
