/*You are given a sequence of length 
, where each position contains either a Cat ('C') or a Mouse ('M'). A cat can catch a mouse, subject to the following rules:

Each cat can catch at most one mouse.
Each mouse can be caught by at most one cat.
A cat can catch a mouse only if the distance between them is at most 
 positions.
The distance between positions 
 and 
 is defined as: 


Your task is to determine the maximum number of mice that can be caught. Use a Greedy Approach to maximize the number of successful catches.



Input Format:

1. The first line contains an integer 
, representing the length of the sequence.

2. The second line contains 
 space-separated characters, each being either:

'C' representing a Cat
'M' representing a Mouse
3. The third line contains an integer 
, representing the maximum distance within which a cat can catch a mouse.



Output Format:

Print a single integer representing the maximum number of mice that can be caught.


Constraints:



Each element is either 'C' or 'M′



Sample Input:

5
C M M C M
1
Sample Output

2
Explanation

The sequence is:

C M M C M
The cat at position 0 catches the mouse at position 1.
The cat at position 3 catches the mouse at position 2 or position 4.
Therefore, the maximum number of mice that can be caught is:

2 */

import java.util.*;
public class MiceAndCat{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
     char[] ch=new char[n];
    for(int i=0;i<n;i++){
        String s=sc.next();
        ch[i]=s.charAt(0);
    }
    int d=sc.nextInt();
    ArrayList<Integer> cats=new ArrayList<>();
    ArrayList<Integer> mice=new ArrayList<>();
    for(int i=0;i<n;i++){
        if(ch[i]=='M'){
            mice.add(i);
        }else{
            cats.add(i);
        }
    }
    int midx=0,caught=0;
    for(int c:cats){
        while(midx<mice.size() && mice.get(midx)<c-d){
            midx++;
        }
        if(midx<mice.size() && mice.get(midx)<=c+d){
            midx++;
            caught++;
        }
    }
    System.out.println(caught);
    sc.close();
    
}
}
return 0;
}