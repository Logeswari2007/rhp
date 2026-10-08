import java.util.*;
public class MinHeap {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int heap[]=new int[n+1];
        for(int i=0;i<n;i++){
            heap[i]=sc.nextInt();
        }
        int newValue=sc.nextInt();
        heap[n]=newValue;
        int i=n;
        while(i>0){
            int parent=(i-1)/2;
            if(heap[i]<heap[parent]){
                int temp=heap[i];
                heap[i]=heap[parent];
                heap[parent]=temp;
                i=parent;
            }
            else{
                break;
            }
        }
        for(int j=0;j<n;j++){
            System.out.print(heap[j]);
        }
        sc.close();
    }
}
