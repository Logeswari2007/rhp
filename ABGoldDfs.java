/*
Problem Title: Gold Rush Maze
Problem StatementYou are given a 2D grid of size R × C. 
The grid contains characters representing a map with different entities:
'A': Starting position of Player A.
'B': Starting position of Player B.
'G': The location of a gold treasure.
'0': Open pathways that players can walk through.
'1': Solid walls that block movement.Both players want to find out if they can reach the gold ('G'). 
They can only move in four directions: up, down, left, and right. 
They cannot step on walls ('1'), and they cannot move outside the boundaries of the grid.Write a program to determine which players can successfully find a path from their starting position to the gold treasure.
Input FormatThe first line contains two space-separated integers, R and C, representing the rows and columns of the grid.
The next R lines contain C space-separated characters representing the layout of the grid.
Output FormatPrint a single string based on the following conditions:Print "BOTH" if both Player A and Player B can reach the gold.Print "A" if only Player A can reach the gold.
Print "B" if only Player B can reach the gold.Print "NONE" if neither player can reach the gold. 


eg:
i/p
6 7
A 0 0 0 0 1 1
0 0 0 0 0 0 0 
1 0 0 0 0 0 1
1 0 0 G 0 1 1
0 0 0 0 0 0 0
0 0 0 0 0 1 B
o/p:
BOTH

*/
import java.util.*;
public class ABGoldDfs {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int R=sc.nextInt(),C=sc.nextInt();
        char[][] ch=new char[R][C];
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                String curr=sc.next();
                ch[i][j]=curr.charAt(0);
            }
        }
        boolean forA=false,forB=false;
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if(ch[i][j]=='A'){
                     char[][] copyForA = cloneGrid(ch, R, C);
                    forA=dfs(copyForA,i,j,R,C);
                    
                }
            }
        }
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if(ch[i][j]=='B'){
                     char[][] copyForB = cloneGrid(ch, R, C);
                    forB=dfs(copyForB,i,j,R,C);
                    
                }
            }
        }
        if(forA && forB){
            System.out.println("BOTH");
        }
       else if(forA){
            System.out.println("A");
        }
        else if(forB){
            System.out.println("B");
        }
        else{
            System.out.println("NONE");
        }
        sc.close();
    }
    public static final int diff[]={0,1,0,-1,0};
    public static boolean dfs(char[][] ch,int r,int c, int R , int C){
        char backup=ch[r][c];
        if(ch[r][c]=='G') return true;
        ch[r][c]='1';
        for(int i=0;i<4;i++){
            int ar=r+diff[i],ac=c+diff[i+1];
            if(ar>=0 && ar<R && ac>=0 && ac<C && (ch[ar][ac]=='0' || ch[ar][ac]=='G')){
                if(dfs(ch,ar,ac,R,C)){
                    return true;
                }
                
            }

        }
        ch[r][c]=backup;
        return false;
    }
    private static char[][] cloneGrid(char[][] original, int R, int C) {
        char[][] copy = new char[R][C];
        for (int i = 0; i < R; i++) {
            System.arraycopy(original[i], 0, copy[i], 0, C);
        }
        return copy;
    }
}
