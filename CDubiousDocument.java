import java .util.*;
public class CDubiousDocument {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    sc.nextLine();
    int common[]=new int[26]; // common alphabets count... in evey string in that minimum;
    Arrays.fill(common,50);// the maximum count of alphabets...
    for(int i=0;i<n;i++){
        String s=sc.next();
        int curr[]=new int[26];
        for(char ch: s.toCharArray()){
            curr[ch-'a']++; // it counts the char count from the string...
        }
        for(int j=0;j<26;j++){
            common[j]=Math.min(common[j],curr[j]); // return  min count of char in the string..
        }
        }
        for(int i=0;i<26;i++){
            while(common[i]-->0){ // it prints the char if a count is 3 
            // then print a 3 times and leave the while then go to the next char and so on
            System.out.print((char)('a'+i));
            }
        }
        sc.close();
}
    
}