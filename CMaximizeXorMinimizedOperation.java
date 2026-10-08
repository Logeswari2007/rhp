import java.util.*;

public class CMaximizeXorMinimizedOperation {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc--!=0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int s=x+y,rx=0,ry=0;
            for(int shift=30; shift>=0; shift--){
                if((s & (1<<shift))!=0){
                    if((rx | (1<<shift))<=x){
                        rx=rx| (1<<shift);
                    }else{
                        ry=ry |(1<<shift);
                    }
                }
            }
            System.out.println(s+" "+(x-rx));
            

        }
        sc.close();
    }
}
