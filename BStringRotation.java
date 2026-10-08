import java.util.*;
public class BStringRotation{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();
        StringBuilder sb=new StringBuilder(t);
        sb.append(t);
        System.out.println(sb.indexOf(s)!=-1? "Yes" : "No");
        sc.close();
    }

}