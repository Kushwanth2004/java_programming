import java.util.*;
public class pattern {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n*n];
        int index=0;
        for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++){
                arr[index]=i;
                index++;
            }
        }
        int arrIndex=0;
        for(int i=1;i<=n;i++){
            for(int j=0;j<arr[arrIndex];j++){
                System.out.print(i+" ");
            }
            arrIndex++;
        }
        sc.close();

    }
}