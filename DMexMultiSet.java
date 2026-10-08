import java.util.*;
public class DMexMultiSet {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc--!=0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            List<Integer> zi=new ArrayList<>();
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(arr[i]==0){
                    zi.add(i);
                }
            }
            if(zi.size()==1){
             System.out.println("No");
             continue;
            }
            char s[]=new char[n];
            Arrays.fill(s,'C');
            if(zi.size()>0){
                s[zi.get(0)]='B';
                for(int i=1;i<zi.size();i++){
                    s[zi.get(i)]='A';
                }
            }
            System.out.println("Yes"+"\n"+String.valueOf(s));
        }
        sc.close();
    }
}
