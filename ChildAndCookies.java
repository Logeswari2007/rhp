/*A group of children is waiting to receive cookies. Each child has a greed factor that represents the minimum cookie size required to satisfy that child. Each cookie has a size.

A child can be assigned at most one cookie, and a cookie can be assigned to at most one child.
A child is satisfied if the size of the assigned cookie is greater than or equal to the child's greed factor.


Your task is to determine the maximum number of children that can be satisfied. Use a Greedy Approach to assign cookies efficiently and maximize the number of satisfied children.



Input Format:

The first line contains an integer 
, representing the number of children.
The second line contains 
 space-separated integers representing the greed factors of the children.
The third line contains an integer 
, representing the number of available cookies.
The fourth line contains 
 space-separated integers representing the sizes of the cookies.


Output Format:

Print a single integer representing the maximum number of children that can be satisfied.


Constraints:



Sample Test Case:

Input:

3
1 2 3
2
1 1
Output:

1
Explanation:

Child 1 requires a cookie of size at least 1 and receives a cookie of size 1.
Child 2 requires a cookie of size at least 2, but no suitable cookie remains.
Child 3 requires a cookie of size at least 3, but no suitable cookie remains.
Therefore, only 1 child can be satisfied. */
import java.util.*;
public class ChildAndCookies {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int cn=sc.nextInt();
        int ch[]=new int[cn];
        for(int i=0;i<cn;i++){
            ch[i]=sc.nextInt();
        }
        int con=sc.nextInt();
        int cook[]=new int[con];
        for(int i=0;i<con;i++){
            cook[i]=sc.nextInt();
        }
        Arrays.sort(ch);
        Arrays.sort(cook);
        int child=0,cookie=0;
        while(child<cn && cookie<con){
            if(cook[cookie]>=ch[child]){
                child+=1;
            }
            cookie+=1;
        }
        System.out.println(child);
        sc.close();
    }
}
